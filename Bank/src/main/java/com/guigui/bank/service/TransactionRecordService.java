package com.guigui.bank.service;

import java.util.List;

import com.guigu.pojo.TransactionDate;
import com.guigu.pojo.TransactionRecord;
import com.guigu.pojo.TransactionRecordExample;

public interface TransactionRecordService {

	List<TransactionRecord> selectByExample(TransactionRecordExample example);
	
	List<TransactionRecord> selectTransaction(TransactionDate date);
}
