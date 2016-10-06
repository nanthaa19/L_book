<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="http://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<title>login</title>
</head>
<body>
<body style="background-color: F5F5F5">
	<div class="container row">
		<nav class="navbar navbar-default navbar-fixed-top" style="background-color: #AC5685;">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavigationbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="index.jsp"><span class="icon-bar"></span>KL Book Statistics</a>
				</div>
				<jsp:include page="pages/navigation.jsp"></jsp:include>
			</div>
		</nav>
	</div>
	<div class="container" style="margin-top: 100px;">
		<div class="row">
			<div class="col-sm-12">
				<form class="form-horizontal" action="UserController?action=login" method="post">
					<div class="form-group">
						<label class="control-label col-sm-2" for="UserName">UserName :</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="UserName" name="UserName" required placeholder="Enter UserName or Mail-ID">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="Password">Password:</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="Password" required name="Password" placeholder="Enter Password">
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-4">
							<button type="submit" class="btn btn-default">Submit</button>
						</div>
					</div>
				</form>

			</div>

		</div>
	</div>


	<form action="controller1?action=login" method="post"></form>

	<%-- 	<div class="footerboard"><jsp:include page="footer.jsp"></jsp:include></div> --%>

</body>
</html>