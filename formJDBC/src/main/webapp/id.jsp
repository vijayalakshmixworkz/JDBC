<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="search" method="post">
<h1 class="text-center">Registration From</h1>
<div class="mb-3">
<label class="form-label">Id</label><br>
<input type="search" class="form-control" name="id" required="required">
</div>
<input type="submit" class="form-control" value="APPLY" style="color:blue">
<h2>${id}</h2>
</form>
</body>
</html>

