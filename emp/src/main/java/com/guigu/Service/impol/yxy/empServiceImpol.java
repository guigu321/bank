package com.guigu.Service.impol.yxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigu.Service.yxy.empService;
import com.guigu.dao.DeptMapper;
import com.guigu.dao.EmpMapper;
import com.guigu.pojo.Dept;
import com.guigu.pojo.DeptExample;
import com.guigu.pojo.Emp;
@Service
public class empServiceImpol implements empService{

	@Autowired
	private EmpMapper emapper;
	public void setEmapper(EmpMapper emapper) {
		this.emapper = emapper;
	}
	@Autowired
	private DeptMapper dmapper;
	public void setDmapper(DeptMapper dmapper) {
		this.dmapper = dmapper;
	}
	@Override
	public List<Emp> findAllEmp() {
		// TODO Auto-generated method stub
		return emapper.findAllEmp();
	}
	@Override
	public List<Dept> selectByExample(DeptExample example) {
		// TODO Auto-generated method stub
		return dmapper.selectByExample(example);
	}

}
