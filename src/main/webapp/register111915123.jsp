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
					<label for="chk" aria-hidden="true"><h1>!! Sign Up Page !!</h1></label>
					<br/>
					<h3>** Basic Details **</h3>
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
					
					<h3>** Salary Details **</h3>
					<input type="text" name="jobrole" placeholder="jobrole" required="">
					<br/>
					<input type="text" name="monthlysalary" placeholder="Monthly Salary" required="">
					<br/>
					<input type="text" name="yearlybonus" placeholder="Yearly Bonus" required="">
					<br/>
					<input type="password" name="pass" placeholder="Password" required="">
					<br/>
					<div>
					<br>
						<button type="submit">Sign up</button>
					</div>
					
	</form>
</body>
</html>