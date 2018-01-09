<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<spring:url value="/" var="home" htmlEscape="true" />
<spring:url value="/resource/" var="resource" htmlEscape="true" />

<html lang="en">
<head>
    <!-- Bootstrap -->
    <link href="${resource}css/bootstrap.min.css" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body>

	<div class="panel panel-default">
		<div class="panel-heading"><strong> <a href="${home}"><spring:message code="header.title" /> </strong></div></a>
		<div class="panel-body">

			<c:if test="${not empty mensagem}">
				<div class="alert alert-success">
					<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					<strong>Success!</strong> ${mensagem}
				</div>
			</c:if>