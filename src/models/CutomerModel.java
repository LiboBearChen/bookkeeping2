/**
 * Program Name: cutomerModel.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Jul. 31, 2020
 */
package models;

import java.util.ArrayList;

public class CutomerModel
{

	private String companyName;
	private ArrayList<DebtModel> debtList;
	private ArrayList<DealModel> dealList;
	
	public CutomerModel(String cn, ArrayList<DebtModel> dbl, ArrayList<DealModel> del)
	{
		companyName=cn;
		debtList=dbl;
		dealList=del;
	}

	public void setCompanyName(String cn)
	{
		companyName=cn;
	}
	public void setDebtList(ArrayList<DebtModel> dl)
	{
		debtList=dl;
	}
	public void setDealList(ArrayList<DealModel> dl)
	{
		dealList=dl;
	}
	
	public String getCompanyName()
	{
		return companyName;
	}
	public ArrayList<DebtModel> getDebtList()
	{
		return debtList;
	}
	public ArrayList<DealModel> getDealList()
	{
		return dealList;
	}
}
