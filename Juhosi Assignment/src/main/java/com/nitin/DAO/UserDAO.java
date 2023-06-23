package com.nitin.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.nitin.model.Model;

public class UserDAO {
	private String URL = "jdbc:mysql://localhost:3306/Juhosi?useSSL=false";
	private String Username = "root";
	private String Password = "root";

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL, Username, Password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public boolean login(String username, String pass) {
		Connection conn = getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from user where user='"+username+"';");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				if(rs.getString("user").equals(username) && rs.getString("password").equals(pass)) {return true;}
				else {return false;} 
			}	
		} catch (Exception e) {
			e.getMessage();
		}
		return true;
	}
	
	public boolean insert1(Model model) {
		Connection conn = getConnection();
		String query = "insert into customer1 values("
				+ "'"+model.getDate()+"', "
				+ "'"+model.getCompany()+"', "
				+ "'"+model.getOwner()+"',"
				+ "'"+model.getItem()+"', "
				+ ""+model.getQuantity()+", "
				+ ""+model.getWeight()+", "
				+ "'"+model.getRequest_for_shipment()+"', "
				+ "'"+model.getTracking_id()+"', "
				+ ""+model.getBox_count()+", "
				+ "'"+model.getSpecialization()+"', "
				+ "'"+model.getChecklist_quantity()+"');";
		System.out.println(query);
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			if(ps.executeUpdate() > 0) {
				return true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return false;
	}
	
	public boolean insert2(Model model) {
		Connection conn = getConnection();
		String query = "insert into customer2 values("
				+ "'"+model.getDate()+"', "
				+ "'"+model.getCompany()+"', "
				+ "'"+model.getOwner()+"',"
				+ "'"+model.getItem()+"', "
				+ ""+model.getQuantity()+", "
				+ ""+model.getWeight()+", "
				+ "'"+model.getRequest_for_shipment()+"', "
				+ "'"+model.getTracking_id()+"', "
				+ ""+model.getBox_count()+", "
				+ "'"+model.getSpecialization()+"', "
				+ "'"+model.getChecklist_quantity()+"');";
		System.out.println(query);
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			if(ps.executeUpdate() > 0) {
				return true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return false;
	}
	
	public HashMap<String, String> admin() {
		System.out.println("Admin DAO");
		Connection conn = getConnection();
		String query1 = "SELECT SUM(quantity) AS qt, SUM(weight) AS w, SUM(box_count) AS bc FROM customer1;";
		String query2 = "SELECT SUM(quantity) AS qt, SUM(weight) AS w, SUM(box_count) AS bc FROM customer2;";
		HashMap<String, String> map = new HashMap<>();
		Integer totalQuantity = 0;
		Float totalWeight = 0f;
		Integer totalBC = 0; 
		try {
			PreparedStatement ps1 = conn.prepareStatement(query1);
			PreparedStatement ps2 = conn.prepareStatement(query2);
			ResultSet rs1 = ps1.executeQuery();
			ResultSet rs2 = ps2.executeQuery();
			while(rs1.next()) {
				totalQuantity += Integer.parseInt(rs1.getString("qt"));
				totalWeight += Float.parseFloat(rs1.getString("w"));
				totalBC += Integer.parseInt(rs1.getString("bc"));
				map.put("C1_Quantity", rs1.getString("qt"));
				map.put("C1_Weight", rs1.getString("w"));
				map.put("C1_BC", rs1.getString("bc"));
			}
			while(rs2.next()) {
				totalQuantity += Integer.parseInt(rs2.getString("qt"));
				totalWeight += Float.parseFloat(rs2.getString("w"));
				totalBC += Integer.parseInt(rs2.getString("bc"));
				map.put("C2_Quantity", rs2.getString("qt"));
				map.put("C2_Weight", rs2.getString("w"));
				map.put("C2_BC", rs2.getString("bc"));
			}
			map.put("totalQuantity", String.valueOf(totalQuantity));
			map.put("totalWeight", String.valueOf(totalWeight));
			map.put("totalBC", String.valueOf(totalBC));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
	
}
