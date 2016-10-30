package javafiles.core.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class SubjectMapper implements RowMapper<Subject>{
	@Override
    public Subject mapRow(ResultSet rs, int i) throws SQLException {
        Subject p = new Subject();
        p.setId(rs.getInt("subject_id"));
        p.setName(rs.getString("name"));
        p.setNoOfAsgs(rs.getInt("No_Of_Asg"));
        p.setTeacher(rs.getString("teacher"));
        
        return p;
    }

}




