<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>Customer2</title>
</head>
<body>
	<nav class="navbar navbar-dark bg-primary">
		<div class="container">
			<a class="navbar-brand" href="#">Customer 2</a>
		</div>
		<div class="d-grid gap-2 d-md-flex justify-content-md-end">
			<form action="/Juhosi_Assignment/" method="GET">
				<button type="submit" class="btn btn-success mx-5">Home</button>
			</form>
		</div>
	</nav>
	<div class="w-50 p-3 align-self-center mx-auto my-3"
		style="background-color: #eee;">
		<form action="insert2" class="row g-3">
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Order
					Date</label> <input type="date" class="form-control"
					id="exampleFormControlInput1" name="order_date"
					placeholder="name@example.com" required>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Company</label>
				<input class="form-control" type="text" name="company"
					placeholder="Default input" aria-label="default input example"
					required>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Owner</label>
				<input class="form-control" type="text" name="owner"
					placeholder="Default input" aria-label="default input example"
					required>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Item</label>
				<input class="form-control" type="text" name="item"
					placeholder="Default input" aria-label="default input example"
					required>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Quantity</label>
				<input class="form-control" type="number" step="1" name="quantity"
					placeholder="Default input" aria-label="default input example"
					required>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Weight</label>
				<input class="form-control" type="number" step="0.01" name="weight"
					placeholder="Default input" aria-label="default input example"
					required>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Request
					For Shipment</label> <input class="form-control" type="text"
					name="request_for_shipment" placeholder="Default input"
					aria-label="default input example" required>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Tracking
					ID</label> <input class="form-control" type="text" name="tracking_id"
					placeholder="Default input" aria-label="default input example"
					required>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Box
					Count</label> <input class="form-control" type="number" name="box_count"
					placeholder="Default input" aria-label="default input example"
					required>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Specialization</label>
				<input class="form-control" type="text" name="specialization"
					placeholder="Default input" aria-label="default input example"
					required>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Checklist
					Quantity</label> <input class="form-control" type="text"
					name="checklist_quantity" placeholder="Default input"
					aria-label="default input example" required>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>