<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>길이 변환 결과 문제 연습</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<% 
		Integer value = Integer.valueOf(request.getParameter("value"));
		String[] types = request.getParameterValues("measure");
	%>
	<div class="container">
		<h1>길이 변환 결과</h1>
		<h3><%= value %>cm</h3>
		<hr>
		<h2>
		<% 
			if (types != null) {
				for (String type : types) {
					if (type.equals("inch")) {
						double inch = value * 0.393701;
						out.print(inch + " in<br>");
					} else if (type.equals("yard")) {
						double yard = value * 0.010936;
						out.print(yard + " yd<br>");
					} else if (type.equals("feet")) {
						double feet = value * 0.032808;
						out.print(feet + " ft<br>");
					} else if (type.equals("meter")) {
						double meter = value * 0.01;
						out.print(meter + " m<br>");
					}
				}
			}
		%>
		</h2>
	</div>
</body>
</html>