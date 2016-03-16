package br.ifrn.ssaac.business.model;

public class Author {
	private long id;
	private String name;
	private String eMail;
	public Author() {
		super();
	}
	public Author(String name, String eMail) {
		super();
		this.name = name;
		this.eMail = eMail;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
}
