package br.ifrn.ssaac.business.facade;


import br.ifrn.ssaac.business.model.Student;
import br.ifrn.ssaac.business.model.Evaluator;
public interface SSAAC {
	public void addStudentAuthor(Student student);
	public void addEvaluatorAuthor(Evaluator evaluator);
}