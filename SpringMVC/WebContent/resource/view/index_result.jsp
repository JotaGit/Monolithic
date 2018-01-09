<spring:url value="/excluir" var="excluirEntidadeUrl" htmlEscape="true" />
<spring:url value="/editar" var="editarEntidadeUrl" htmlEscape="true" />

<table class="table table-striped">
	<thead>
		<tr>
			<th><spring:message code="view.entidade.inputTag" /></th>
			<th><spring:message code="view.entidade.checkboxSingleTag" /></th>
			<th><spring:message code="view.entidade.checkboxMultipleTag" /></th>
			<th><spring:message code="view.entidade.selectTag" /></th>
			<th><spring:message code="view.entidade.passwordTag" /></th>
			<th><spring:message code="view.entidade.optionsTag" /></th>
			<th><spring:message code="view.entidade.textareaTag" /></th>
			<th colspan="2"><spring:message code="view.entidade.actions" /></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listagem}" var="ent">
			<tr>
				<td>${ent.inputTag}</td>
				<td>${ent.checkboxSingleTag}</td>
				<td>${ent.checkboxMultipleTag.toString()}</td>
				<td>${ent.selectTag}</td>
				<td>${ent.passwordTag}</td>
				<td>${ent.radiobuttonsTag}</td>
				<td>${ent.textareaTag}</td>

				<td><a href="${editarEntidadeUrl}/${ent.id}">
					<span class="glyphicon glyphicon-pencil" aria-hidden="true" title="<spring:message code="view.entidade.editbutton" />">
					</a></td>
				<td><a href="${excluirEntidadeUrl}/${ent.id}">
					<span class="glyphicon glyphicon-trash" aria-hidden="true" title="<spring:message code="view.entidade.deletebutton" />">
					</a></td>

			</tr>
		</c:forEach>
	</tbody>
</table>