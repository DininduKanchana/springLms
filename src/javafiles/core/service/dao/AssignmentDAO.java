package javafiles.core.service.dao;

import java.util.List;

import javafiles.core.entity.Assignment;

public interface AssignmentDAO {

	public void insert(Assignment assignment);
	
	public void update(Assignment assignment);
	
	public void delete(int id);
	
	public Assignment getById(int id);
	
	public List<Assignment> getAll();

	//public Assignment getByEmail(String email);

}
