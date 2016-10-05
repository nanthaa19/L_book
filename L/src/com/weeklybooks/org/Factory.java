package com.weeklybooks.org;

public class Factory
{
	public static void main(String[] args)
	{
		WeeklyBooks wkb = new WinWin();
		System.out.println(wkb.getBookName()); 
	}
}
