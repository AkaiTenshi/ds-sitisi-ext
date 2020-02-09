<div id="wrapper">
		<div id="header">
			<h2>Application Info</h2>
		</div>
</div>

<div id="container">
	<div id="content">
		<!--  add our html table here -->
		<table>
			<tr>
				<th>Income</th>
				<th>City</th>
				<th>Siblings</th>
				<th>Documents</th>
			</tr>
			<tr>
				<td>${application.income}</td>
				<td>${application.homeCity}</td>
				<td>${application.siblings}</td>
				<td><input type="checkbox" <c:if test="${application.documents}">checked</c:if>></td>
			</table>
	</div>
</div>

<c:if test="${application.approved}">
	<a href="<c:url value="/student/score"></c:url>" class="btn btn-link">See your score & Ranking</a>
</c:if>