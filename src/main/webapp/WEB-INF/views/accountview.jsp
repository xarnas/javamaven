<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Account View</title>
</head>
<body>
	<h2>Hello world Welcome to Account View!</h2>
<!--  
<table>
 
    <c:forEach items="${model}" var="model">
        <tr>
        	<td>${model.id}</td>
            <td>${model.itemName}</td>
            <td>${model.money}</td>
        </tr>
    </c:forEach>
</table>
-->
  <p th:text="'id: ' + ${model[0].id}" />
    <p th:text="'money: ' + ${model[0].money}" />
</body>
</html>