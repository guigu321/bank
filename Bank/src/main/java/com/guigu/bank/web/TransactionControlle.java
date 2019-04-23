package com.guigu.bank.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.pojo.TransactionRecord;
import com.guigu.pojo.TransactionRecordExample;
import com.guigui.bank.service.TransactionRecordService;

@RestController
public class TransactionControlle {

	@Autowired
	private TransactionRecordService ser;
	
	@RequestMapping("selectByExample")
	public List<TransactionRecord> findsTransaction(){
		TransactionRecordExample example=new TransactionRecordExample();
		List<TransactionRecord> selectByExample = ser.selectByExample(example);
		
		return selectByExample;
	}
}
