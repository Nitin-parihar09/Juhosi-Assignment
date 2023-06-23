<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.nitin.DAO.UserDAO"%>
<%@page import="java.util.*"%>
<%
UserDAO dao = new UserDAO();
HashMap<String, String> map = new HashMap<>();
map = dao.admin();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Admin</title>
</head>
<body>
	<nav class="navbar navbar-dark bg-primary">
		<div class="container">
			<a class="navbar-brand" href="#">Admin</a>
			<div class="d-grid gap-2 d-md-flex justify-content-md-end">
				<form action="/Juhosi_Assignment/" method="GET">
					<button type="submit" class="btn btn-success mx-5">Home</button>
				</form>
			</div>
		</div>
	</nav>
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">Item/Customer</th>
				<th scope="col">Customer 1</th>
				<th scope="col">Customer 2</th>
				<th scope="col">Total</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">Quantity</th>
				<td><%=map.get("C1_Quantity")%></td>
				<td><%=map.get("C2_Quantity")%></td>
				<td><%=map.get("totalQuantity")%></td>


			</tr>
			<tr>
				<th scope="row">Weight</th>
				<td><%=map.get("C1_Weight")%></td>
				<td><%=map.get("C2_Weight")%></td>
				<td><%=map.get("totalWeight")%></td>

			</tr>
			<tr>
				<th scope="row">Box Count</th>
				<td><%=map.get("C1_BC")%></td>
				<td><%=map.get("C2_BC")%></td>
				<td><%=map.get("totalBC")%></td>
			</tr>
		</tbody>
	</table>

</body>
</html>