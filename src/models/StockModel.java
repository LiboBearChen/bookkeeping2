/**
 * Program Name: stockModel.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Jul. 31, 2020
 */
package models;
import java.util.ArrayList;;
/**
 * @author Libo
 *
 */
public class StockModel
{
	private ArrayList<ProductModel> productList;
	
	public StockModel()
	{
		productList=new ArrayList<ProductModel>();
	}

	public StockModel(ArrayList<ProductModel> pl)
	{
		productList=pl;
	}
	
	public void addProduct(ProductModel p)
	{
		productList.add(p);
	}
	
	public void removeProduct(ProductModel p)
	{
		productList.remove(p);
	}
	
	public ArrayList<ProductModel> getProductList()
	{
		return productList;
	}

}
