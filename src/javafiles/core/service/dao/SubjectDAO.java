package javafiles.core.service.dao;

import java.util.List;

import javafiles.core.entity.Subject;

public interface SubjectDAO {
public void insert(Subject subject);
	
	public void update(Subject subject);
	
	public void delete(int id);
	
	public Subject getById(int id);
	
	public List<Subject> getAll();

	

}
