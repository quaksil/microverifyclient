<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="javax.servlet.http.HttpSession;"%>
<html>
<jsp:include page="header.jsp" />
<p>
	<br />
</p>

<%
	HttpSession indexsession = request.getSession(false);
%>

<div class="row">
	<div class="col-md-4 offset-md-4">
		<div class="login-form border border-1 rounded-1 bg-light mt-4 p-4">

			<h4>Student Database</h4>
			<p></p>
			<a class="text-decoration-none" href="profile">Profile</a><br /> <a
				class="text-decoration-none" href="search.jsp">Search
				Students</a> <br />

			<%
				if (indexsession.getAttribute("username") != null) {
			%>
			<a class="text-danger text-decoration-none" href="logout">Logout</a>

			<%
				} else {
			%>

			<a class="text-decoration-none" href="login.jsp">Login</a>
			<%
				}
			%>

			<hr class="mt-4">
			<div class="col-12">
				<p class="h6 text-center mb-0">SOA & Cloud Computing</p>
			</div>
		</div>
	</div>
</div>

<jsp:include page="footer.jsp" />
</html>
