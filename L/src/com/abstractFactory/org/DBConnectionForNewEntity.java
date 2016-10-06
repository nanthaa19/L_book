package com.abstractFactory.org;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import com.pojo.BookEntry;
import com.pojo.Employees;
import com.pojo.NewBook;

public class DBConnectionForNewEntity implements KLBooksAdmin
{
	Connection connection = DataBaseEntity.getConnection();
	
	private static DBConnectionForNewEntity jdbc2;
	
	private DBConnectionForNewEntity()
	{
		
	}
	
	private DBConnectionForNewEntity getInstance()
	{
		if (jdbc2 == null)
		{
			jdbc2 = new DBConnectionForNewEntity();
		}
		return jdbc2;
	}
	
	public void closeConnection()
	{
		if (connection != null)
		{
			try
			{
				connection.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public int insertNewEmployee(Employees insertNewEmployee)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int updateNewEmployeee(Employees updateAllField)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int deleteEmployee(Employees deleteEmployee)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean checkEmployeeByEmailId(String emailId)
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean checkEmployeeByMobilePhone(String mobileNo)
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Employees viewEmployees()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Employees searchEmployee(String employeeName)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Employees aliveEmployees()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Employees deadEmployees()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Employees getEmployee(String userId, String password)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int insertNewBookToCategory(NewBook addNew)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int updateNewBook(int id)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int deleteNewBook(int id)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public NewBook viewNewBook()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public NewBook searchNewBook(String bookName)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int insertDailyBookName(BookEntry addEntry)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int updateDailyBookName(int id)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int deleteDailyBookName(int id)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public BookEntry viewBookEntry()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public BookEntry viewByDate(Date enterDate)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
}
