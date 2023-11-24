package com.nt.DTO;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{

		private Integer eno;
		private String ename;
		private String desg;
		private Float basicsalary;
		
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
		public void setBasicsalary(Float basicsalary) {
			this.basicsalary = basicsalary;
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

		
}
