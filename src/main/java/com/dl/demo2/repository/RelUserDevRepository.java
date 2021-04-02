package com.dl.demo2.repository;

import com.dl.demo2.model.RelUserDev;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelUserDevRepository extends JpaRepository<RelUserDev, RelUserDev> {
    @Query(value = "SELECT dev_ID FROM devuser_table WHERE user_ID = ?1", nativeQuery = true)
    List<Long> getDevIdsByUserId(Long userId);
}
