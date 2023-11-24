package com.nt.BO;

import java.io.Serializable;

public class EmployeeBO {
	
	private Integer eno;
	private String ename;
	private String desg;
	private Float basicsalary;
	private Float grosssalary;
	private Float netsalary;
	
	public Integer getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public String getDesg() {
		return desg;
	}
	public Float getBasicsalary() {
		return basicsalary;
	}
	public Float getGrosssalary() {
		return grosssalary;
	}
	public Float getNetsalary() {
		return netsalary;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public void setBasicsalary(Float basicsalary) {
		this.basicsalary = basicsalary;
	}
	public void setGrosssalary(Float grosssalary) {
		this.grosssalary = grosssalary;
	}
	public void setNetsalary(Float netsalary) {
		this.netsalary = netsalary;
	}
	
}
