package br.ifrn.ssaac.business.userbi;

import br.ifrn.ssaac.business.model.Student;
import br.ifrn.ssaac.persistence.dao.UserDAO;
import br.ifrn.ssaac.persistence.dao.UserDAOImp;

public class UserBIImp implements UserBI {

	private UserDAO dao = new UserDAOImp();
	
	public UserBIImp() {
	}

	@Override
	public void addStudentAuthor(Student student) {
		dao.addStudent(student);
	}
}