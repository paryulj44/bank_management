package bank_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connection {
	Connection c;
	Statement s,pat;
	public connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql:///banksystem","root","182000");
			s=c.createStatement();
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	//public Object prepareStatement(String sql) throws SQLException {}
	
}

