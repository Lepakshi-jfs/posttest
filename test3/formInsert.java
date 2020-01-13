package com.posttes.reg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//import com.posttest.servlet.SQLException;
//import com.posttest.servlet.String;

/**
 * Servlet implementation class formInsert
 */
@WebServlet("/formInsert")
public class formInsert extends HttpServlet {
	Connection connection = null;
	@Override
	public void init() throws ServletException {
		try {
			System.out.println("INIT INVOKED");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded successfully!");
			//Get the connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
			//System.out.println("Connection Established!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}		
	}
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String FirstName=request.getParameter("Firstname");
	String LastName=request.getParameter("Lastname");
	String City=request.getParameter("City");
	String Gender=request.getParameter("Gender");


	insertDetails(FirstName,LastName,City,Gender);
	
}

public void insertDetails(String FirstName, String LastName,String City,String Gender) {
	// Get ojdbc14.jar
	// Load the driver
	try {
		//Create the statement
		Statement statement = connection.createStatement();
		//Execute the query
		int noOfRowsInserted = statement.executeUpdate("insert into account values('" + FirstName + "', '" + LastName + "','"+ City +"' ,'"+ Gender +"' )" );
		if(noOfRowsInserted ==1) {
			System.out.println("NO OF ROWS INSERTED : " + noOfRowsInserted);
//			RequestDispatcher.requestDispatcher=request.getRequestDispatcher("success.html");
//			requestDispatcher.forward(request,response);
		}
		else {
			System.out.println("No rows inserted!");
		}
	} catch (SQLException e) {
		System.out.println(e);
	}
}
}