package com.example.ResumeGenius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import com.example.ResumeGenius.service.UserService;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootApplication
public class ResumeGeniusApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(ResumeGeniusApplication.class, args);
	}


//	public static void main(String args[]){
//		try{
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con= DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/resumegenius","root","root");
////here  is database name, root is username and password
//			Statement stmt=con.createStatement();
//			ResultSet rs=stmt.executeQuery("select * from user");
//			while(rs.next())
//				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//			con.close();
//		}catch(Exception e){ System.out.println(e);}
//	}

}
