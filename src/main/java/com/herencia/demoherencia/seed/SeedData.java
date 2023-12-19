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
import com.herencia.demoherencia.repository.OtherAttributesBRepository;
import com.herencia.demoherencia.repository.OtherAttributesCRepository;
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
    OtherAttributesBRepository otherAttributesBRepository;
    @Autowired
    OtherAttributesCRepository otherAttributesCRepository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        CreateUser("User1", "User1");
        CreateUser("User2", "User2", "User2", "User2", "User2");
        CreateUser("User3", "User3", "User3", "User3", "User3", "User3", "User3", "User3");

    }

    public void CreateUser(String email, String password) {

        UserA user = new UserA();
        user.setEmail(email);
        user.setPassword(password);
        userARepository.save(user);
    }

    public void CreateUser(String email, String password, String _1, String _2, String _3) {

        UserB user = new UserB();
        user.setEmail(email);
        user.setPassword(password);

        AttributesUserB otherAttribute1 = new AttributesUserB();
        otherAttribute1.setOtherAttributeName1(_1);
        otherAttribute1.setOtherAttributeName2(_2);
        otherAttribute1.setOtherAttributeName3(_3);
        otherAttribute1.setUserB(user);

        otherAttributesBRepository.save(otherAttribute1);
        userBRepository.save(user);
    }

    public void CreateUser(String email, String password, String _1, String _2, String _3, String _4, String _5,
            String _6) {

        UserC user = new UserC();
        user.setEmail(email);
        user.setPassword(password);

        AttributesUserB otherAttribute1 = new AttributesUserB();
        otherAttribute1.setOtherAttributeName1(_1);
        otherAttribute1.setOtherAttributeName2(_2);
        otherAttribute1.setOtherAttributeName3(_3);
        otherAttribute1.setUserB(user);

        AttributesUserC otherAttribute2 = new AttributesUserC();
        otherAttribute2.setOtherAttributeName4(_4);
        otherAttribute2.setOtherAttributeName5(_5);
        otherAttribute2.setOtherAttributeName6(_6);
        otherAttribute2.setUserC(user);

        otherAttributesBRepository.save(otherAttribute1);
        otherAttributesCRepository.save(otherAttribute2);

        userCRepository.save(user);
    }

}