<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST Method 계산 결과</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<% 
			Integer num1 = Integer.valueOf(request.getParameter("num1"));
			Integer num2 = Integer.valueOf(request.getParameter("num2"));
			String arithmetic = request.getParameter("arithmetic");
		%>
		<h1>계산 결과</h1>
		<div class="display-3 d-flex">
			<% 
				double result = 0;
				if (arithmetic.equals("+")) {
					result = (double) num1 + num2;
				} else if (arithmetic.equals("-")) {
					result = (double) num1 - num2;
				} else if (arithmetic.equals("*")) {
					arithmetic = "X";
					result = (double) num1 * num2;
				} else if (arithmetic.equals("/")) {
					result = (double) num1 / num2;
				}
			%>
			<div class="mr-3">
				<%= num1 %> <%= arithmetic %> <%= num2 %> = 			
			</div>
			<div class="text-primary"><%= result %></div>
		</div>
	</div>
</body>
</html>