
package br.ifrn.ssaac.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ifrn.ssaac.business.facade.SSAAC;
import br.ifrn.ssaac.business.factory.SSAACFactory;
import br.ifrn.ssaac.business.model.Evaluator;;

@WebServlet("/addEvaluatorAuthor")
public class AddEvaluatorAuthor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddEvaluatorAuthor() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recupera uma instância da fachada a partir da fábrica
		SSAAC facade = SSAACFactory.getInstance().getFacade();
		
		// Recuperando parâmetros do formulário
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String formation = request.getParameter("formation");
		// Testa se os parâmetros são válidos
		if (name != null && !name.isEmpty() && 
				email != null && !email.isEmpty() &&
				formation != null && !formation.isEmpty()) {
			// Cria o objeto aluno-autor a ser inserido
			Evaluator evaluator = new Evaluator(name, email, formation);
			// Solicita a fachada que insira o dado avaliador-autor
			facade.addEvaluatorAuthor(evaluator);
			response.sendRedirect("/SSAAC/success.jsp?msg=Aluno%20inserido");
		} else {
			response.sendRedirect("/SSAAC/formCadastro.jsp?msg=Parâmetros%20inválidos");
		}
	}
}