<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register for courses!</title>
</head>
<body>
	<form action = "./register" method="POST">
		<table>
			<tr>
				<td>User Name : <input type="text" name = "username" /></td>
			</tr>
			<tr>
				<td>Gender : <input type="radio" name = "gender" value="Male"/>Male
					<input type="radio" name = "gender" value = "Female"/>Female
				</td>
			</tr>
			<tr>
				<td>
					Java <input type = "checkbox" name="Language" value="Java"/>
					C++ <input type = "checkbox" name="Language" value="C++"/>
					Python <input type = "checkbox" name="Language" value="Python"/>
				</td>
			</tr>
			<tr>
				<td>Duration :<select name="Duration">
					<option value="3 Weeks">3 Weeks</option>
					<option value="4 Weeks">4 Weeks</option>
					<option value="5 Weeks">5 Weeks</option>
					</select>
					
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
				
		</table>
	</form>

</body>
</html>