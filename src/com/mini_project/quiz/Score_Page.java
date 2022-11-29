package com.mini_project.quiz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Score_Page {

	public static void main() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq","root","root");
			String query = "SELECT * FROM mcq.user";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			System.out.println("▒█▀▀▀█ █▀▀ █▀▀█ █▀▀█ █▀▀ 　 ▒█▀▄▀█ █▀▀ █▀▀▄ █░░█"); 
			System.out.println("░▀▀▀▄▄ █░░ █░░█ █▄▄▀ █▀▀ 　 ▒█▒█▒█ █▀▀ █░░█ █░░█");
			System.out.println("▒█▄▄▄█ ▀▀▀ ▀▀▀▀ ▀░▀▀ ▀▀▀ 　 ▒█░░▒█ ▀▀▀ ▀░░▀ ░▀▀▀\n\n");
			while (rs.next())
		      {
		        String firstName = rs.getString("first_Name");
		        String lastName = rs.getString("last_Name");
		        String contact = rs.getString("Contact");
		        String ScoredMarks = rs.getString("Scored_Marks");
		        String Grade = rs.getString("Grade");
		        System.out.format("Name : %s %s || Contact :%s || Total Marks: %s || Grade :%s\n", firstName, lastName, contact, ScoredMarks, Grade);
		      }
		      st.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
