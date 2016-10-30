package javafiles.core.entity;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class AssignmentMapper implements RowMapper<Assignment> {
	@Override
	public Assignment mapRow(ResultSet rs, int i) throws SQLException {
        Assignment p = new Assignment();
        p.setId(rs.getInt("id"));
        p.setSubject_id(rs.getInt("subject_id"));
        
        
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
       
        p.setTime(sdf.format(rs.getTimestamp("time")));
        p.setMarks(rs.getDouble("marks"));
        p.setDiscription(rs.getString("discription"));
        
        return p;

}

}