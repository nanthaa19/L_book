package com.abstractFactory.org;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreaterFactory
{
	
	public static void main(String[] args) throws ParseException
	{
		// KLBooksAdmin kl = DBConnections.getInstance();
		//
		// NewBook addOne = new NewBook();
		//
		// addOne.setName("karun");
		// addOne.setWeekDay((byte) 235);
		// addOne.setKeyWord("KW");
		// addOne.setNoOfSeries((byte) 5);
		// addOne.setDistrict("trichy");
		// addOne.setType("weekly");
		// addOne.setDateOfFirstLaunch(new Date());
		//
		// System.out.println("inserted "+kl.insertNewBookToCategory(addOne));
		
		// Date d1 = new Date();
		// Date d2 = new Date();
		// Date d3 = new Date();
		
		// System.out.println(((DBConnections) kl).insertDate(d1, d2, d3));
		
		System.out.println("Success");
		
		Date date = new Date();
		Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse("1992/10/28");
		System.out.println(new Date());
		System.out.println(date.toString());
		
		System.out.println(date2);
		System.out.println(date2.getTime());
		
		java.sql.Date date3 = new java.sql.Date(date2.getTime());
		System.out.println(date3);
		
		String date4 = date2.toString();
		System.out.println(date4);
	}
}
