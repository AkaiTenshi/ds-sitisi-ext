<div id="wrapper">
		<div id="header">
			<h2>Student Info</h2>
		</div>
</div>

<div id="container">
	<div id="content">
		<!--  add our html table here -->
		<table class="table table-bordered">
			<tr>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Semester</th>
				<th scope="col">Contact</th>
			</tr>
			<tr>
				<td>${currentStudent.firstname}</td>
				<td>${currentStudent.lastname}</td>
				<td>${currentStudent.semester}</td>
				<td>${currentStudent.phone}</td>
			</table>
	</div>
</div>

<c:choose>
    <c:when test="${currentStudent.canSubmit}">
        <a href="<c:url value="/student/application"></c:url>" class="btn btn-secondary">Apply for Board</a>
    </c:when>    
    <c:otherwise>
        Your account has not yet been approved. Please wait for permission before making an application. 
        <br />
    </c:otherwise>
</c:choose>