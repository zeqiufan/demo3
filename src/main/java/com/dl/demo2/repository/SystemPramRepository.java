package com.dl.demo2.repository;

import com.dl.demo2.model.SystemPram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemPramRepository extends JpaRepository<SystemPram, String> {
    @Query(value = "SELECT * FROM syspram_table", nativeQuery = true)
    SystemPram getSystemPram();

    @Query(value = "SELECT user_IDcount FROM syspram_table", nativeQuery = true)
    Long getUserIdCount();

    @Query(value = "SELECT dev_IDcount FROM syspram_table", nativeQuery = true)
    Long getDevIdCount();
}
