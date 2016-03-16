package br.ifrn.ssaac.business.model;

public class Student extends Author {
	private String course;

	public Student() {
		super();	
	}

	public Student(String name, String eMail, String curso) {
		super(name, eMail);
		this.course = curso;
	}

	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
