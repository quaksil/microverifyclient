<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<jsp:include page="header.jsp" />
<p>
<br />
</p>

<div class="row">
	<div class="col-md-4 offset-md-4">
		<div class="login-form border border-1 rounded-1 bg-light mt-4 p-4">
			<form name="login" action="login" method="" class="row g-3">
				<h4>Agent Portal</h4>
				<div class="col-12">
					<label class="form-label" for="username">Username</label>

					<div class="input-group">
						<div class="input-group-text">@</div>
						<input type="text" name="username" class="form-control"
							id="username" placeholder="Username">

					</div>
					<div id="username" class="form-text">Your login is
						confidential.</div>
				</div>
				<div class="col-12">
					<label class="form-label" for="password">Password</label>

					<div class="input-group">
						<div class="input-group-text">
							<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16"
								fill="currentColor" class="bi bi-lock" viewBox="0 0 16 16">
  <path
									d="M8 1a2 2 0 0 1 2 2v4H6V3a2 2 0 0 1 2-2zm3 6V3a3 3 0 0 0-6 0v4a2 2 0 0 0-2 2v5a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V9a2 2 0 0 0-2-2zM5 8h6a1 1 0 0 1 1 1v5a1 1 0 0 1-1 1H5a1 1 0 0 1-1-1V9a1 1 0 0 1 1-1z" />
</svg>
						</div>
						<input type="password" name="password" class="form-control"
							id="password" placeholder="Your password">

					</div>

				</div>
				<div class="col-12">
					<button type="submit" class="btn btn-primary btn-sm float-end">Login</button>
				</div>
			</form>



			<hr class="mt-4">
			<div class="col-12">
				<p class="h6 text-center mb-0">SOA & Cloud Computing</p>
			</div>
		</div>
	</div>
</div>


<jsp:include page="footer.jsp" />
</html>