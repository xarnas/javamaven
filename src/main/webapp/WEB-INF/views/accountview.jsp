<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="resources/css/styleindex.css">
<link rel="stylesheet" href="resources/css/accountview.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<title>My Income/Outcome</title>
<%@ page isELIgnored="false"%>
</head>
<body>
	<div class="container">
		<header>
			<h1>Income/Outcome App</h1>
		</header>
		<nav>
			<ul>
				<li><a href="form">Form</a></li>
				<li><a href="accountview">Account View</a></li>
			</ul>
		</nav>
		<article>
			<script type="text/javascript">
	        var JSONArray = ${income};
	        var i = 0;
	        console.log(JSONArray);
	    	document.writeln("<br><br><div align='center'><table border='0'>");
	        document.writeln("<tr><th>Id</th><th>Type</th><th>Value</th></tr>");
	    	for ( var i = 0; i < JSONArray.length; i++) {
	    		var obj = JSONArray[i];
	    		var crunchifyName;
	    		var crunchifyValue;
	    		document.writeln("<tr>");
 	    			document.writeln("<td>"+obj["id"].toString()+ "</td>");
 	    			document.writeln("<td>"+obj["name"].toString()+ "</td>");
 	    			document.writeln("<td>"+obj["money"].toString()+ "</td>");
  	    		document.writeln("<tr>");
	    	}
	    	document.writeln("</table></div>");
    </script>  
		</article>
		<footer>Java</footer>
	</div>
</body>
</html>


