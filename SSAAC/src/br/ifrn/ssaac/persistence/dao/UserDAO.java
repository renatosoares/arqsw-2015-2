package br.ifrn.ssaac.persistence.dao;

import br.ifrn.ssaac.business.model.Student;

public interface UserDAO {
	public void addStudent(Student author);
	public void removeStudent(Student author);
}
