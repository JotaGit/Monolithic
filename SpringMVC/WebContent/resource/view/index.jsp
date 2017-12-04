<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<spring:url value="/editar" 	var="editarEntidadeUrl" 	htmlEscape="true"/>  
<spring:url value="/salvar" 	var="salvarEntidadeUrl" 	htmlEscape="true"/>
<spring:url value="/excluir" 	var="excluirEntidadeUrl" 	htmlEscape="true"/>

<html>
    <head>

    </head>	
    <body>
        <h3>CRUD Spring MVC</h3>
        
        <c:if test="${not empty mensagem}"> ${mensagem}</c:if>
        
        <form:form method="POST" action="${salvarEntidadeUrl}" modelAttribute="entidade">
             <table>
                <tr>
					<form:hidden  path="id"/>
                    <td><form:label path="inputTag">Input</form:label></td>
                    <td><form:input path="inputTag"/><form:errors path="inputTag"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Salvar"/></td>
                </tr>
            </table>
        </form:form>
        
        <br><br>
        
        <table>
        	<tr>
				<td>InputTag</td>
				<td colspan="2">InputTag</td>
        	</tr>

        <c:forEach items="${listagem}" var="ent">
        	<tr>
				<td>${ent.inputTag}</td>
				
				<td><a href="${editarEntidadeUrl}/${ent.id}" >Editar</a></td>
				<td><a href="${excluirEntidadeUrl}/${ent.id}" >Excluir</a></td>
				
        	</tr>
        </c:forEach>
        
        </table>
    </body>
</html>