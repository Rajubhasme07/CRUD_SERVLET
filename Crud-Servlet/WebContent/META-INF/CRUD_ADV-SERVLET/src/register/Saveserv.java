package register;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Saveas;
import data.User;


@WebServlet("/serv1")
public class Saveserv extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	out.print("<html>");
out.print("<titel>Registration</titel>");
	out.print("<head>");
	out.print("<link rel='stylesheet' href='style.css' />");
	out.print("</head>");

	String fname=request.getParameter("fname");
	String email=request.getParameter("email");
	String num=request.getParameter("num");
	String date=request.getParameter("date");
	String add=request.getParameter("add");
	
	User s=new User();
	s.setFname(fname);
	s.setEmail(email);
	s.setNum(num);
	s.setDate(date);
	s.setAdd(add);
	
	int status=Saveas.save(s);
	if(status>0){
		out.print("<body>");
		out.print("<div class='vcv-container'>");
		out.print("<div class='vce-message-box vce vce-message-box-style--success'>");
	   out.print("<div class='vce-message-box-inner'>"); 
	   out.print("<span class='vce-message-box-icon material-icons'>check</span>");  
	   out.print("<span class='vce-message-box-text'>");   
	   out.print("<p>Record saved Successfully</p>");    
	   out.print("</span>"
	   		+ "</div>"
	   		+ "</div>"
	   		+ "</div>");
	   request.getRequestDispatcher("index.html").include(request, response);
	   out.print("</body>");
	   out.print("</html>");
		
	}
	else{
		out.print("Sorry! unable to save Record");
	}
	
	out.close();
	
	
	
	
	
	
	
	
	
	
	
	
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
