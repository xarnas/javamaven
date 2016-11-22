<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/css/styleindex.css">
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
			<div align="center">
		        
		<form:form action="form" method="post" commandName="itemForm">
            <table border="0">
				<tr>
					<td colspan="2" align="center"><h2>My Income/Outcome</h2></td>
				</tr>
				<tr>
					<td>Insert non-existing type:</td>
					<td><form:input path="iType" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Insert" /></td>
				</tr>
			</table>
        </form:form>
		    
	</div>
		</article>

		<footer>Java</footer>

	</div>

</body>
</html>