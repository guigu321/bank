package com.guigu.jst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.dao.DeptMapper;
import com.guigu.dao.EmpMapper;
import com.guigu.pojo.Dept;
import com.guigu.pojo.DeptExample;
import com.guigu.pojo.Emp;

@Service
public class EmpServiceImpol2 implements EmpService {
	@Autowired
    private EmpMapper mapper;
	@Autowired
    private DeptMapper mapper2;

	@Override
	public int insert(Emp emp) {
		int insert = mapper.insert(emp);
		return insert;
	}

	@Override
	public List<Dept> selectByExample(DeptExample example) {
		List<Dept> selectByExample = mapper2.selectByExample(example);
		return selectByExample;
	}
}
