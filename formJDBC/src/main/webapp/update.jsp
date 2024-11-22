<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
<div class="mb-3">
<label class="form-label">Name</label>
<input type="text" class="form-control"name="name" required="required" >
</div>
<div class="mb-3">
<label class="form-label">Address</label>
<input type="text" class="form-control"name="address" required="required" >
</div>
<div class="mb-3">
<label class="form-label">Email</label>
<input type="text" class="form-control"name="email" required="required" >
</div>
<input type="submit" value="update">
</form>
</body>
</html>
