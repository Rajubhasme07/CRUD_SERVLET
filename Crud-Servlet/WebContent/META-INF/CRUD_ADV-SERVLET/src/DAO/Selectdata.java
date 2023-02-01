package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import data.User;


public class Selectdata {
public static User getUserdatabyid(int id){
	User s=new User();
	
	Connection con=Conn.getConnection();
	try {
	
		PreparedStatement ps=con.prepareStatement("select * from user where id=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			s.setId(rs.getInt(1));
			s.setFname(rs.getString(2));
			s.setEmail(rs.getString(3));
			s.setNum(rs.getString(4));
			s.setDate(rs.getString(5));
			s.setAdd(rs.getString(6));  
		}
		con.close();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return s;
}
public static List<User> getallUserdata(){
	List<User> list=new ArrayList<User>();
	
	Connection con=Conn.getConnection();
	try {
		PreparedStatement ps=con.prepareStatement("select * from user");
	ResultSet rs=ps.executeQuery();
	while(rs.next()){
		
	User s=new User();
	s.setId(rs.getInt(1));
	s.setFname(rs.getString(2));
	s.setEmail(rs.getString(3));
	s.setNum(rs.getString(4));
	s.setDate(rs.getString(5));
	s.setAdd(rs.getString(6));
	list.add(s);
	}
	con.close();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return list;
	
}

}
