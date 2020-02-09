<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="ui segment">

	<form:form action="saveApplication" modelAttribute="newApplication" method="POST" class="ui form">
		<div class="field">
			<label>Income</label> 
			<form:input path="income"/>
		</div>
		<div class="field">
			<label>City</label>
			<form:input path="homeCity"/>
		</div>
		<div class="field">
			<label>Siblings</label> 
			<form:input path="siblings"/>
		</div>
		<div class="field">
			<label>Documents</label>
			<form:checkbox path="documents"/>
		</div>
		<button class="ui button" type="submit">Save</button>
		<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
		<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
	</form:form>

</div>