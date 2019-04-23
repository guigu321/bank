package com.guigu.bank.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.guigui.bank.service.bankService;

@RestController
public class bankController {
	@Autowired
	private bankService service;
}
