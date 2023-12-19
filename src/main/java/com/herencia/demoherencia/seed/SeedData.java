package com.herencia.demoherencia.seed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.herencia.demoherencia.entities.AttributesUserB;
import com.herencia.demoherencia.entities.AttributesUserC;
import com.herencia.demoherencia.entities.UserC;
import com.herencia.demoherencia.entities.UserB;
import com.herencia.demoherencia.entities.UserA;
import com.herencia.demoherencia.repository.AttributesBRepository;
import com.herencia.demoherencia.repository.AttributesCRepository;
import com.herencia.demoherencia.repository.UserARepository;
import com.herencia.demoherencia.repository.UserBRepository;
import com.herencia.demoherencia.repository.UserCRepository;
import jakarta.transaction.Transactional;

@Component
public class SeedData implements ApplicationRunner {

    @Autowired
    UserARepository userARepository;
    @Autowired
    UserBRepository userBRepository;
    @Autowired
    UserCRepository userCRepository;
    @Autowired
    AttributesBRepository attributesBRepository;
    @Autowired
    AttributesCRepository attributesCRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        CreateUser("User1", "User1");
        CreateUser("User2", "User2", "User2", "User2", "User2");
        CreateUser("User3", "User3", "User3", "User3", "User3", "User3", "User3", "User3");
    }

    @Transactional
    public void CreateUser(String email, String password) {

        UserA user = new UserA();
        user.setEmail(email);
        user.setPassword(password);
        userARepository.save(user);
    }

    @Transactional
    public void CreateUser(String email, String password, String _1, String _2, String _3) {

        UserB user = new UserB();
        user.setEmail(email);
        user.setPassword(password);

        AttributesUserB attribute1 = new AttributesUserB();
        attribute1.setOtherAttributeName1(_1);
        attribute1.setOtherAttributeName2(_2);
        attribute1.setOtherAttributeName3(_3);
        attribute1.setUserB(user);

        attributesBRepository.save(attribute1);
        userBRepository.save(user);
    }

    @Transactional
    public void CreateUser(String email, String password, String _1, String _2, String _3,
            String _4, String _5, String _6) {

        UserC user = new UserC();
        user.setEmail(email);
        user.setPassword(password);

        AttributesUserB attribute1 = new AttributesUserB();
        attribute1.setOtherAttributeName1(_1);
        attribute1.setOtherAttributeName2(_2);
        attribute1.setOtherAttributeName3(_3);
        attribute1.setUserB(user);

        AttributesUserC attribute2 = new AttributesUserC();
        attribute2.setOtherAttributeName4(_4);
        attribute2.setOtherAttributeName5(_5);
        attribute2.setOtherAttributeName6(_6);
        attribute2.setUserC(user);

        attributesBRepository.save(attribute1);
        attributesCRepository.save(attribute2);

        userCRepository.save(user);
    }

}