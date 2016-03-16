package br.ifrn.ssaac.business.facade;

import br.ifrn.ssaac.business.model.Student;
import br.ifrn.ssaac.business.userbi.UserBI;

public class SSAACImp implements SSAAC {
	
	private UserBI userBI;
	
	public void setUserBI(UserBI userBI) {
		this.userBI = userBI;
	}
	
	@Override
	public void addStudentAuthor(Student student) {
		userBI.addStudentAuthor(student);
	}
}