<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Pagina de Cadastro</title>
</head>
<body>

<form:form method="POST" action="/ProjetoDinamico/acao" >
<table>
    <tr>	
        <td>Nome :</td>
        <td><form:input path="nome" /></td>
    </tr>
    <tr>
        <td>User Name :</td>
        <td><form:input path="descricao" /></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="Register"></td>
    </tr>
</table>
</form:form>

</body>
</html>