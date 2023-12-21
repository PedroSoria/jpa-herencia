package com.herencia.demoherencia.seed;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.herencia.demoherencia.entities.AttributesUserB;
import com.herencia.demoherencia.entities.AttributesUserC;
import com.herencia.demoherencia.entities.GroupPolicy;
import com.herencia.demoherencia.entities.UserC;
import com.herencia.demoherencia.entities.UserB;
import com.herencia.demoherencia.entities.UserA;
import com.herencia.demoherencia.repository.AttributesBRepository;
import com.herencia.demoherencia.repository.AttributesCRepository;
import com.herencia.demoherencia.repository.GroupPolicyRepository;
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
        @Autowired
        GroupPolicyRepository groupPolicyRepository;

        @Transactional
        public void run(ApplicationArguments args) throws Exception {

                createGrouPolicys();
                CreateUser("User1", "User1");
                CreateUser("User2", "User2", "User2", "User2", "User2");
                CreateUser("User3", "User3", "User3", "User3", "User3", "User3", "User3", "User3");

        }

        @Transactional
        public void createGrouPolicys() {

                GroupPolicy groupPolicyA = new GroupPolicy();
                GroupPolicy groupPolicyB = new GroupPolicy();
                GroupPolicy groupPolicyC = new GroupPolicy();
                groupPolicyA.setName("GroupA");
                groupPolicyB.setName("GroupB");
                groupPolicyC.setName("GroupC");
                groupPolicyRepository.save(groupPolicyA);
                groupPolicyRepository.save(groupPolicyB);
                groupPolicyRepository.save(groupPolicyC);

        }

        @Transactional
        public void CreateUser(String email, String password) {

                // Assuming GroupPolicy has a constructor that accepts an ID
                GroupPolicy groupPolicy = groupPolicyRepository.findById(1L)
                                .orElseThrow(() -> new RuntimeException("GroupPolicy with ID 1 not found"));

                UserA user = new UserA();
                user.setEmail(email);
                user.setPassword(password);

                ArrayList<GroupPolicy> groupPolicies = new ArrayList<>();
                groupPolicies.add(groupPolicy);

                user.setGroupolicys(groupPolicies);
                userARepository.save(user);

        }

        @Transactional
        public void CreateUser(String email, String password, String _1, String _2, String _3) {

                // Assuming GroupPolicy has a constructor that accepts an ID
                GroupPolicy groupPolicy1 = groupPolicyRepository.findById(1L)
                                .orElseThrow(() -> new RuntimeException("GroupPolicy with ID 1 not found"));

                GroupPolicy groupPolicy2 = groupPolicyRepository.findById(2L)
                                .orElseThrow(() -> new RuntimeException("GroupPolicy with ID 2 not found"));

                UserB user = new UserB();
                user.setEmail(email);
                user.setPassword(password);

                ArrayList<GroupPolicy> groupPolicies = new ArrayList<>();
                groupPolicies.add(groupPolicy1);
                groupPolicies.add(groupPolicy2);

                user.setGroupolicys(groupPolicies);

                userBRepository.save(user); // Save user first to generate user ID

                // Now, use the generated user ID for AttributesUserB
                AttributesUserB attribute1 = new AttributesUserB();
                attribute1.setOtherAttributeName1(_1);
                attribute1.setOtherAttributeName2(_2);
                attribute1.setOtherAttributeName3(_3);
                attribute1.setUserB(user);

                attributesBRepository.save(attribute1);

        }

        @Transactional
        public void CreateUser(String email, String password, String _1, String _2, String _3,
                        String _4, String _5, String _6) {

                // Assuming GroupPolicy has a constructor that accepts an ID
                GroupPolicy groupPolicy1 = groupPolicyRepository.findById(1L)
                                .orElseThrow(() -> new RuntimeException("GroupPolicy with ID 1 not found"));

                GroupPolicy groupPolicy2 = groupPolicyRepository.findById(2L)
                                .orElseThrow(() -> new RuntimeException("GroupPolicy with ID 2 not found"));

                GroupPolicy groupPolicy3 = groupPolicyRepository.findById(3L)
                                .orElseThrow(() -> new RuntimeException("GroupPolicy with ID 3 not found"));

                UserC user = new UserC();
                user.setEmail(email);
                user.setPassword(password);

                ArrayList<GroupPolicy> groupPolicies = new ArrayList<>();
                groupPolicies.add(groupPolicy1);
                groupPolicies.add(groupPolicy2);
                groupPolicies.add(groupPolicy3);

                user.setGroupolicys(groupPolicies);

                userCRepository.save(user); // Save user first to generate user ID

                // Now, use the generated user ID for AttributesUserB and AttributesUserC
                AttributesUserB attribute1 = new AttributesUserB();
                attribute1.setOtherAttributeName1(_1);
                attribute1.setOtherAttributeName2(_2);
                attribute1.setOtherAttributeName3(_3);
                attribute1.setUserB(user);

                attributesBRepository.save(attribute1);

                AttributesUserC attribute2 = new AttributesUserC();
                attribute2.setOtherAttributeName4(_4);
                attribute2.setOtherAttributeName5(_5);
                attribute2.setOtherAttributeName6(_6);
                attribute2.setUserC(user);

                attributesCRepository.save(attribute2);

        }

}
