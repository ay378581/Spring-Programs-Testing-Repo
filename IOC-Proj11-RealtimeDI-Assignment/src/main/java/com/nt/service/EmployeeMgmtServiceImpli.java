package com.nt.service;

import com.nt.BO.EmployeeBO;
import com.nt.DAO.IEmployeeDAO;
import com.nt.DTO.EmployeeDTO;

public class EmployeeMgmtServiceImpli implements IEmployeeMgmtService {

	private IEmployeeDAO dao;

	public EmployeeMgmtServiceImpli(IEmployeeDAO dao) {
		System.out.println("EmployeeMgmtServiceImpli ::: 1-param constructor");
		this.dao = dao;
	}

	public String registerEmployee(EmployeeDTO dto) throws Exception {
		float grosssalary = dto.getBasicsalary() + dto.getBasicsalary() * 0.4f;
		float netsalary = grosssalary - dto.getBasicsalary() * 0.2f;

		// prepare BO class obj having persistable data
		EmployeeBO bo = new EmployeeBO();
		bo.setEno(dto.getEno());
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getEname());
		bo.setBasicsalary(dto.getBasicsalary());
		bo.setGrosssalary(grosssalary);
		bo.setNetsalary(netsalary);

		// use DAO
		int result = dao.insertEmployee(bo);

		// final result
		return result == 1 ? "Employee Registered with netSalary" + netsalary
				: "Employee not Registered with netSalary" + netsalary;
	}
}
