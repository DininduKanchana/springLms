package javafiles.core.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int i) throws SQLException {
        Student p = new Student();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setEmail(rs.getString("email"));
        p.setPassword(rs.getString("password"));
        return p;
    }
}

