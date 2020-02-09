<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="ui segment">

	<form:form action="saveStudent" modelAttribute="newStudent" method="POST" class="ui form">
		<div class="field">
			<label>First Name</label> 
			<form:input path="firstname"/>
		</div>
		<div class="field">
			<label>Last Name</label>
			<form:input path="lastname"/>
		</div>
		<div class="field">
			<label>Semester</label> 
			<form:input path="semester"/>
		</div>
		<div class="field">
			<label>Contact</label>
			<form:input path="phone"/>
		</div>
		<button class="ui button" type="submit">Save</button>
		<input type="hidden" id="csrfToken" value="${_csrf.token}"/>
		<input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
	</form:form>

</div>