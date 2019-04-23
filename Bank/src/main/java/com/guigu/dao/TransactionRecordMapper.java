package com.guigu.dao;

import com.guigu.pojo.TransactionRecord;
import com.guigu.pojo.TransactionRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionRecordMapper {
    int countByExample(TransactionRecordExample example);

    int deleteByExample(TransactionRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TransactionRecord record);

    int insertSelective(TransactionRecord record);

    List<TransactionRecord> selectByExample(TransactionRecordExample example);

    TransactionRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TransactionRecord record, @Param("example") TransactionRecordExample example);

    int updateByExample(@Param("record") TransactionRecord record, @Param("example") TransactionRecordExample example);

    int updateByPrimaryKeySelective(TransactionRecord record);

    int updateByPrimaryKey(TransactionRecord record);
}