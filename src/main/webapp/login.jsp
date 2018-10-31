<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<style>
#general {
    height: 100%;
    width: 100%;
   background-color:#e0e0e0;
}
#medium{
	margin-left:33%;
	margin-top:5%;
	margin-bottom:20%;
	margin-right:20%;
	height:50%;
    width: 30%;
    background-color:#e0e0e0;
}
input[type=text],[type=password],select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=submit]:hover {
    background-color: #efb558;
}

input[type=submit] {
    width: 100%;
    background-color: #f28b00;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
p{
font-family:Arial;
text-align:center;
color:#f28b00;
font-size: 1.875em;
font-weight:bold;
}
</style>

<body>
<div id="general">&nbsp;
<div id="medium">
<p>SIGN IN</p>
<form action="log" method="post">

<input type="text" name="username" placeholder="Username"><br>

<input type="password" name="user_password" placeholder="Password"><br>

  
    <input type="submit" value="Submit">
  </form>
</div>

</div>


</body>
</html>