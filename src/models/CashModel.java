/**
 * Program Name: cashModel.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Jul. 31, 2020
 */
package models;

import java.util.ArrayList;

/**
 * @author Libo
 *
 */
public class CashModel
{

	private double totalMoney;
	private ArrayList<Payment> payInList, payOutList;
	
	public CashModel(double tm, ArrayList<Payment> pil, ArrayList<Payment> pol)
	{
		totalMoney=tm;
		payInList=pil;
		payOutList=pol;
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
