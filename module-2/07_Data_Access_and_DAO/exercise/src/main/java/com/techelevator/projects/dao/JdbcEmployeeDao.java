package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		String sql = "SELECT employee.employee_id, department_id, first_name, last_name, birth_date, hire_date " +
				"FROM employee; ";
		SqlRowSet sqlResult = jdbcTemplate.queryForRowSet(sql);
		while(sqlResult.next()){
			employees.add(new Employee(sqlResult.getInt("employee_id"), sqlResult.getInt("department_id"), sqlResult.getString("first_name"), sqlResult.getString("last_name"), sqlResult.getDate("birth_date").toLocalDate(), sqlResult.getDate("hire_date").toLocalDate()));
		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employees = new ArrayList<Employee>();
		String sql = "SELECT * " +
				"FROM employee " +
				"WHERE first_name ILIKE CONCAT('%', ?, '%') " +
				"AND last_name ILIKE CONCAT('%', ?, '%') ; " ;
		SqlRowSet sqlResult = jdbcTemplate.queryForRowSet(sql, firstNameSearch, lastNameSearch);
		while(sqlResult.next()){
			employees.add(new Employee(sqlResult.getInt("employee_id"), sqlResult.getInt("department_id"), sqlResult.getString("first_name"), sqlResult.getString("last_name"), sqlResult.getDate("birth_date").toLocalDate(), sqlResult.getDate("hire_date").toLocalDate()));
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		List<Employee> employee = new ArrayList<Employee>();
		String sql = "SELECT employee.employee_id, department_id, first_name, last_name, birth_date, hire_date " +
				"FROM employee " +
				"JOIN project_employee " +
				"ON employee.employee_id = project_employee.employee_id " +
				"WHERE project_id = ? ; ";
		SqlRowSet sqlResult = jdbcTemplate.queryForRowSet(sql, projectId);
		while(sqlResult.next()){
			employee.add(new Employee(sqlResult.getInt("employee_id"), sqlResult.getInt("department_id"), sqlResult.getString("first_name"), sqlResult.getString("last_name"), sqlResult.getDate("birth_date").toLocalDate(), sqlResult.getDate("hire_date").toLocalDate()));
		}
		return employee;
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {
		String sql = "INSERT INTO project_employee(employee_id, project_id) " +
				"VALUES(?, ?) " +
				"RETURNING project_id, employee_id; ";
		SqlRowSet sqlResult = jdbcTemplate.queryForRowSet(sql, employeeId, projectId);
	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {
		String sql = "DELETE FROM project_employee " +
				"WHERE project_id = ? " +
				"AND employee_id = ? " +
				"RETURNING project_id, employee_id;";
		SqlRowSet sqlResult = jdbcTemplate.queryForRowSet(sql, projectId, employeeId);
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> employeesWithoutProjects = new ArrayList<Employee>();
		String sql = "SELECT employee.employee_id, department_id, first_name, last_name, birth_date, hire_date, project_id\n" +
				"FROM employee\n" +
				"LEFT JOIN project_employee\n" +
				"ON project_employee.employee_id = employee.employee_id\n" +
				"WHERE project_id IS NULL; ";
		SqlRowSet sqlResult = jdbcTemplate.queryForRowSet(sql);
		while(sqlResult.next()){
			employeesWithoutProjects.add(new Employee(sqlResult.getInt("employee_id"), sqlResult.getInt("department_id"), sqlResult.getString("first_name"), sqlResult.getString("last_name"), sqlResult.getDate("birth_date").toLocalDate(), sqlResult.getDate("hire_date").toLocalDate()));
		}
		return employeesWithoutProjects;
	}


}
