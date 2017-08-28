

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddRecord
 */
@WebServlet("/AddRecord")
public class AddRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		//int id = Integer.parseInt(request.getpaarameter("id"));
		int status = StudentMan.addStudent(request.getParameter("name"), Integer.parseInt(request.getParameter("rollno")), request.getParameter("email"), request.getParameter("dept"));
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("/index.html");

		rd.include(request,response);
		if(status!=0){
			out.println("Record successfully Added");
		}
		else{
			out.println("Something went wrong please try again !");
		}
		out.close();
	}


}
