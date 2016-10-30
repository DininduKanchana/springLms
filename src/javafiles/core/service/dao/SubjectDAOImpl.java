package javafiles.core.service.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javafiles.core.entity.Subject;

@Repository("SubjectDAO")
public class SubjectDAOImpl implements SubjectDAO{
	
	
	@Autowired
	private JdbcTemplate template;
	
	public SubjectDAOImpl(JdbcTemplate template) throws SQLException {
		this.template = template;
		
	}

	@Override
	public void insert(Subject subject) {
		this.template.update("INSERT INTO subject(name, No_Of_Asgs, teacher) VALUES(?,?,?)",
				subject.getName(),subject.getNoOfAsgs(), subject.getTeacher());		
	}

	@Override
	public void update(Subject subject) {
		this.template.update("UPDATE subject SET name = ?,No_Of_Asgs = ?, teacher = ? WHERE subject_id =  ?",
				subject.getName(),subject.getNoOfAsgs(), subject.getTeacher(),subject.getId());
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Subject getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Subject> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
