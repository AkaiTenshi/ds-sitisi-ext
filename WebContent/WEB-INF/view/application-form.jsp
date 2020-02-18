<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="ui segment">

	<form:form action="saveApplication" modelAttribute="newApplication" method="POST" class="ui form">
		<div class="form-group">
			<label>Income</label> 
			<form:input path="income" class="form-control"/>
		</div>
		<div class="form-group">
			<label>City</label>
			<form:input path="homeCity" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Siblings</label> 
			<form:input path="siblings" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Documents</label>
			<form:checkbox path="documents" class="form-control"/>
		</div>
		<button class="btn btn-primary" type="submit">Save</button>
		<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
		<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
	</form:form>

</div>