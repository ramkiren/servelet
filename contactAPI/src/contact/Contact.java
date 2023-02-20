package contact;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

@WebServlet("/contact")
public class Contact extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	        response.setContentType("application/json");
	        PrintWriter out = response.getWriter();
	        JSONObject json = new JSONObject();
	        JSONArray array = new JSONArray();
	        String DB_URL = "jdbc:mysql://127.0.0.1:3306/table";
	  	  String DB_USER = "root";
	  	  String DB_PASS = "kiren";
	  	String QUERY = "SELECT * from contacts";

	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

	            
	            PreparedStatement statement = conn.prepareStatement(QUERY);
	            ResultSet result = statement.executeQuery();

	            while (result.next()) {
	                JSONObject item = new JSONObject();
	                item.put("id", result.getInt("id"));
	                item.put("name", result.getString("name"));
	                item.put("email", result.getString("email"));
	                item.put("phone", result.getString("phone"));
	                array.put(item);
	            }
	            json.put("status", "ok");
	            json.put("contacts", array);
	            out.print(json.toString());

	            statement.close();
	            conn.close();
	        } catch (Exception e) {
//	           json.put("status", "error");
//	            json.put("message", e.getMessage());
//	            out.print(json.toString());
	            System.out.print(e);
	        }

}
}



