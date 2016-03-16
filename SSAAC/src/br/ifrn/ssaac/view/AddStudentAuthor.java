package br.ifrn.ssaac.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ifrn.ssaac.business.facade.SSAAC;
import br.ifrn.ssaac.business.factory.SSAACFactory;
import br.ifrn.ssaac.business.model.Student;

@WebServlet("/addStudentAuthor")
public class AddStudentAuthor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddStudentAuthor() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recupera uma instância da fachada a partir da fábrica
		SSAAC facade = SSAACFactory.getInstance().getFacade();
		
		// Recuperando parâmetros do formulário
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String course = request.getParameter("course");
		// Testa se os parâmetros são válidos
		if (name != null && !name.isEmpty() && 
				email != null && !email.isEmpty() &&
				course != null && !course.isEmpty()) {
			// Cria o objeto aluno-autor a ser inserido
			Student student = new Student(name, email, course);
			// Solicita a fachada que insira o dado aluno-autor
			facade.addStudentAuthor(student);
			response.sendRedirect("/SSAAC/success.jsp?msg=Aluno%20inserido");
		} else {
			response.sendRedirect("/SSAAC/formCadastro.jsp?msg=Parâmetros%20inválidos");
		}
	}
}