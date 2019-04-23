package com.guigu.jst.controlle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.guigu.jst.service.EmpService;
import com.guigu.pojo.Dept;
import com.guigu.pojo.DeptExample;
import com.guigu.pojo.Emp;

@RestController
public class EmpControlle {
	@Autowired
	private EmpService ser;
	@RequestMapping("/selectdept")
	  public List<Dept> selectdept(HttpServletRequest request){
		DeptExample example=null;
	  List<Dept> selectByExample = ser.selectByExample(example);
	return selectByExample;
		
		}
	@RequestMapping("/addemp")
	  public void addemp(String empname,String sex,String birth,String phone,String adress,String job,String d,HttpServletRequest request,HttpServletResponse response) throws Exception {
		Integer id=null;
		int dept = Integer.parseInt(d);
		Emp e=new Emp(id,empname,sex,birth,phone,adress,job,dept);
		int insert = ser.insert(e);
		if(insert>0){
			//return "main.html";
			request.getRequestDispatcher("main.html").forward(request, response);
		}else{
			//return "addEmp.html";
			request.getRequestDispatcher("addEmp.html").forward(request, response);
		}
		
		}
}
