package com.dl.demo2.service;

import com.dl.demo2.model.User;
import com.dl.demo2.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public List<User> getUserList() {
        try {
            List<User> users = testRepository.getUserList();
            return users;

        } catch (Exception e) {
            throw e;
        }
    }
}
