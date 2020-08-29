/**
 * Program Name: DealModel.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 14, 2020
 */
package models;
import java.util.ArrayList;

/**
 * @author Libo
 *
 */
public class DealModel
{
	private ArrayList<ProductModel> productList;
	private double price;
	
	public DealModel(ArrayList<ProductModel> pl, double p)
	{
		productList=pl;
		price=p;
	}

	public void setProductList(ArrayList<ProductModel> pl)
	{
		productList=pl;
	}
	public void setPrice(double p)
	{
		price=p;
	}
	
	public ArrayList<ProductModel> getProductList()
	{
		return productList;
	}
	public double getPrice()
	{
		return price;
	}
}
