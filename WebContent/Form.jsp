<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Person</title>

</head>
<body>

	<div>
		<center>
			<h3>Add a new person</h3>
		</center>
		<form action="PersonController" method="post">
			<table align="center">
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="firstName" /></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lastName" /></td>
				</tr>
				<tr>
					<td>Date of Birth:</td>
					<td><input type="date" name="dob" /></td>
				</tr>
				<tr>
					<td>City:</td>
					<td><input type="text" name="city" /></td>
				</tr>
				<tr>
					<td>State:</td>
					<td><input type="text" name="state" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Save"></input>
					<input type="reset" value="Reset"></input></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>