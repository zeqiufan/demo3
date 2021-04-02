package com.dl.demo2.repository;

import com.dl.demo2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//  @Select("SELECT * FROM user WHERE username = ?1")
    @Query(value = "SELECT * FROM user_table WHERE userEnName = ?1", nativeQuery = true)
    User findByUserEnName(String userEnName);
}
