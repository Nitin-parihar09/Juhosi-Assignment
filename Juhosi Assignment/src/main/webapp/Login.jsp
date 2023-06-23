<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
	integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous"></script>
<title>Log-in</title>
</head>
<body>
	<nav class="navbar navbar-dark bg-primary">
		<div class="container">
			<a class="navbar-brand" href="#">Log In</a>
		</div>
		<div class="d-grid gap-2 d-md-flex justify-content-md-end ">
			<form action="/Juhosi_Assignment/" method="GET">
				<button type="submit" class="btn btn-success mx-5">Home</button>
			</form>
		</div>
	</nav>
	<section class="vh-100">
		<div class="container py-5 h-100">
			<div
				class="row d-flex align-items-center justify-content-center h-100">
				<div class="col-md-8 col-lg-7 col-xl-6">
					<img
						src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
						class="img-fluid" alt="Phone image">
				</div>
				<div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
					<form action="login">
						<!-- Email input -->
						<div class="form-outline mb-4">
							<input type="text" id="form1Example13" name="username"
								class="form-control form-control-lg" placeholder="admin" /> <label
								class="form-label" for="form1Example13">User</label>
						</div>

						<!-- Password input -->
						<div class="form-outline mb-4">
							<input type="password" id="form1Example23" name="password"
								class="form-control form-control-lg" /> <label
								class="form-label" for="form1Example23">Password</label>
						</div>


						<!-- Submit button -->
						<button type="submit" class="btn btn-primary btn-lg btn-block">Log
							in</button>
					</form>
				</div>
			</div>
		</div>
	</section>
</body>
</html>