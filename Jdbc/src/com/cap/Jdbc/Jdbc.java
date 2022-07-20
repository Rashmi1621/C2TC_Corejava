package com.cap.Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Jdbc {
	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");// step 2  class loader 
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rashmi","root", "Rashmi@2116");//step 3 create connection
			
			Statement st = con.createStatement();// step 4
			String query1 = "insert into emp1 values(4,'vvg')";
			String query = "select * from emp1";
			ResultSet rs = st.executeQuery("SELECT * from emp1");
			while(rs.next())
			  {
			    System.out.println(rs.getString(1));  //First Column
			    System.out.println(rs.getString(2));  //Second Column
			    //System.out.println(rs.getString(3));  //Third Column
			  }
			st.executeUpdate(query1);
			System.out.println("Student Table created successfully");
			
		System.out.println("Row inserted successfully");
			
st.close();						  	
con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
