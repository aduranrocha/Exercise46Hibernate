<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Read Product</h2>
	<form action="ReadProdcutServlet" method="POST">
		<p>
			<label for="txtProduct"></label>
			<input type="text" id="txtIdProduct" name="txtIdProduct">
		</p>
		<input type="submit" value="Read Product">
	</form>
</body>
</html>