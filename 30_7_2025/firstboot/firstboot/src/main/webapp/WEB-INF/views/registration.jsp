<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
	<h1>Registration Form</h1>
	<form action="testsubmit" method="post" modelAttribute="regdata">

		<div>
			Name : <input type="text" name="userName" />
		</div>
		
		<div>
			Email : <input type="text" name="userEmail" />
		</div>
		
		<div>
			Phone number : <input type="text" name="userPhoneNumber" />
		</div>
		
		<div>
			<button type="submit">Register</button>
		</div>


	</form>
</body>
</html>