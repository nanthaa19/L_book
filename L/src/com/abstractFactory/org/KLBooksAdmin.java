package com.abstractFactory.org;

import java.util.Date;

import com.pojo.BookEntry;
import com.pojo.Employees;
import com.pojo.NewBook;

public interface KLBooksAdmin
{
	/* ---------------------- */
	
	int insertNewEmployee(Employees insertNewEmployee); // 1
	
	int updateNewEmployeee(Employees updateAllField); // 2
	
	int deleteEmployee(Employees deleteEmployee); // 3
	
	boolean checkEmployeeByEmailId(String emailId); // 4
	
	boolean checkEmployeeByMobilePhone(String mobileNo); // 5
	
	Employees viewEmployees(); // 6
	
	Employees searchEmployee(String employeeName); // 7
	
	Employees aliveEmployees(); // 8
	
	Employees deadEmployees(); // 9
	
	Employees getEmployee(String userId, String password); // 10
	
	/* ----------------------- */
	
	int insertNewBookToCategory(NewBook addNew); //
	
	int updateNewBook(int id);
	
	int deleteNewBook(int id);
	
	NewBook viewNewBook();
	
	NewBook searchNewBook(String bookName);
	
	/* ---------------------- */
	
	int insertDailyBookName(BookEntry addEntry);
	
	int updateDailyBookName(int id);
	
	int deleteDailyBookName(int id);
	
	BookEntry viewBookEntry();
	
	BookEntry viewByDate(Date enterDate);
	
	/* ---------------------- */
}
