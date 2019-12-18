<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="Stylesheet" href="css/bootstrap.min.css">
<link rel="Stylesheet" href="css/style.css">
</head>
<body>
	<h2>Create Product</h2>
	<form action = "CreateProductServlet" method = "post">
	<p>
		<label for="txtIdProduct">ID Product:</label>
		<input type="text" id="txtIdProduct" name="txtIdProduct" disabled>
	</p>
	<p>
		<label for="txtNameProduct">Name Product:</label>
		<input type="text" id="txtNameProduct" name="txtNameProduct">
	</p>
	<p>
		<label for="txtPriceProduct">Price Product:</label>
		<input type="text" id="txtPriceProduct" name="txtPriceProduct">
	</p>
	<input class="btn btn-info" type="submit" value="Create Product">
	</form>
	<script src="js/jquery-3.4.1.min.js"></script>
	<script src="js/popper.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/script.js"></script>
</body>
</html>