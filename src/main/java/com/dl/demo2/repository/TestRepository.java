package com.dl.demo2.repository;

import com.dl.demo2.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TestRepository {

    @Select("SELECT * FROM user")
    List<User> getUserList();
}
