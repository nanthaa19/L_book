package com.abstractFactory.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBaseEntity
{
	
	private static Connection connection = null;
	
	public static Connection getConnection()
	{
		if (connection != null)
		{
			return connection;
		}
		else
		{
			try
			{
//				Properties prop = new Properties();
//				
//				InputStream inputStream = DataBaseEntity.class.getClassLoader().getResourceAsStream("/db_mysql.properties");
//				prop.load(inputStream);
//				
				String driver = "com.mysql.jdbc.Driver";//prop.getProperty("driver");
				String url = "jdbc:mysql://localhost:3306/l";//prop.getProperty("url");
				String user = "root";//prop.getProperty("user");
				String password = "root123";//prop.getProperty("password");
				
				Class.forName(driver);
				connection = DriverManager.getConnection(url, user, password);
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
//			catch (FileNotFoundException e)
//			{
//				e.printStackTrace();
//			}
//			catch (IOException e)
//			{
//				e.printStackTrace();
//			}
			return connection;
		}
		
	}
	
}
