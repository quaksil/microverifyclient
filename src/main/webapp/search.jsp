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
			<form name="verify" action="verify" method="" class="row g-3">
				<h4>Verification Service</h4>
				<div class="col-12">
					<label class="form-label" for="searchField"></label>
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
							placeholder="Search w/ Code or Name" value="" />

					</div>
				</div>
				<div class="col-12">
					<button type="submit" class="btn btn-primary btn-sm float-end">Search</button>
					<a href="index.jsp" class="btn btn-default btn-sm float-end">Go Back</a>
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