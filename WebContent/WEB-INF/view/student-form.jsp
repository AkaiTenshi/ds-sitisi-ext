<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="container">

	<form:form action="saveStudent" modelAttribute="newStudent" method="POST" class="ui form">
		<div class="form-group">
			<label>First Name</label> 
			<form:input path="firstname" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Last Name</label>
			<form:input path="lastname" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Semester</label> 
			<form:input path="semester" class="form-control"/>
		</div>
		<div class="form-group">
			<label>Contact</label>
			<form:input path="phone" class="form-control"/>
		</div>
		<button class="btn btn-primary" type="submit">Save</button>
		<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
		<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
	</form:form>

</div>