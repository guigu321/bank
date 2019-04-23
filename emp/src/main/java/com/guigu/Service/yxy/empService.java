package com.guigu.Service.yxy;

import java.util.List;

import com.guigu.pojo.Dept;
import com.guigu.pojo.DeptExample;
import com.guigu.pojo.Emp;

public interface empService {
	List<Emp> findAllEmp();
	
	List<Dept> selectByExample(DeptExample example);
}
