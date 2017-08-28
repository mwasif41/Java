

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditRecord2
 */
@WebServlet("/EditRecord2")
public class EditRecord2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("id"));
		int r = Integer.parseInt(request.getParameter("rollno"));
		int status = StudentMan.updateStudent(id, request.getParameter("name"), r, request.getParameter("email"), request.getParameter("dept"));
		PrintWriter out = response.getWriter();
		if(status != 0){
			response.sendRedirect("/StudentCRUD/ShowRecord");
		}
		else{
			out.println("Sorry an error occured please try again !");
			RequestDispatcher rd = request.getRequestDispatcher("/StudentCRUD/EditRecord");
			rd.include(request, response);
		}
	}

}
