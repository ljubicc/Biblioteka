package biblioteka;

import java.sql.*;

public class Konekcija {
	
	public static Connection konekcija() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/bazabiblioteka", "root", "");
	}
}
