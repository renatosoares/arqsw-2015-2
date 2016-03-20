package br.ifrn.ssaac.business.model;

//(6) Realizar auto-cadastro (de avaliador)
//___(i) Julian, (ii) Renato
// formation
public class Evaluator extends Author {
	private String formation;

	public Evaluator() {
		super();	
	}

	public Evaluator(String name, String eMail, String formation) {
		super(name, eMail);
		this.formation = formation;
	}

	public String getFormation() {
		return formation;
	}
	public void setFormation(String formation) {
		this.formation = formation;
	}
}
