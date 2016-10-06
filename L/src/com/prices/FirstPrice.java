package com.prices;

public class FirstPrice extends Prizes
{
	
	String name ;
	
	private int id;
	private int bid;
	private String series;
	private String code ;
	private String district ;
	
	
	
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getBid()
	{
		return bid;
	}

	public void setBid(int bid)
	{
		this.bid = bid;
	}

	public String getSeries()
	{
		return series;
	}

	public void setSeries(String series)
	{
		this.series = series;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getDistrict()
	{
		return district;
	}

	public void setDistrict(String district)
	{
		this.district = district;
	}

	public FirstPrice(int id, int bid, String code,String series, String district)
	{
		super();
		this.id = id;
		this.bid = bid;
		this.series = series;
		this.code = code;
		this.district = district;
	}

	public FirstPrice()
	{
		name = "First Price";
	}
	
	@Override
	String getPrizeName()
	{
		return name;
	}
	
	@Override
	short totalNumbersOfPrizes(byte total)
	{
		return total;
	}
	
	
}
