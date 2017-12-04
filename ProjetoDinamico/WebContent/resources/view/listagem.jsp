 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
   <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
  
   <spring:url value="/index" var="indexUrl" htmlEscape="true"/>
 <a href="${indexUrl}">Cadastrar outro</a>
  
  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Nome</th><th>Descrição</th></tr>  
   <c:forEach var="item" items="${lista}">   
	   <tr>  
		   <td>${item.id}</td>  
		   <td>${item.nome}</td>  
		   <td>${item.descricao}</td>  
	   </tr>  
   </c:forEach>  
   </table>  