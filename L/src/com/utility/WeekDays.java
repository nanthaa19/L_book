package com.utility;

import java.util.HashMap;
import java.util.Map;

public class WeekDays
{
	private byte dayId;
	private String name;
	
	public byte getDayId()
	{
		return dayId;
	}
	
	public void setDayId(byte dayId)
	{
		this.dayId = dayId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public WeekDays()
	{
		super();
	}
	
	public WeekDays(byte dayId, String name)
	{
		super();
		this.dayId = dayId;
		this.name = name;
	}
	
	private static Map<Integer, String> weekDays;
	
	static
	{
		weekDays = new HashMap<Integer, String>();
		weekDays.put(1, "Sunday");
		weekDays.put(2, "Monday");
		weekDays.put(3, "Tuesday");
		weekDays.put(4, "Wednesday");
		weekDays.put(5, "Thursday");
		weekDays.put(6, "Friday");
		weekDays.put(7, "Saturday");
	}
	
	public static Map<Integer, String> getWeekDays()
	{
		return weekDays;
	}
	
	public static void main(String[] args)
	{
		for (Map.Entry m : new WeekDays().getWeekDays().entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println(enterWeekDayID(15));
		
		System.out.println(" * "+getWeekDays());
	}
	
	public static String enterWeekDayID(int i)
	{
		return new WeekDays().getWeekDays().get(i);
	}
	
}
