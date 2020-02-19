<div id="wrapper">
		<div id="header">
			<h2>Application Info</h2>
		</div>
</div>

<div id="container">
	<div id="content">
		<!--  add our html table here -->
		<table class="table table-bordered">
			<tr>
				<th scope="col">Income</th>
				<th scope="col">City</th>
				<th scope="col">Siblings</th>
				<th scope="col">Documents</th>
			</tr>
			<tr>
				<td>${application.income}</td>
				<td>${application.homeCity}</td>
				<td>${application.siblings}</td>
				<td><input class="form-check-input" type="checkbox" <c:if test="${application.documents}">checked</c:if>disabled></td>
			</table>
	</div>
</div>

<c:if test="${application.approved}">
	<a href="<c:url value="/score"></c:url>" class="btn btn-secondary">See your score & Ranking</a>
</c:if>