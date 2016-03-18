<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="error" items="${errors}">
	    ${error.category} - ${error.message}<br />
	</c:forEach>
	<form action="/pagamentos/pagamentos/novo" method="post">
		<div>
			<label> Bandeira <input type="text" name="form.bandeira"
				value="${form.bandeira}" />
			</label>
		</div>
		<div>
			<label> Número <input type="text" name="form.numero"
				value="${form.numero}" />
			</label>
		</div>
		<div>
			<label> CVV <input type="text" name="form.cvv"
				value="${form.cvv}" />
			</label>
		</div>
		<fieldset>
			<legend>Novo cliente</legend>
			<div>
				<label> Nome <input type="text"
					name="form.novoClienteForm.nome"
					value="${form.novoClienteForm.nome}" />
				</label>
			</div>
			<div>
				<label> Email <input type="text"
					name="form.novoClienteForm.email"
					value="${form.novoClienteForm.email}" />
				</label>
			</div>
		</fieldset>
		<fieldset>
			<legend>Cliente antigo</legend>
			<div>
				<label> Email <input type="text" name="form.emailExistente"
					value="${form.emailExistente}" />
				</label>
			</div>
		</fieldset>

		<input type="submit" value="Novo pagamento">
	</form>
</body>
</html>