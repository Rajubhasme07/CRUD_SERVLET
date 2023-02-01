package register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Selectdata;
import data.User;


@WebServlet("/update")
public class Update extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		User s= Selectdata.getUserdatabyid(id);
		out.print("<!DOCTYPE html>");

		out.print("<html lang='en'>");
		out.print("<head>"); 
		out.print("<meta charset='UTF-8' />");  
		out.print("<meta name='viewport' content='width=device-width, initial-scale=1.0' />"); 
		out.print("<meta http-equiv='X-UA-Compatible' content='ie=edge' />");
		out.print("<title>Update</title>"); 
		
		    /*<!---Custom CSS File--->*/
		out.print("<link rel='stylesheet' href='style.css' />");
		out.print("</head>"); 
		out.print("<body>"); 
		
		out.print("<section class='container'>");  
		out.print("<header>Updatetion Form</header>");
		
		out.print(" <form action='detailsupdate' method='post' class='form'>"); 
		
		out.print("<div class='input-box'>");
		out.print(" <input type='hidden' name='id' value='"+s.getId()+"'/>"); 
		out.print("<label>Full Name</label>");     
		out.print(" <input type='text' name='fname' value='"+s.getFname()+"'/>");   
		out.print("</div>");      
		out.print("<div class='input-box'>"
				+ "<label>Email Address</label>"
				+ "<input type='text' name='email' value='"+s.getEmail()+"'/>"
				+ "</div>"
				+ " <div class='column'>"
				+ "<div class='input-box'>"
						+ "<label>Phone Number</label>"
						+ "<input type='number' name='num' value='"+s.getNum()+"'/>"
						+ "</div>"
						+ "<div class='input-box'>"
						+ " <label>Birth Date</label>"
						+ " <input type='date' name='date' value='"+s.getDate()+"' />"
						+ "</div>"
						+ "</div>"
						+ "<div class='input-box address'>"
						+ "<label>Address</label>"
						+ " <input type='text' name='add' value='"+s.getAdd()+"' />"
						+ "</div>"
						+ "<button>Update</button>");
		        
		          out.print(" </form>"
		          		+ "</section>");
		          out.print(" </body>");
		          out.print("</html>");
		          
		        

		       
		          
		            
		            
		          
		          
		           
		           
		          
		        
		    
		        
		          
		         
		       
		       
		     
		    
		 
		

		
		
		
		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
