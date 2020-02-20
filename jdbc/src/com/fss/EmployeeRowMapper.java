package com.fss;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper{

	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee e = new Employee();
		e.setEmpId(rs.getInt("ID"));
		e.setEmpName(rs.getString("NAME"));
		e.setDeptId(rs.getInt("DEPID"));
		return e;
	}
	
	

}
