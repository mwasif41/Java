

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteRecord
 */
@WebServlet("/DeleteRecord")
public class DeleteRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		int status = StudentMan.deleteStudent(id);
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("/ShowRecord");
		if(status !=0 ){
			out.println("Record successfully deleted");
		}
		else{
			out.println("Something went wrong please try again !");
		}
		rd.include(request,response);
		out.close();
	}

}
