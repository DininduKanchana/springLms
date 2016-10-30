package javafiles.core.service.dao;

import javafiles.core.entity.Student;
import javafiles.core.entity.StudentMapper;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("studentDAO")
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate template;
	
	public StudentDAOImpl(){
		
	}
	
	
	public StudentDAOImpl(JdbcTemplate template) throws SQLException {
		this.template = template;
		
	}

	@Override
	public void insert(Student student) {
		this.template.update("INSERT INTO student(id, name, email, password) VALUES(?,?,?,?)",
				student.getId(),student.getName(), student.getEmail(), student.getPassword());
    }
		
	

	@Override
	public void update(Student student) {
		this.template.update("UPDATE student SET name=?,email=?,password=? WHERE id=?",
                student.getName(), student.getEmail(), student.getPassword(),student.getId());
		
	}

	@Override
	public void delete(int id) {
		this.template.update("DELETE FROM student WHERE id=?", id);
		
	}

	@Override
	public Student getById(int id) {
		String sql = "SELECT id,name, email, password FROM student WHERE id=?";
        return (Student) this.template.queryForObject(sql, new Object[]{id}, new StudentMapper());
		
	}

	@Override
	public List<Student> getAll() {
		 String sql = "SELECT id, name, email, password FROM student";
	     return this.template.query(sql, new StudentMapper());
	}


	@Override
	public Student getByEmail(String email) {
		String sql = "SELECT id,name, email, password FROM student WHERE email=?";
        return (Student) this.template.queryForObject(sql, new Object[]{email}, new StudentMapper());
		
	}

}
