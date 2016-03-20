package br.ifrn.ssaac.business.userbi;

import br.ifrn.ssaac.business.model.Student;
import br.ifrn.ssaac.business.model.Evaluator;;

public interface UserBI {
	public void addStudentAuthor(Student student);
	public void addEvaluatorAuthor(Evaluator evaluator);
}