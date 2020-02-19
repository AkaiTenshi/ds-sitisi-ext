<div id="wrapper">
		<div id="header">
			<h2>Your Ranking</h2>
		</div>
</div>

<div id="container">
	<div id="content">
		<!--  add our html table here -->
		<table class="table table-bordered">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Score</th>
				<th scope="col">Ranking</th>
			</tr>
			<tr>
				<td>${score.income}</td>
				<td>${score.homeCity}</td>
				<td>${score.siblings}</td>
			</table>
	</div>
</div>

<c:if test="${score.approved}">
	<div class="alert alert-success" role="alert">
  		Congrats, you have been approved for board!
	</div>
</c:if>