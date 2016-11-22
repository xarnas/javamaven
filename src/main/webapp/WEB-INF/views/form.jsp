<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="resources/css/styleindex.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
				        
				<form:form action="form" method="post" commandName="userForm">
            <table border="0">
						<tr>
							<td colspan="2" align="center"><h2>My Income/Outcome</h2></td>
						</tr>
						<tr>
							<td>Item:</td>  
							<td><form:select path="itemName">
									<script type="text/javascript">
									 var A =${itemNameA};
									 var B =${typeA};
										console.log(A);
										console.log(B);
									</script>
									<c:forEach items="${itemNameA}" var="itemNameValue">
										<form:option value="itemNameValue">itemNameValue</form:option>
									</c:forEach>
								</form:select></td>
							<td><a href="mType">--->insert money new type</a></td>
						</tr>
						<tr>
							<td>Money:</td>
							<td><form:input path="money" /></td>
						</tr>
						<tr>
							<td>Type:</td>  
							<td><form:select path="type">
									<c:forEach items="${typeA}" var="typeA">
										<form:option value="${typeA}">${typeA}</form:option>
									</c:forEach>
								</form:select></td>
							<td><a href="iType">--->insert new type</a></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="Add" /></td>
						</tr>
					</table>
        </form:form>
				    
			</div>
		</article>

		<footer>Java</footer>

	</div>

</body>
</html>

