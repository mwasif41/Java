package com.nisum.controller;

import java.io.IOException;
//import java.io.PrintWriter;
import java.util.List;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nisum.model.Student;
import com.nisum.services.DBServices;

/**<h1>StudentController</h1>
 * It is the implementation of the CRUD operation on student record that is fetched from the 
 * mySQL database.it Serves as the main controller to the requests and generate the response
 * @author mwasif
 *
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * The doPost method is used to make the request of the form that are being made as POST method
	 * it checks the parameter value and then decide which value is to be used.
	 *<p>
	 *in this case it perform
	 *<li>Adding the record</li>
	 **<li>Editing the record</li>  
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// checking the action to be performed by checking submit button name
		if (request.getParameter("addSubmit") != null) {
			int status = DBServices.addStudent(request.getParameter("name"),
					Integer.parseInt(request.getParameter("rollno")), request.getParameter("dept"),
					request.getParameter("email"));
			// RequestDispatcher view =
			// request.getRequestDispatcher("/StudentList.jsp");
			if (status > 0) {
				String notification = "Record added success fully !";
				request.setAttribute("message", notification);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} else {
				String errorMessage = "Something went wrong pleade try again";
				request.setAttribute("message", errorMessage);
				request.getRequestDispatcher("index.jsp").forward(request, response);
				
			}
		}
		else if(request.getParameter("editSubmit")!=null){
			int status = DBServices.updateStudent(Integer.parseInt(request.getParameter("id")), request.getParameter("name"), Integer.parseInt(request.getParameter("rollno")), request.getParameter("dept"), request.getParameter("email"));
			
			if(status>0)
				request.setAttribute("message", "Successfully updated the record !");
			else
				request.setAttribute("message", "Something went wrong please try again");
			
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}
	/**
	 * The doGet method is used to perform the tasks in which data is sent from URl
	 * It perform the following tasks
	 * <li>Displaying the records</li>
	 * <li>deleting the record</li>
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		if(request.getParameter("listStudent") != null){
			List<Student> studentList = DBServices.getAllStudents();
			request.setAttribute("students", studentList);
			request.getRequestDispatcher("StudentList.jsp").forward(request, response);
		
		}
		else if(request.getParameter("deleteStudent") != null){
			int status = DBServices.deleteStudent(Integer.parseInt(request.getParameter("studentID")));
			if(status > 0){
				request.setAttribute("message", "Record has successfully deleted !");
				request.getRequestDispatcher("index.jsp").forward(request,response);
			}
			else{
				request.setAttribute("message", "Something wrong with Delete Record !");
				request.getRequestDispatcher("index.jsp").forward(request,response);				
			}
		}
		else if(request.getParameter("editStudent")!=null){
			Student student = DBServices.getStudentById(Integer.parseInt(request.getParameter("studentID")));
			request.setAttribute("student", student);
			request.getRequestDispatcher("editForm.jsp").forward(request, response);
		}

	}
}
