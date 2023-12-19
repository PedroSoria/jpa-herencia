package com.herencia.demoherencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.herencia.demoherencia.entities.OtherAttributes1;
import com.herencia.demoherencia.entities.OtherAttributes2;
import com.herencia.demoherencia.entities.OtherUser1;
import com.herencia.demoherencia.entities.OtherUser2;
import com.herencia.demoherencia.entities.User;
import com.herencia.demoherencia.repository.OtherAttributes1Repository;
import com.herencia.demoherencia.repository.OtherAttributes2Repository;
import com.herencia.demoherencia.repository.OtherUser1Repository;
import com.herencia.demoherencia.repository.OtherUser2Repository;
import com.herencia.demoherencia.repository.UserRepository;

import jakarta.transaction.Transactional;
// import lombok.RequiredArgsConstructor;

@Component
// @RequiredArgsConstructor
public class SeedData implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    OtherUser1Repository otherUserRepository1;
    @Autowired
    OtherAttributes1Repository otherAttributeRepository1;
    @Autowired
    OtherUser2Repository otherUserRepository2;
    @Autowired
    OtherAttributes2Repository otherAttributeRepository2;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User();
        user1.setEmail("fds@fds.com");
        user1.setPassword("123");

        OtherUser1 otherUser1 = new OtherUser1();
        otherUser1.setEmail("fsssds@fdsss.com");
        otherUser1.setPassword("123");

        OtherAttributes1 otherAttribute1 = new OtherAttributes1();
        otherAttribute1.setOtherAttributeName1("otherUser1");
        otherAttribute1.setOtherAttributeName2("otherUser1");
        otherAttribute1.setOtherAttributeName3("otherUser1");
        otherAttribute1.setOtherUser1(otherUser1);

        OtherUser2 otherUser2 = new OtherUser2();
        otherUser2.setEmail("fsaaassds@fdsasas.com");
        otherUser2.setPassword("123");

        OtherAttributes1 otherAttribute11 = new OtherAttributes1();
        otherAttribute11.setOtherAttributeName1("otherUser2");
        otherAttribute11.setOtherAttributeName2("otherUser2");
        otherAttribute11.setOtherAttributeName3("otherUser2");
        otherAttribute11.setOtherUser1(otherUser2);

        OtherAttributes2 otherAttribute2 = new OtherAttributes2();
        otherAttribute2.setOtherAttributeName4("otherUser2");
        otherAttribute2.setOtherAttributeName5("otherUser2");
        otherAttribute2.setOtherAttributeName6("otherUser2");
        otherAttribute2.setOtherUser2(otherUser2);

        otherAttributeRepository1.save(otherAttribute1);
        otherAttributeRepository1.save(otherAttribute11);
        otherAttributeRepository2.save(otherAttribute2);
        userRepository.save(user1);
        otherUserRepository1.save(otherUser1);
        otherUserRepository2.save(otherUser2);

    }

}