package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import com.techelevator.projects.model.Department;


public class JdbcDepartmentDao implements DepartmentDao {
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(int id) {
		String sql = "SELECT department_id, name " +
				"FROM department " +
				"WHERE department_id = ? ";
		SqlRowSet sqlResult = jdbcTemplate.queryForRowSet(sql, id);
		if(sqlResult.next()) {
			return new Department(sqlResult.getInt("department_id"), sqlResult.getString("name"));
		}else{
			return null;
		}
	}

	@Override
	public List<Department> getAllDepartments() {
		List<Department> allDepartments = new ArrayList<Department>();
		String sql = "SELECT department_id, name " +
					 "FROM department; ";
		SqlRowSet sqlResult = jdbcTemplate.queryForRowSet(sql);
		while(sqlResult.next()){
			allDepartments.add(new Department(sqlResult.getInt("department_id"), sqlResult.getString("name")));
		}
		return allDepartments;
	}

	@Override
	public void updateDepartment(Department updatedDepartment) {
		String sql = "UPDATE department " +
					    "SET name = ? " +
					 "WHERE department_id = ? RETURNING name; ";
		SqlRowSet sqlResult = jdbcTemplate.queryForRowSet(sql, updatedDepartment.getName(), updatedDepartment.getId());
	}

}
