<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<title>My Income/Outcome</title>
<%@ page isELIgnored="false"%>
</head>
<body>
	<h2>My Account</h2>
	 <script type="text/javascript">
	    console.log(${income});
	        var JSONArray = ${income};
	        
	        var i = 0
	    	document.writeln("<br><br><div align='center'><table border='0'><tr>");
	     
	    	for ( var i = 0; i < JSONArray.length; i++) {
	    		var obj = JSONArray[i];
	    		console.log(obj);
	    		var crunchifyName;
	    		var crunchifyValue;
	     
	    		document.writeln("<td>");
	    		document.writeln("<table border='0'  width=100 >");
	     
	    		for ( var key in obj) {
	    			crunchifyName = key;
	    			crunchifyValue = obj[key].toString();
	    			+document.writeln("<tr><td><B>" + crunchifyName
	    					+ ":  </B></td><td width=50>" + crunchifyValue
	    					+ "</td></tr>");
	    			document.writeln("</table>");
	    			document.writeln("</td>");
	     
	    		}
	    	}
	    	document.writeln("</tr></table></div>");
	        
    </script>  
</body>
</html>

