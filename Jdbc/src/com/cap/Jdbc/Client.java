package com.cap.Jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub

Connection connection =DBUtil.getconnection();
		
		//checking the connection establishment
		if(connection !=null) {
			System.out.println("JDBC: Connection is established");
		}
		
		addEmployee();
		//DeleteEmployee();
		GetEmployee();
	}
		//Create Operation
		private static void addEmployee() throws SQLException 
		{
			Connection connection =DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqlinsert = "insert into rashmi1.employee(id,name,salary,bonus)" + "values(3,'Rashmi',4000.00,210.00)";
			int executeupdate = stmt.executeUpdate(sqlinsert);
			if(executeupdate==1) {
				System.out.println("Entry is added");
			}
		}
		//Update Operation
		private static void UpdateEmployee() throws SQLException 
		{
			Connection connection =DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqlupdate = "update employee set bonus =100.00 where id=4";
			int executeupdate = stmt.executeUpdate(sqlupdate);
			if(executeupdate==1) {
				System.out.println("Update is successfull");
			}
		}
		//Delete Operation
		private static void DeleteEmployee() throws SQLException 
		{
			Connection connection =DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqldelete = "delete from rashmi1.employee where id =1";
			int executeupdate = stmt.executeUpdate(sqldelete);
			if(executeupdate==1) {
				System.out.println("Delete is successfull");
			}
		}
		
		//Retrieve Operation
		private static void GetEmployee() throws SQLException {
			Connection connection =DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqlretrieve="Select * from rashmi1.employee";
			ResultSet rs = stmt.executeQuery(sqlretrieve);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name= rs.getString("name");
				Double salary = rs.getDouble("salary");
				Double bonus = rs.getDouble("bonus");
				System.out.println(id+" "+ name + " " + salary + " " + bonus);
			}
			
		}
		//RetrieveById Operation
		private static void RetrieveByIdEmployee() throws SQLException {
		Connection connection = DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqlretrieve = "select * from employee where id =3";
		ResultSet rs = stmt.executeQuery(sqlretrieve);
		if(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			Double salary = rs.getDouble("Salary");
			Double bonus = rs.getDouble("bonus");
			System.out.println(id + " " + name + " "+ salary +" "+ bonus);
		}
		else {
			System.out.println("Employee is not available with the mentioned ID...");
		}
		}
	}

