package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static int del(int id){
		int status=0;
		Connection con=Conn.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("delete from user where id=?");
			ps.setInt(1, id);
			status=ps.executeUpdate();
			con.close();
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
}
