package com.dl.demo2.repository;

import com.dl.demo2.model.CompositeKey;
import com.dl.demo2.model.Protection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProtectionRepository extends JpaRepository<Protection, CompositeKey> {

    @Query(value = "SELECT * FROM set_table WHERE dev_id = ?1", nativeQuery = true)
    List<Protection> getProtectionsByDevId(Long devId);

    @Query(value = "SELECT * FROM set_table WHERE dev_id = ?1 AND indexNo = ?2", nativeQuery = true)
    Protection getProtectionByDevIdAndIndexNo(Long devId, Integer indexNo);

}
