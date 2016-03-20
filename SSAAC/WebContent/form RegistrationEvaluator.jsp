<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SSAAC - Cadastramento do Avaliador</title>
</head>
<body>
<h2>SAAC - Cadastramento de Avaliador</h2>
<%
	String msg = request.getParameter("msg");
	if (msg!=null && !msg.isEmpty()) {
		out.println("<h3 style=\"color:red\">"+msg+"</h3>");
	}
%>

<h3>Preencha as informações solicitadas:</h3>
<form action="/SSAAC/addEvaluatorAuthor" method="post">
Nome: <input type="text" name="name"/><p/>
E-mail: <input type="text" name="email"><p/>
Tipo: 	<select name="tipo" id="tipo" onchange="change()">
			<option>Avaliador</option>
			<option selected="selected">Docente</option>
		</select><p/>
<script>
	function change() {
		tipo = document.getElementById("tipo");
		texto = document.getElementById("texto");
		if (tipo.value == "Avaliador") {
			document.getElementById("botao").disable = "false";
			texto.innerHTML = 'Formação: <input type="text" name="formation"/><br/>';
		} else if (tipo.value == "Docente") {
			texto.innerHTML = 'Informação específica de docente';
		}
	}
</script>
<p id="texto">Informação específica de docente</p>
<input id="botao" type="submit" value="Efetuar o Cadastro">
</form>
</body>
</html>