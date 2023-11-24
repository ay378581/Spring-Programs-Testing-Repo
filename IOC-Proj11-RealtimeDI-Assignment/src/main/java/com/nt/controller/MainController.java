package com.nt.controller;

import com.nt.DTO.EmployeeDTO;
import com.nt.VO.EmployeeVO;
import com.nt.service.IEmployeeMgmtService;

public class MainController {

	private IEmployeeMgmtService service;

	public MainController(IEmployeeMgmtService service) throws Exception{
		System.out.println("MainController ::: 1-param constructor");
		this.service = service;
	}

	public String processEmployee(EmployeeVO vo) throws Exception {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEno(Integer.parseInt(vo.getEno()));
		dto.setEname(vo.getEname());
		dto.setDesg(vo.getDesg());
		dto.setBasicsalary(Float.parseFloat(vo.getBasicsalary()));
		
		String result = service.registerEmployee(dto);
		return result;
	}
}
