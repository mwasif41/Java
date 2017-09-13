<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.nisum.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student details</title>
</head>
<body>
	<p>${message}</p>
	<table border=1>
        <thead>
            <tr>
                <th> Name </th>
                <th> Roll No </th>
                <th> Department </th>
                <th>Email</th>
                <th> Edit </th>
                <th> Delete </th>
            </tr>
        </thead>
        <tbody>
        <% 
        	List<Student> studentList = (ArrayList<Student>) request.getAttribute("students");
   			for(Student student : studentList){
        %>
        			<tr>
   			    	<td> <%=student.getName() %> </td>
   			    	<td> <%=student.getRollNo()%> </td>
   			    	<td> <%=student.getDept()%> </td>
   			    	<td> <%=student.getEmail()%> </td>
   			    	<td> <a href="StudentController?editStudent=true&studentID=<%=student.getId()%>" > Edit </a> </td>
   			    	<td> <a href="StudentController?deleteStudent=true&studentID=<%=student.getId()%>" > Delete </a> </td>
   			    	</tr>	 
	<% } %>
        </tbody>
    </table>
</body>
</html>