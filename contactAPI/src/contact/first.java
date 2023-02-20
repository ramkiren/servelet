//$Id$
package contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


	public class first{
 	   static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/table";
 	   static final String USER = "root";
 	   static final String PASS = "kiren";
 	   static final String QUERY = "SELECT * from contacts";

 	   public void main(String[] args) {
 	      // Open a connection
 	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
 	         Statement stmt = conn.createStatement();
 	         ResultSet rs = stmt.executeQuery(QUERY);) {
 	         // Extract data from result set
 	         while (rs.next()) {
 	            // Retrieve by column name
 	            System.out.print("ID: " + rs.getInt("id"));
 	            System.out.print(", Age: " + rs.getInt("name"));
 	            System.out.print(", First: " + rs.getString("email"));
 	            System.out.println(", Last: " + rs.getString("phone"));
 	         }
 	      } catch (SQLException e) {
 	         e.printStackTrace();
 	      } 
 	   }

}