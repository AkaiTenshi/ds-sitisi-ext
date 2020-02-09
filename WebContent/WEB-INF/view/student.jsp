<div id="wrapper">
		<div id="header">
			<h2>Student Info</h2>
		</div>
</div>

<div id="container">
	<div id="content">
		<!--  add our html table here -->
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Semester</th>
				<th>Contact</th>
			</tr>
			<tr>
				<td>${currentStudent.firstname}</td>
				<td>${currentStudent.lastname}</td>
				<td>${currentStudent.semester}</td>
				<td>${currentStudent.phone}</td>
			</table>
	</div>
</div>

<c:if test="${currentStudent.canSubmit}">
	<a href="<c:url value="/student/application"></c:url>" class="btn btn-link">Apply for Board</a>
</c:if>