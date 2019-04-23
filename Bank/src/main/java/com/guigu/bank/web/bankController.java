package com.guigu.bank.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigu.pojo.Account;
import com.guigui.bank.service.bankService;

@RestController
public class bankController {
	@Autowired
	private bankService service;
	
	@RequestMapping("")
	public List<Account> Aid(HttpServletRequest req){
		Account attribute = (Account) req.getSession().getAttribute("user");
		List<Account> aid = service.Aid(attribute.getId()+"");
		return aid;
	}
}
