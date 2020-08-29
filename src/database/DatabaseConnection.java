/**
 * Program Name: DatabaseConnection.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 20, 2020
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Libo
 *
 */
public class DatabaseConnection
{
	private static Connection getConnection()
	{
		Connection connection = null;
		try
		{
			connection = DriverManager.getConnection();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}
	
}

public class Driver
{

	public static void main(String[] args) throws SQLException
	{
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRslt = null;
		
	
		try
		{

			myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:1234/demo?useSSL=false","root","password"
					);
			
			myStmt = myConn.createStatement();
			
			myRslt = myStmt.executeQuery("SELECT * FROM customers");
			
			while(myRslt.next())
			{

				System.out.println(myRslt.getString(2) +
						               ", " + myRslt.getString(3) +
						               ", " + myRslt.getString(4) 
						               );
			}		
					
		}
		catch(Exception ex)
		{
			System.out.println("Exception: " + ex.getMessage());
		}
		
		finally
		{

			if(myRslt != null)
				myRslt.close();
			if(myStmt != null)
				myStmt.close();
			if(myConn != null)
				myConn.close();			
		}
		
		System.out.println("**\nClose Database Connection");		

	}

}

