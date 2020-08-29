/**
 * Program Name: bankModel.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 1, 2020
 */
package models;

import java.util.ArrayList;

/**
 * @author Libo
 *
 */
public class BankModel
{
	private double totalMoney;
	private ArrayList<Payment> payInList, payOutList;
	private String bankName;
	
	public BankModel(double tm, ArrayList<Payment> pil, ArrayList<Payment> pol,String bn)
	{
		totalMoney=tm;
		payInList=pil;
		payOutList=pol;
		bankName=bn;
	}
	
	public void payIn(Payment p)
	{
		totalMoney+=p.getMoney();
		payInList.add(p);
	}

	public void payOut(Payment p)
	{
		totalMoney-=p.getMoney();
		payInList.add(p);
	}
}
