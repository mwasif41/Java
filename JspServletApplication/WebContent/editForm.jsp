<%@page import="com.nisum.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Form</title>
</head>
<body>
	<% Student student = (Student)request.getAttribute("student"); %>
	<h3>Enter the detail of student to be updated</h3>
	<form action="StudentController" method="POST">
		<table>
			<input type="hidden" name="id" value="<%=student.getId() %>">
            <tr>
                <td>Student Name:</td>
                <td><input type="text" name="name" value="<%=student.getName()%>"></td>
            </tr>
            <tr>
                <td>Roll no:</td>
                <td><input type="number" name="rollno" value="<%=student.getRollNo()%>"></td>
            </tr>
            <tr>
                <td>Department:</td>
                <td><input type="text" name="dept" value="<%=student.getDept() %>"></td>
            </tr>
            <tr>
                <td>Student Email:</td>
                <td><input type="email" name="email" value="<%=student.getEmail() %>"></td>
            </tr>
            <tr>
                <td colspan="2"> <input type="submit" name="editSubmit" value="update the record">  </td>
            </tr>
        </table>      

	</form>
</body>
</html>