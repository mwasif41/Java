

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditRecord
 */
@WebServlet("/EditRecord")
public class EditRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Student s = StudentMan.getStudentById(Integer.parseInt(request.getParameter("id")));
		out.print("<h2>Updating Student "+ s.getName() +"</h2>");
		out.print("<form action=\"/StudentCRUD/EditRecord2\" method=\"POST\"><table><tr><td>Student Name:</td><td><input type=\"text\" name=\"name\" value=\""+s.getName()+"\"></td></tr>");
		out.print("<tr><td>Roll no:</td><td><input type=\"number\" name=\"rollno\" value=\""+s.getRollNo()+"\"></td></tr>");
		out.print("<tr><td>Department:</td><td><input type=\"text\" name=\"dept\" value=\""+ s.getDept() +"\"></td></tr>");
		out.print("<tr><td>Student Email:</td><td><input type=\"email\" name=\"email\" value=\""+s.getEmail()+"\"><input type=\"hidden\" name=\"id\" value=\""+s.getId()+"\"></td></tr>");
		out.print("<tr><td colspan=\"2\"><input type=\"submit\" value=\"update the record\"></td></tr></table></form>");
	}

}
