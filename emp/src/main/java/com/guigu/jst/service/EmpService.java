package com.guigu.jst.service;

import java.util.List;

import com.guigu.pojo.Dept;
import com.guigu.pojo.DeptExample;
import com.guigu.pojo.Emp;

public interface EmpService {
	int insert(Emp emp);
	List<Dept> selectByExample(DeptExample example);
}
