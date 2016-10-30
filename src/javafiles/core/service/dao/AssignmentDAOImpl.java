package javafiles.core.service.dao;

import java.sql.SQLException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javafiles.core.entity.Assignment;
import javafiles.core.entity.AssignmentMapper;


@Repository("AssignmentDAO")
public class AssignmentDAOImpl implements AssignmentDAO{
	
	
	@Autowired
	private JdbcTemplate template;
	
	public AssignmentDAOImpl(){
		
	}
	
	
	public AssignmentDAOImpl(JdbcTemplate template) throws SQLException {
		this.template = template;
		
	}
	
	

	@Override
	public void insert(Assignment assignment) {
		this.template.update("INSERT INTO assignment(subject_id, time, marks,discripation) VALUES(?,?,?,?)",
				assignment.getSubject_id(), assignment.getTime(), -1,  assignment.getDiscription());
		
	}

	@Override
	public void update(Assignment assignment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Assignment getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Assignment> getAll() {
		String sql = "SELECT id, subject_id, time, marks, discription FROM assignment order by time";
	     return this.template.query(sql, new AssignmentMapper());
	}

}
