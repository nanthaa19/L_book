package com.abstractFactory.org;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.pojo.BookEntry;
import com.pojo.NewBook;

public class DBConnections implements KLBooksAdmin
{
	Connection connection = DataBaseEntity.getConnection();
	
	private static DBConnections jdbc;
	
	private DBConnections()
	{
		
	}
	
	public static DBConnections getInstance()
	{
		if (jdbc == null)
		{
			jdbc = new DBConnections();
		}
		return jdbc;
	}
	
	public void closeConnection()
	{
		try
		{
			if (connection != null) connection.close();
		}
		catch (Exception exe)
		{
			System.out.println(exe.toString());
		}
	}
	
	@Override
	public int insertNewBookToCategory(NewBook addNew)
	{
		PreparedStatement pstmt = null;
		int inserCount = 0;
		String sql = "Insert into category (name,day,keyword,series,district,dateOfFirstRelese,type,creater_id,enrty_date) values (?,?,?,?,?,?,?,?)";
		
		/* name, day, keyword, series, district, dateOfFirstRelese, type, creater_id, enrty_date */
		try
		{
			if (connection != null)
			{
				
				pstmt = connection.prepareStatement(sql);
				
				pstmt.setString(1, addNew.getName());
				pstmt.setByte(2, addNew.getWeekDay());
				pstmt.setString(3, addNew.getKeyWord());
				pstmt.setByte(4, addNew.getNoOfSeries());
				pstmt.setString(5, addNew.getDistrict());
				pstmt.setDate(6, new java.sql.Date(addNew.getDateOfFirstLaunch().getTime()));
				pstmt.setString(7, addNew.getType());
				pstmt.setInt(8, addNew.getCreaterId());
				pstmt.setDate(9, new java.sql.Date(addNew.getEntryDate().getTime()));
				
				int count = pstmt.executeUpdate();
				
				if (count > 0)
				{
					inserCount = count;
				}
				
			}
			else
			{
				System.out.println("Connection is null in update employee list");
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return inserCount;
	}
	
	@Override
	public int updateNewBook(int id)
	{
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
	
	/*
	 * public int insertDate(Date d1, Date d2, Date d3) { PreparedStatement pstmt = null; String sql =
	 * "insert into datetable (system_date , date_time , time_stamp) values (?,CURDATE(),CURDATE())"; int rows = 0; try
	 * { pstmt = connection.prepareStatement(sql); java.sql.Date d = (java.sql.Date) new Date(); pstmt.setDate(1, d); //
	 * pstmt.setDate(2, (java.sql.Date) d2); // pstmt.setDate(3, (java.sql.Date) d3); rows = pstmt.executeUpdate(); }
	 * catch (SQLException e) { e.printStackTrace(); } return rows; }
	 */
}
