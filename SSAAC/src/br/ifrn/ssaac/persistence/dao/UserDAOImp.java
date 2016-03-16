package br.ifrn.ssaac.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.ifrn.ssaac.business.model.Student;
import br.ifrn.ssaac.persistence.util.ConnectionFactory;

public class UserDAOImp implements UserDAO {
	private Connection conn;

	public UserDAOImp() {
		conn = ConnectionFactory.getInstance().getConnection();
	}

	@Override
	public void addStudent(Student student) {
		try {
			String sql = "INSERT INTO student (name, email, course) VALUES (?, ?, ?)";
			PreparedStatement pstInsere = conn.prepareStatement(sql);
			pstInsere.setString(1, student.getName());
			pstInsere.setString(2, student.geteMail());
			pstInsere.setString(3, student.getCourse());
			pstInsere.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeStudent(Student student) {
		try {
		String sql = "DELETE FROM student as s WHERE s.id = ?";
			PreparedStatement pstRemove = conn.prepareStatement(sql);
			pstRemove.setLong(1, student.getId());
			pstRemove.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
