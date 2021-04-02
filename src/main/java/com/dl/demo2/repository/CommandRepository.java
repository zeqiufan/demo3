package com.dl.demo2.repository;

import com.dl.demo2.model.Command;
import com.dl.demo2.model.CompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandRepository extends JpaRepository<Command, CompositeKey> {

    @Query(value = "SELECT * FROM cmd_table WHERE dev_id = ?1 AND indexNo = ?2", nativeQuery = true)
    Command getCommandByDevIdAndIndexNo(Long devId, Integer indexNo);
}
