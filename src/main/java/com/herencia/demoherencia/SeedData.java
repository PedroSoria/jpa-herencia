package com.herencia.demoherencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.herencia.demoherencia.entities.OtherAttributes1;
import com.herencia.demoherencia.entities.OtherUser1;
import com.herencia.demoherencia.entities.User;
import com.herencia.demoherencia.repository.OtherAttributes1Repository;
import com.herencia.demoherencia.repository.OtherUser1Repository;
import com.herencia.demoherencia.repository.UserRepository;

import jakarta.transaction.Transactional;
// import lombok.RequiredArgsConstructor;

@Component
// @RequiredArgsConstructor
public class SeedData implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    OtherUser1Repository otherUserRepository;
    @Autowired
    OtherAttributes1Repository otherAttributeRepository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User();
        user1.setEmail("fds@fds.com");
        user1.setPassword("123");

        OtherUser1 otherUser1 = new OtherUser1();
        otherUser1.setEmail("fsssds@fdsss.com");
        otherUser1.setPassword("123");

        OtherAttributes1 otherAttribute = new OtherAttributes1();
        otherAttribute.setOtherAttributeName1("dsffds");
        otherAttribute.setOtherAttributeName2("null");
        otherAttribute.setOtherAttributeName3("3");
        otherAttribute.setOtherUser1(otherUser1);

        otherAttributeRepository.save(otherAttribute);
        userRepository.save(user1);
        otherUserRepository.save(otherUser1);

    }

}