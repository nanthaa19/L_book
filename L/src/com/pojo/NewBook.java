package com.pojo;

import java.util.Date;

public class NewBook
{
	private int id;
	private String name;
	private byte weekDay;	// enum
	private String keyWord;
	private byte noOfSeries;
	private String district;
	private Date dateOfFirstLaunch; // date
	private String type;
	private int createrId;
	private Date entryDate; // date
	
	

	public NewBook()
	{
		super();	
	}
	
		
	public NewBook(String name, byte weekDay, String keyWord, byte noOfSeries, String district, Date dateOfFirstLaunch, String type,
			int createrId, Date entryDate)
	{
		
		// constructor without id
		super();
		this.name = name;
		this.weekDay = weekDay;
		this.keyWord = keyWord;
		this.noOfSeries = noOfSeries;
		this.district = district;
		this.dateOfFirstLaunch = dateOfFirstLaunch;
		this.type = type;
		this.createrId = createrId;
		this.entryDate = entryDate;
	}

	
	public NewBook(int id, String name, byte weekDay, String keyWord, byte noOfSeries, String district, Date dateOfFirstLaunch,
			String type, int createrId, Date entryDate)
	{
		super();
		this.id = id;
		this.name = name;
		this.weekDay = weekDay;
		this.keyWord = keyWord;
		this.noOfSeries = noOfSeries;
		this.district = district;
		this.dateOfFirstLaunch = dateOfFirstLaunch;
		this.type = type;
		this.createrId = createrId;
		this.entryDate = entryDate;
	}


	public int getId()
	{
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public byte getWeekDay()
	{
		return weekDay;
	}


	public void setWeekDay(byte weekDay)
	{
		this.weekDay = weekDay;
	}


	public String getKeyWord()
	{
		return keyWord;
	}


	public void setKeyWord(String keyWord)
	{
		this.keyWord = keyWord;
	}


	public byte getNoOfSeries()
	{
		return noOfSeries;
	}


	public void setNoOfSeries(byte noOfSeries)
	{
		this.noOfSeries = noOfSeries;
	}


	public String getDistrict()
	{
		return district;
	}


	public void setDistrict(String district)
	{
		this.district = district;
	}


	public Date getDateOfFirstLaunch()
	{
		return dateOfFirstLaunch;
	}


	public void setDateOfFirstLaunch(Date dateOfFirstLaunch)
	{
		this.dateOfFirstLaunch = dateOfFirstLaunch;
	}


	public String getType()
	{
		return type;
	}


	public void setType(String type)
	{
		this.type = type;
	}


	public int getCreaterId()
	{
		return createrId;
	}


	public void setCreaterId(int createrId)
	{
		this.createrId = createrId;
	}


	public Date getEntryDate()
	{
		return entryDate;
	}


	public void setEntryDate(Date entryDate)
	{
		this.entryDate = entryDate;
	}


}
