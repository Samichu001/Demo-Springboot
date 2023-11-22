package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
import com.example.demo.model.StudentRowMapper;

@Repository
public class StudentRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void insert(Student student) {
		jdbcTemplate.update("insert into students(nombre, apellido) values(?, ?);", student.getNombre(),
				student.getApellido());
	}

	public List<Student> findAll() {
		List<Student> lista = jdbcTemplate.query("SELECT * FROM STUDENTS", new StudentRowMapper());
		return lista;
	}

	public void update(Student student) {
		jdbcTemplate.update("UPDATE students SET nombre = ?, apellido = ? WHERE id=?;", student.getNombre(),
				student.getApellido(), student.getId());
	}
}
