package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import data.User;

public class Update {
	
	
	public static int edit(User s){
	int status=0;
	Connection con=Conn.getConnection();
	try {
		
		PreparedStatement ps=con.prepareStatement("update user set fname=?,email=?,num=?,dates=?,adds=? where id=?");
		ps.setString(1,s.getFname());
		ps.setString(2, s.getEmail());
		ps.setString(3,s.getNum());
		ps.setString(4, s.getDate());
		ps.setString(5, s.getAdd());
		ps.setInt(6, s.getId());
		
		status=ps.executeUpdate();
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return status;
	}

}
