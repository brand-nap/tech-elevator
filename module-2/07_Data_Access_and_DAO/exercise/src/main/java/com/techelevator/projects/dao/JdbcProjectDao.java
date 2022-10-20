package com.techelevator.projects.dao;

import java.sql.SQLRecoverableException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(int projectId) {
		Project project = new Project();
		String sql = "SELECT * " +
				"FROM project " +
				"WHERE project_id = ? ;";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, projectId);
		while(result.next()) {
			if (result.getDate("from_date") != null && result.getDate("to_date") != null) {
				project = new Project(result.getInt("project_id"), result.getString("name"), result.getDate("from_date").toLocalDate(), result.getDate("to_date").toLocalDate());
			}else if (result.getDate("from_date") != null ){
				project = new Project(result.getInt("project_id"), result.getString("name"), result.getDate("from_date").toLocalDate(), null);
			}else if (result.getDate("to_date") != null){
				project = new Project(result.getInt("project_id"), result.getString("name"), null, result.getDate("to_date").toLocalDate());
			}else{
				project = new Project(result.getInt("project_id"), result.getString("name"), null, null);
			}
		}
		if(project.getName()== null){
			return null;
		}else {
			return project;
		}
	}

	@Override
	public List<Project> getAllProjects() {
		List<Project> projects = new ArrayList<Project>();
		String sql = "SELECT * " +
				"FROM project ";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
		while(result.next()) {
			if (result.getDate("from_date") != null && result.getDate("to_date") != null) {
				projects.add(new Project(result.getInt("project_id"), result.getString("name"), result.getDate("from_date").toLocalDate(), result.getDate("to_date").toLocalDate()));
			}else if (result.getDate("from_date") != null ){
				projects.add(new Project(result.getInt("project_id"), result.getString("name"), result.getDate("from_date").toLocalDate(), null));
			}else if (result.getDate("to_date") != null){
				projects.add(new Project(result.getInt("project_id"), result.getString("name"), null, result.getDate("to_date").toLocalDate()));
			}else{
				projects.add(new Project(result.getInt("project_id"), result.getString("name"), null, null));
			}
		}
		return projects;
	}

	@Override
	public Project createProject(Project newProject) {
		Project project = new Project();
		String sql = "INSERT INTO project(project_id, name, from_date, to_date) " +
				"VALUES(?, ?, ?, ?) " +
				"RETURNING project_id, name, from_date, to_date; ";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, newProject.getId(), newProject.getName(), newProject.getFromDate(), newProject.getToDate());
		while(result.next()) {
			if (result.getDate("from_date") != null && result.getDate("to_date") != null) {
				project = new Project(result.getInt("project_id"), result.getString("name"), result.getDate("from_date").toLocalDate(), result.getDate("to_date").toLocalDate());
			}else if (result.getDate("from_date") != null ){
				project = new Project(result.getInt("project_id"), result.getString("name"), result.getDate("from_date").toLocalDate(), null);
			}else if (result.getDate("to_date") != null){
				project = new Project(result.getInt("project_id"), result.getString("name"), null, result.getDate("to_date").toLocalDate());
			}else{
				project = new Project(result.getInt("project_id"), result.getString("name"), null, null);
			}
		}
		return project;
	}

	@Override
	public void deleteProject(int projectId) {
		String sql = "DELETE FROM project_employee " +
				"WHERE project_id = ? " +
				"RETURNING project_id, employee_id";
		SqlRowSet result1 = jdbcTemplate.queryForRowSet(sql, projectId);
		sql = "DELETE FROM timesheet " +
				"WHERE project_id = ?  " +
				"RETURNING project_id";
		SqlRowSet result2 = jdbcTemplate.queryForRowSet(sql, projectId);
		sql = "DELETE FROM project " +
				"WHERE project_id = ? " +
				"RETURNING project_id, name, from_date, to_date;";
		SqlRowSet result3 = jdbcTemplate.queryForRowSet(sql, projectId);

	}
	

}
