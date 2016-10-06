package com.abstractFactory.org;

import java.util.Date;

import com.pojo.BookEntry;
import com.pojo.NewBook;

public interface KLBooksAdmin
{
	int insertNewBookToCategory(NewBook addNew);
	
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
	
}
