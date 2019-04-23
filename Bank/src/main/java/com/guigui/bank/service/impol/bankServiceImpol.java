package com.guigui.bank.service.impol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.dao.AccountMapper;
import com.guigu.dao.TransactionRecordMapper;
import com.guigui.bank.service.bankService;
@Service
public class bankServiceImpol implements bankService {
	@Autowired
	private AccountMapper accountDao;
	public void setAccountDao(AccountMapper accountDao) {
		this.accountDao = accountDao;
	}
	@Autowired
	private TransactionRecordMapper trDao;
	public void setTrDao(TransactionRecordMapper trDao) {
		this.trDao = trDao;
	}
}
