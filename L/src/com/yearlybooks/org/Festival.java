package com.yearlybooks.org;

public class Festival implements YearlyBooks
{
	private final String bookName, festivalName;
	
	public Festival()
	{
		bookName = "First Festival";
		festivalName = "One";
	}
	
	@Override
	public String getBookName()
	{
		return bookName;
	}
	
	@Override
	public String getSpescialDay()
	{
		return festivalName;
	}
	
}

//------------------------------------------------------------------------------------------------//

class SecondFestival implements YearlyBooks
{
	private final String bookName, festivalName;
	
	public SecondFestival()
	{
		bookName = "Second Festival";
		festivalName = "Two";
	}
	
	@Override
	public String getBookName()
	{
		return bookName;
	}
	
	@Override
	public String getSpescialDay()
	{
		return festivalName;
	}
	
}


//------------------------------------------------------------------------------------------------//

class ThirdFestival implements YearlyBooks
{
	private final String bookName, festivalName;
	
	public ThirdFestival()
	{
		bookName = "Third Festival";
		festivalName = "Three";
	}
	
	@Override
	public String getBookName()
	{
		return bookName;
	}
	
	@Override
	public String getSpescialDay()
	{
		return festivalName;
	}
	
}


//------------------------------------------------------------------------------------------------//

class FourthFestival implements YearlyBooks
{
	private final String bookName, festivalName;
	
	public FourthFestival()
	{
		bookName = "Fourth Festival";
		festivalName = "Four";
	}
	
	@Override
	public String getBookName()
	{
		return bookName;
	}
	
	@Override
	public String getSpescialDay()
	{
		return festivalName;
	}
	
}


//------------------------------------------------------------------------------------------------//

class FifthFestival implements YearlyBooks
{
	private final String bookName, festivalName;
	
	public FifthFestival()
	{
		bookName = "Fifth Festival";
		festivalName = "Five";
	}
	
	@Override
	public String getBookName()
	{
		return bookName;
	}
	
	@Override
	public String getSpescialDay()
	{
		return festivalName;
	}
	
}
