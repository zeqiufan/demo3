package com.dl.demo2.repository;

import com.dl.demo2.model.Communication;
import com.dl.demo2.model.CompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommunicationRepository extends JpaRepository<Communication, CompositeKey> {

    @Query(value = "SELECT * FROM yx_table WHERE dev_id = ?1", nativeQuery = true)
    List<Communication> getCommunicationsByDevId(Long devId);

    @Query(value = "SELECT * FROM yx_table WHERE dev_id = ?1 AND indexNo = ?2", nativeQuery = true)
    Communication getCommunicationByDevIdAAndIndexNo(Long devId, Integer indexNo);
}
