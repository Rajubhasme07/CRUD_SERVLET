package DAO;
import data.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import data.User;
import register.Saveserv;

public class Saveas {
	

			
	public static int save(User s){
		int status=0;
		
		
		try {
			Connection con=Conn.getConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO user(fname,email,num,dates,adds)"
			+" VALUES (?,?,?,?,?)");
			ps.setString(1,s.getFname());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getNum());
			ps.setString(4, s.getDate());
			ps.setString(5, s.getAdd());
			status=ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return status;
		
	}
}
