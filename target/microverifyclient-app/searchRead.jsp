<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page
	import="dbhelpers.SearchQueryStub.Students,java.util.ArrayList,java.text.SimpleDateFormat"%>
<html>
<jsp:include page="header.jsp" />
<p>
	<br />
</p>
<p></p>



<div class="row">
	<div class="col">
		<h3>Student List</h3>
	</div>
	<div class="col-md-5">
		<form name="verifyForm" action="verify" method="GET">

			<div class="input-group">
				<div class="input-group-text">
					<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
						fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
  <path
							d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z" />
</svg>
				</div>
				<input type="text" class="form-control form-control-sm"
					name="searchVal" id="searchField"
					placeholder="Search (Fullname, Student Id, Firstname or Lastname)"
					value="" />
			</div>
		</form>
	</div>

	<div class="col-auto">
		<a href="index.jsp" class="btn btn-primary btn-sm">My Portal</a>
	</div>

</div>




<%
	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	Students[] students = new Students[0];

	String status = (String) request.getAttribute("utilOutput");
	students = (Students[]) request.getAttribute("students");
%>

<%
	if (students == null) {
%>
<p class="text-danger">No data is present, try searching.</p>
<%
	} else {
%>
<%=status%>


<table
	class='table table-bordered table-striped table-hover text-nowrap'>

	<thead>
		<tr>
			<th>#</th>
			<th>Firstname</th>
			<th>Lastname</th>
			<th>Registration</th>
			<th>Status</th>
			<th class='text-center'>Action</th>
	</thead>
	<tbody>

		<%
			for (int i = 0; i < students.length; i++) {
		%>

		<tr>
			<td><%=students[i].getId()%></td>

			<td><%=students[i].getFirstname()%></td>

			<td><%=students[i].getLastname()%></td>

			<%
				int isAuthorizedYear = students[i].getLastyear();
			%>

			<%
				if (isAuthorizedYear == 2021) {
			%>

			<td class="text-decoration-none text-success"><%=isAuthorizedYear%></td>
			<td class="text-decoration-none text-success"><b>Authorized</b></td>

			<%
				} else {
			%>
			<td class="text-decoration-none text-danger"><%=isAuthorizedYear%>
			</td>
			<td class="text-decoration-none text-danger"><b>Unauthorized</b></td>
			<%
				}
			%>

			<td class='text-center'>

				<button type="button" class="btn btn-warning btn-sm"
					onClick="window.open
('view?studentId=<%=students[i].getId()%>','window','width=500,height=500')">Photo</button>
		</tr>

		<%
			}
		%>
	</tbody>
</table>
<%
	}
%>
<jsp:include page="footer.jsp" />
</html>
