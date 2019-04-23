package com.guigui.bank.service.impol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.dao.TransactionRecordMapper;
import com.guigu.pojo.TransactionDate;
import com.guigu.pojo.TransactionRecord;
import com.guigu.pojo.TransactionRecordExample;
import com.guigui.bank.service.TransactionRecordService;

@Service
public class TransactionRecordServiceImpol implements TransactionRecordService {

	@Autowired
	private TransactionRecordMapper mappers;
	
	@Override
	public List<TransactionRecord> selectByExample(TransactionRecordExample example) {
		
		
		return mappers.selectByExample(example);
	}

	@Override
	public List<TransactionRecord> selectTransaction(TransactionDate date) {
		List<TransactionRecord> selectTransaction = mappers.selectTransaction(date);
		return selectTransaction;
	}

}
