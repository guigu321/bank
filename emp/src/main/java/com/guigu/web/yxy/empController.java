package com.guigu.web.yxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.Service.yxy.empService;
import com.guigu.pojo.Dept;
import com.guigu.pojo.Emp;

@RestController
public class empController {
	@Autowired
	private empService service;
	
	@RequestMapping("findAllEmp")
	public Map findAllEmp(HttpServletRequest request){
		Map map=new HashMap();
		Integer page = Integer.valueOf(request.getParameter("page"));
		Integer rows = Integer.valueOf(request.getParameter("rows"));
		PageHelper.startPage(page, rows);
		List<Emp> list = service.findAllEmp();
		PageInfo<Emp> info=new PageInfo<Emp>(list);
		map.put("rows", list);
		map.put("total", info.getLastPage());
		return map;
	}
	
	@RequestMapping("findAllDept")
	public List<Dept> findAllDept(){
		return service.selectByExample(null);
	}
}
