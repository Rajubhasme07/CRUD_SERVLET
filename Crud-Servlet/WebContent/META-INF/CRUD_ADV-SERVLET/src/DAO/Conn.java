package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
	private static String jdbcurl="jdbc:mysql://localhost:3306/registration";
	private static String suname="root";
	private static String spass="abc123";
	private static String driver="com.mysql.cj.jdbc.Driver";
	
	
	public static Connection getConnection(){
		Connection con=null;
		try {
			Class.forName(driver);
		try {
				con=DriverManager.getConnection(jdbcurl,suname,spass);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
		return con;	
	}
	
	
   
}
