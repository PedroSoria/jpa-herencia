package com.herencia.demoherencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.herencia.demoherencia.entities.OtherAttribute;
import com.herencia.demoherencia.entities.OtherUser;
import com.herencia.demoherencia.entities.User;
import com.herencia.demoherencia.repository.OtherAttributeRepository;
import com.herencia.demoherencia.repository.OtherUserRepository;
import com.herencia.demoherencia.repository.UserRepository;

import jakarta.transaction.Transactional;
// import lombok.RequiredArgsConstructor;

@Component
// @RequiredArgsConstructor
public class SeedData implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    OtherUserRepository otherUserRepository;
    @Autowired
    OtherAttributeRepository otherAttributeRepository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User();
        user1.setEmail("fds@fds.com");
        user1.setPassword("123");

        OtherAttribute otherAttribute = new OtherAttribute();
        otherAttribute.setOtherAttributeName("dsffds");

        OtherUser otherUser1 = new OtherUser();
        otherUser1.setEmail("fsssds@fdsss.com");
        otherUser1.setPassword("123");
        otherUser1.setOtherAttribute(otherAttribute);

        otherAttributeRepository.save(otherAttribute);
        userRepository.save(user1);
        otherUserRepository.save(otherUser1);

    }

}