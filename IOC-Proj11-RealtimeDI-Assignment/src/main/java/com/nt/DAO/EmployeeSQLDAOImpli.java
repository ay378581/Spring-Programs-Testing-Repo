package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.BO.EmployeeBO;

public class EmployeeSQLDAOImpli implements IEmployeeDAO {

	private DataSource drds;
	private final String EMP_INSERT = "INSERT INTO SPRING_EMPLOYEE VALUES(?,?,?,?,?,?)";

	public EmployeeSQLDAOImpli(DataSource drds) {
		System.out.println("EmployeeSQLDAOImpli ::: 1-param constroctor");
		this.drds = drds;
	}

	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		int k = 0;
		try (Connection con = drds.getConnection(); PreparedStatement ps = con.prepareStatement(EMP_INSERT)) {
			ps.setInt(1, bo.getEno());
			ps.setString(2, bo.getEname());
			ps.setString(3, bo.getDesg());
			ps.setFloat(4, bo.getBasicsalary());
			ps.setFloat(5, bo.getGrosssalary());
			ps.setFloat(6, bo.getNetsalary());
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
