<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="container">

	<form:form action="saveApplication" modelAttribute="maxAllowed" method="POST" class="ui form">
		<div class="form-group">
			<label>How many applications should we approve?</label> 
			<form:input path="maxAllowed" class="form-control"/>
		</div>
		<button class="btn btn-primary" type="submit">Save</button>
		<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
		<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
	</form:form>

</div>