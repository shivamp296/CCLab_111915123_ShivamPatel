<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Registershivam" method="post">
					<label for="chk" aria-hidden="true">Sign up</label>
					<br/>
					<input type="text" name="eid" placeholder="Employee_Id" required="">
					<br/>
					<input type="text" name="fname" placeholder="First Nmae" required="">
					<br/>
					<input type="text" name="lname" placeholder="Last Name" required="">
					<br/>
					<input type="text" name="dob" placeholder="DOB" required="">
					<br/>
					<input type="text" name="contact" placeholder="Contact Number" required="">
					<br/>
					
					<h1>Salary Details</h1>
					<input type="text" name="jobrole" placeholder="jobrole" required="">
					<br/>
					<input type="text" name="monthlysalary" placeholder="Monthly Salary" required="">
					<br/>
					<input type="text" name="yearlybonus" placeholder="Yearly Bonus" required="">
					<br/>
					<input type="password" name="pass" placeholder="Password" required="">
					<br/>
					<button type="submit">Sign up</button>
	</form>
</body>
</html>