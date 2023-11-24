package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.BO.EmployeeBO;

public class EmployeeMySQLDAOImpli implements IEmployeeDAO {

	private DataSource drds;
	private final String INSERT_QUERY = "INSERT INTO SPRING_EMPLOYEE(ENAME,DESG,BASICSALARY,GROSSSALARY,NETSALARY) VALUES(?,?,?,?,?)";

	public EmployeeMySQLDAOImpli(DataSource drds) {
		System.out.println("EmployeeMySQLDAOImpli ::: 1-param constructor");
		this.drds = drds;
	}

	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		int k = 0;
		try (Connection con = drds.getConnection(); PreparedStatement ps = con.prepareStatement(INSERT_QUERY)) {
			
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicsalary());
			ps.setFloat(4, bo.getGrosssalary());
			ps.setFloat(5, bo.getNetsalary());
			
			k = ps.executeUpdate();
			
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return k;
	}

}
