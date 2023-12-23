package com.herencia.demoherencia.seed;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.herencia.demoherencia.repository.IGroupPolicyRepository;
import com.herencia.demoherencia.repository.IUserRepository;
import com.herencia.demoherencia.model.Client;
import com.herencia.demoherencia.model.GroupPolicy;
import com.herencia.demoherencia.model.Provider;
import com.herencia.demoherencia.repository.IClientRepository;
import com.herencia.demoherencia.repository.IProviderRepository;
import jakarta.transaction.Transactional;

@Component
public class SeedData implements ApplicationRunner {

        @Autowired
        IUserRepository userRepository;
        @Autowired
        IClientRepository clientRepository;
        @Autowired
        IProviderRepository providerRepository;
        @Autowired
        IGroupPolicyRepository groupPolicyRepository;

        @Transactional
        public void run(ApplicationArguments args) throws Exception {

                createGrouPolicys();
                CreateUser("Client1", "Client1 Passw0r", "Client1 Address");
                CreateUser("Provider1", "Provider1 Passw0r", "Provider1 Address", "Provider1 Brand");

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
        public void CreateUser(String email, String password, String address) {

                GroupPolicy groupPolicy1 = groupPolicyRepository.findById(1L)
                                .orElseThrow(() -> new RuntimeException("GroupPolicy with ID 1 not found"));
                GroupPolicy groupPolicy2 = groupPolicyRepository.findById(2L)
                                .orElseThrow(() -> new RuntimeException("GroupPolicy with ID 2 not found"));

                Client user = new Client();
                user.setEmail(email);
                user.setPassword(password);
                user.setAddress(address);

                ArrayList<GroupPolicy> groupPolicies = new ArrayList<>();
                groupPolicies.add(groupPolicy1);
                groupPolicies.add(groupPolicy2);

                user.setGroupolicys(groupPolicies);

                clientRepository.save(user);
        }

        @Transactional
        public void CreateUser(String email, String password, String address, String brand) {

                GroupPolicy groupPolicy1 = groupPolicyRepository.findById(1L)
                                .orElseThrow(() -> new RuntimeException("GroupPolicy with ID 1 not found"));
                GroupPolicy groupPolicy2 = groupPolicyRepository.findById(2L)
                                .orElseThrow(() -> new RuntimeException("GroupPolicy with ID 2 not found"));
                GroupPolicy groupPolicy3 = groupPolicyRepository.findById(3L)
                                .orElseThrow(() -> new RuntimeException("GroupPolicy with ID 3 not found"));

                Provider user = new Provider();
                user.setEmail(email);
                user.setPassword(password);
                user.setAddress(address);
                user.setBrand(brand);

                ArrayList<GroupPolicy> groupPolicies = new ArrayList<>();
                groupPolicies.add(groupPolicy1);
                groupPolicies.add(groupPolicy2);
                groupPolicies.add(groupPolicy3);

                user.setGroupolicys(groupPolicies);

                providerRepository.save(user);
        }

}
