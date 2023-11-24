package com.nt.VO;

import java.io.Serializable;

public class EmployeeVO {
	
	private String eno;
	private String ename;
	private String desg;
	private String basicsalary;
	
	//alt + shift + s , r for generate getter and setter
	public String getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public String getDesg() {
		return desg;
	}
	public String getBasicsalary() {
		return basicsalary;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public void setBasicsalary(String basicsalary) {
		this.basicsalary = basicsalary;
	}

	
	
}
