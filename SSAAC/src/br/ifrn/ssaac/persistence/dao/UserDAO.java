package br.ifrn.ssaac.persistence.dao;

import br.ifrn.ssaac.business.model.Student;
import br.ifrn.ssaac.business.model.Evaluator;

public interface UserDAO {
	public void addStudent(Student author);
	public void removeStudent(Student author);
	public void addEvaluator(Evaluator author);
	public void removeEvaluator(Evaluator author);
}
