/**
 * Program Name: Payment.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 8, 2020
 */
package models;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Libo
 *
 */
public class Payment
{
	private double money;
	private String note,customerName;
	private Date date;
	
	public Payment(double m, String n, String cn, Date d)
	{
		money=m;
		note=n;
		customerName=cn;
		date=d;
	}

	public void setMoney(double m)
	{
		money=m;
	}
	public void setNote(String n)
	{
		note=n;
	}
	public void setCustomerName(String cn)
	{
		customerName=cn;
	}
	public void setDate(Date d)
	{
		date=d;
	}
	
	public double getMoney()
	{
		return money;
	}
	public String getNote()
	{
		return note;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public Date getDate()
	{
		return date;
	}
}
