package register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Selectdata;
import DAO.Update;
import data.User;

/**
 * Servlet implementation class Detailsupdate
 */
@WebServlet("/detailsupdate")
public class Detailsupdate extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		String fname=request.getParameter("fname");
		String email=request.getParameter("email");
		String num=request.getParameter("num");
		String date=request.getParameter("date");
		String add=request.getParameter("add");
		User s=new User();
		s.setId(id);
		s.setFname(fname);
		s.setEmail(email);
		s.setNum(num);
		s.setDate(date);
		s.setAdd(add);
		int status=Update.edit(s);
		if(status>0){
		response.sendRedirect("show");	
		}
		else{
			out.println("Sorry! unable to update record");
		}
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
