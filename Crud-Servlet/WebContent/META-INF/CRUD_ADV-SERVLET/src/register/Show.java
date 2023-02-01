package register;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Selectdata;
import data.User;


@WebServlet("/show")
public class Show extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		
		out.print("<head>");
		
	   out.print("<link rel='stylesheet' href='style.css' />");
	   out.print("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css' integrity='sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh' crossorigin='anonymous'>");
	   out.print("</head>");
	   out.print("<body>");
	 
	List<User> list=Selectdata.getallUserdata();
	      out.print("<table id='customers'>");
	      
	      		out.print("<thead>"
	      		+ "<tr>"
	      		+ "<th>ID</th>"
	      		+ "<th>FULL NAME</th>"
	      		+ "<th>EMAIL</th>"
	      		+ "<th>PHONE NO</th>"
	      		+ "<th>DOB</th>"
	      		+ "<th>ADDRESS</th>"
	      		+ "<th>ACTION</th>"
	      		+ " </tr>"
	      		+ " <thead>"); 
	        for(User s:list){
	   
	        out.print("<tbody>");
	        out.print("<tr>"
	        		+ "<td>"+s.getId()+"</td>"
	        		+ "<td>"+s.getFname()+"</td>"
	        		+ "<td>"+s.getEmail()+"</td>"
	        		+ "<td>"+s.getNum()+"</td>"
	        		+ "<td>"+s.getDate()+"</td>"
	        		+ "<td>"+s.getAdd()+"</td>"
	        		+ "<td><a type='button' href='update?id="+s.getId()+"'class='btn btn-success'>Edit</a>"+"  "
	        			+"<a hreftype='button' href='delete?id="+s.getId()+"'class='btn btn-danger'>Delete</a></td>"
	        		+ "</tbody>");
	        }
	        out.print("<table/>");
	     


	  
	   
	   
	   out.print("</body>");
	   out.print("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
