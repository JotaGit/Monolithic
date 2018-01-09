<spring:url value="/salvar" var="salvarEntidadeUrl" htmlEscape="true" />

<div class="table-responsive">

	<form:form method="POST" action="${salvarEntidadeUrl}" modelAttribute="entidade">
		<form:hidden path="id" />
		<table class="table">
			<tr>
				<td><form:label path="inputTag" /> 
					<spring:message code="view.entidade.inputTag" />
				</td>
				<td>
					<form:input path="inputTag" /> 
					<form:errors path="inputTag" />
				</td>
			</tr>
			<tr>
				<td><form:label path="checkboxSingleTag" /> 
					<spring:message code="view.entidade.checkboxSingleTag" />
				</td>
				<td><form:checkbox path="checkboxSingleTag" /> 
					<spring:message code="view.entidade.checkboxSingleTag" /> 
					<form:errors path="checkboxSingleTag" />
				</td>
			</tr>
			<tr>
				<td><form:label path="checkboxMultipleTag" /> 
					<spring:message code="view.entidade.checkboxMultipleTag" />
				</td>
				<td><form:checkbox path="checkboxMultipleTag" value="1" /> 
						<spring:message code="view.entidade.checkboxTag1" /> 
					<form:checkbox path="checkboxMultipleTag" value="2" /> 
						<spring:message code="view.entidade.checkboxTag2" /> 
					<form:checkbox path="checkboxMultipleTag" value="3" /> 
						<spring:message code="view.entidade.checkboxTag3" /> 
						
					<form:errors path="checkboxMultipleTag" />
				</td>
			</tr>
			<tr>
				<td><form:label path="selectTag" /> 
					<spring:message code="view.entidade.selectTag" />
				</td>
				<td><form:select path="selectTag">
						<form:option path="optionsTag" value="optionsTag1" />
							<spring:message code="view.entidade.optionsTag1" />
						<form:option path="optionsTag" value="optionsTag2" />
							<spring:message code="view.entidade.optionsTag2" />
						<form:option path="optionsTag" value="optionsTag3" />
							<spring:message code="view.entidade.optionsTag3" />
					</form:select> 
					
					<form:errors path="selectTag" />
				</td>
			</tr>
			<tr>
				<td><form:label path="passwordTag" /> 
						<spring:message code="view.entidade.passwordTag" />
				</td>
				<td><form:password path="passwordTag" /> 
				
					<form:errors path="passwordTag" />
				</td>
			</tr>
			<tr>
				<td><form:label path="radiobuttonsTag" /> 
					<spring:message	code="view.entidade.radiobuttonsTag" />
				</td>
				<td><form:radiobutton path="radiobuttonsTag" value="1" /> 
					<spring:message code="view.entidade.radiobuttonsTag1" /> 
					<form:radiobutton path="radiobuttonsTag" value="2" /> 
					<spring:message code="view.entidade.radiobuttonsTag2" /> 
					<form:radiobutton path="radiobuttonsTag" value="3" /> 
					<spring:message code="view.entidade.radiobuttonsTag3" /> 
					<form:errors path="radiobuttonsTag" />
				</td>
			</tr>
			<tr>
				<td><form:label path="textareaTag" /> 
					<spring:message code="view.entidade.textareaTag" />
				</td>
				<td><form:textarea path="textareaTag" rows="4" cols="50" /> 
					<form:errors path="textareaTag" />
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="Salvar" class="btn btn-primary" title="Salvar"/>
				</td>
			</tr>
		</table>
	</form:form>

</div>
