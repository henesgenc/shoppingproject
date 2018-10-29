<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<title>Shopping</title>
<style>
	.jumbotron{
		background-color:orange;
	}
	#banner{
		color:white;
		font-size:32pt;
	}
	#login-reg{
		position:absolute;
		left:89%;
		top:3%;
		width:10%;
	}
	#login-reg a{
		padding:7%;
		float:left;
		background:gray;
		margin:3px;
		color:black;
	}
	#login-reg a:active{
		background:black;
		color:white;
	}
	.popup {
    cursor: pointer;
    float:left;
    display:inline-block;
    padding:7%;
	background:gray;
	margin:3px;
	color:black;
}

/* The actual popup (appears on top) */
.popup .popuptext {
    visibility: hidden;
    width: 200%;
    background-color: #555;
    color: #fff;
    text-align: center;
    border-radius: 6px;
    padding: 8px 0;
    padding-bottom:20px;
    position: absolute;
    bottom:-350%;
    z-index: 1;
    left: -50%;
    margin-left: -80px;
}

/* Popup arrow */
.popup .popuptext::after {
    content: "";
    position: absolute;
    top: 100%;
    left: 50%;
    margin-left: -5px;
}

/* Toggle this class when clicking on the popup container (hide and show the popup) */
.popup .show {
    visibility: visible;
    -webkit-animation: fadeIn 1s;
    animation: fadeIn 1s
}

/* Add animation (fade in the popup) */
@-webkit-keyframes fadeIn {
    from {opacity: 0;} 
    to {opacity: 1;}
}

@keyframes fadeIn {
    from {opacity: 0;}
    to {opacity:1 ;}
}
</style>
<script>
// When the user clicks on <div>, open the popup
function myFunction() {
    var popup = document.getElementById("myPopup");
    popup.classList.toggle("show");
}
</script>
<body>
<div class="jumbotron"><p id="banner">Shopping</p></div>

<div id="login-reg"><div class="popup" onclick="myFunction()">Login
  <span class="popuptext" id="myPopup">
  Login
  <hr>
  Username:
  <input type="text">
  <hr>
  Password:&nbsp;
  <input type="text">
  </span>
</div><a href="">Register</a></div>
<div id="content">
<div id="products">
</div>
</div>
<div id="contact"></div>
</body>
</html>
