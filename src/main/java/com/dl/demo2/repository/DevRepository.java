package com.dl.demo2.repository;

import com.dl.demo2.model.Dev;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface DevRepository extends JpaRepository<Dev, Long> {

    @Query(value = "SELECT * FROM dev_table WHERE dev_ID = ?1", nativeQuery = true)
    Dev getDevByDevId(Long devId);

    @Query(value = "SELECT devName, stationName, lineName FROM dev_table WHERE dev_ID = ?1", nativeQuery = true)
    Map<String, Object> getDevInfoByDevId(Long devId);
}
