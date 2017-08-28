
import java.util.*;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import java;
/**
 * Servlet implementation class ShowRecord
 */
@WebServlet("/ShowRecord")
public class ShowRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
    	response.setContentType("text/html");
    	ArrayList<Student> Slist = StudentMan.getAllStudents();
    	PrintWriter out = response.getWriter();
    	if(Slist == null){
    		out.println("There is no record to display please enter the record!!");
    		RequestDispatcher rd = request.getRequestDispatcher("/index.html");
    		rd.include(request, response);
    	}
    	else{
    	out.println("<!DOCTYPE html><html lang=\"en\"><head><title>List viewer</title></head><body><table border=\"1\"><tr><th>Student ID</th><th>Student Name</th><th>Student Roll no</th><th>Student Email</th><th>Student Department</th><th> Edit </th><th> Delete </th></tr>");
    	for(Student s:Slist){
    		out.println(" <tr><td>Student ID</td><td>" + s.getName() + "</td><td> "+ s.getRollNo() + "</td><td>" + s.getEmail() + "</td><td>" + s.getDept() + "</td><td> <a href=\"/StudentCRUD/EditRecord?id="+s.getId()+"\">Edit</a> </td><td><a href=\"/StudentCRUD/DeleteRecord?id="+ s.getId() +"\">Delete</a></td></tr>");
    	}
    	out.println("</table><hr/>");

    	out.println("<a href=\"/StudentCRUD/index.html\"> Enter Student  </a><hr/></html>");
    	}
    }

}
