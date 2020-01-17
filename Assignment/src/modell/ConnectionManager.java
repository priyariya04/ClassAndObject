package modell;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class ConnectionManager {
	private static Properties loadPropertiesFile() throws Exception {
		
		Properties prop = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close();
		return prop;
	}
protected static Connection getConnection() {
		
		Connection connection = null;
		Properties prop = null;
		try {
			prop = loadPropertiesFile();
		} catch (Exception e) {
			System.out.println("Error in property file"+e);
		}
		final String driver = prop.getProperty("driver");//final - no one can over ride the values
		final String url = prop.getProperty("url");
		final String username = prop.getProperty("username");
		final String password = prop.getProperty("password");
		

		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
		e.printStackTrace();
		
	}
		if(connection!=null)
		{
			System.out.println("Connection Established");
		}
		else
		{
			System.out.println("Connection not established");
		}
		return connection;

}
}