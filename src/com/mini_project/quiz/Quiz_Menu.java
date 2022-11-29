package com.mini_project.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Quiz_Menu {
	public void main() throws SQLException {
		int score=0;
		char grade =0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mcq","root","root");
			String query = "SELECT Question,Option_1, Option_2, Option_3, Option_4 FROM mcq.que";
	        //order by rand() limit 1";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next())
		      {
		        String Ques = rs.getString("Question");
		        String o1 = rs.getString("Option_1");
		        String o2 = rs.getString("Option_2");
		        String o3 = rs.getString("Option_3");
		        String o4 = rs.getString("Option_4");
		      // for(int i=1;i<=10;i++)
		       // {
		        System.out.format("%s \n A) %s \n B) %s \n C) %s \n D) %s\n", Ques, o1, o2, o3, o4);
		        System.out.println("Enter your option ");
		        String Ans;
		        Scanner sc=new Scanner(System.in);
		        Ans=sc.next();
		        if(Ans=="A" && rs.getString("Option_1")==rs.getString("Correct_Answer"))
		        {
		        	score=score+1;
		        	System.out.println("Your Score is "+score);
		        }
		        if(Ans=="B" && rs.getString("Option_2")==rs.getString("Correct_Answer"))
		        {
		        	score=score+1;
		        	System.out.println("Your Score is "+score);
		        }
		        if(Ans=="C" && rs.getString("Option_3")==rs.getString("Correct_Answer"))
		        {
		        	score=score+3;
		        	System.out.println("Your Score is "+score);
		        }
		        else
		        {
		        	score=score+1;
		        	System.out.println("Your Score is "+score);
		        }
		      }

			if(score>7 && score<11)
			{
				grade='A';
			}
			else if(score>5 && score<8)
			{
				grade='B';
			}
			else if(score==5)
			{
				grade='C';
			}
			else if(score>=0 && score<5)
			{
				grade='D';
			}

			System.out.println("Your Score is "+score+"\nYour grade is "+grade);
		      st.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
