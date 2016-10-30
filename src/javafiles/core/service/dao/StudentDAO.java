package javafiles.core.service.dao;

import javafiles.core.entity.Student;
import java.util.List;

public interface StudentDAO {
	
	public void insert(Student student);
	
	public void update(Student student);
	
	public void delete(int id);
	
	public Student getById(int id);
	
	public List<Student> getAll();

	public Student getByEmail(String email);
}
