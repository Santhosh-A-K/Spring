package com.fss;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
	
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createTable()
	{
		String sql = "create table empsan (id int,name varchar(20),depid int)";
		jdbcTemplate.update(sql);
	}
	
	public void saveRecord(Employee emp)
	{
		System.out.println("save record method is invoked..");
		/*String sql = "INSERT INTO empsan values(0,'kl',0)";
		jdbcTemplate.update(sql);*/
		String sql = "INSERT INTO empsan values(?,?,?)";
		jdbcTemplate.update(sql, emp.getEmpId(),emp.getEmpName(),emp.getDeptId());
		
		System.out.println("succesfully inserted..");
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> readAllRecords()
	{
		String sql = "SELECT * FROM empsan";
		List<Employee> li = jdbcTemplate.query(sql,new EmployeeRowMapper());
		return li;
	}

}
