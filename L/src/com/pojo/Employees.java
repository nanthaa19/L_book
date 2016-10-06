package com.pojo;

import java.util.Date;

public class Employees
{
	private int id;
	private String fname;
	private String lname;
	private String password;
	private String emailId;
	private String mobileNo;
	private Date dob;
	private String designation;
	private int creater_id;
	private String status;
	private Date entryDate;
	
	public Employees()
	{
		super();
	}
	
	public Employees(String fname, String lname, String password, String emailId, String mobileNo, Date dob, String designation,
			int creater_id, String status, Date entryDate)
	{
		super();
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.designation = designation;
		this.creater_id = creater_id;
		this.status = status;
		this.entryDate = entryDate;
	}
	
	public Employees(int id, String fname, String lname, String password, String emailId, String mobileNo, Date dob, String designation,
			int creater_id, String status, Date entryDate)
	{
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.designation = designation;
		this.creater_id = creater_id;
		this.status = status;
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

	public String getFname()
	{
		return fname;
	}

	public void setFname(String fname)
	{
		this.fname = fname;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname(String lname)
	{
		this.lname = lname;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}

	public String getMobileNo()
	{
		return mobileNo;
	}

	public void setMobileNo(String mobileNo)
	{
		this.mobileNo = mobileNo;
	}

	public Date getDob()
	{
		return dob;
	}

	public void setDob(Date dob)
	{
		this.dob = dob;
	}

	public String getDesignation()
	{
		return designation;
	}

	public void setDesignation(String designation)
	{
		this.designation = designation;
	}

	public int getCreater_id()
	{
		return creater_id;
	}

	public void setCreater_id(int creater_id)
	{
		this.creater_id = creater_id;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
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
