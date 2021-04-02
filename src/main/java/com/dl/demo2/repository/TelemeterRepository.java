package com.dl.demo2.repository;

import com.dl.demo2.model.Telemeter;
import com.dl.demo2.model.CompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 遥测的Repository
 * 将对数据库操作的sql语句封装成TelemeterRepository类的一个函数
 *
 * 继承的父类JpaRepository<Telemeter, CompositeKey> 表示
 * 这个类对应的Model类是Telemeter，其主键是CompositeKey型变量
 * 这个模板父类里面已经封装很多内置函数
 */
@Repository
public interface TelemeterRepository extends JpaRepository<Telemeter, CompositeKey> {

    /**
     * 根据dev_id检索一组遥测数据
     * @param devId
     * @return
     */
    @Query(value = "SELECT * FROM yc_table WHERE dev_id = ?1", nativeQuery = true)
    List<Telemeter> getTelemetersByDevId(Long devId);

    /**
     * 根据 devId 和 indexNo2、indexNo2 获取两个遥测数据
     * 目前的应用场景是通信状态模块展示 电流电压
     * FIXME: 如果用 devId 和 indexNo 来具体检索一个，在逻辑上是不是更好？或者第二个参数传一个 List<Integer> 变量？但是因为这个函数一秒就要刷新一次，所以我希望尽可能减少访问数据库的次数
     * @param devId
     * @param indexNo1
     * @param indexNo2
     * @return
     */
    @Query(value = "SELECT * FROM yc_table WHERE dev_id = ?1 AND (IndexNo = ?2 OR IndexNo = ?3)", nativeQuery = true)
    List<Telemeter> getTwoTelemetersByDevIdAndIndexNos(Long devId, Integer indexNo1, Integer indexNo2);
}
