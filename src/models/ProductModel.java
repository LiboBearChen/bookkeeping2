/**
 * Program Name: productModel.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 2, 2020
 */
package models;

/**
 * @author Libo
 *
 */
public class ProductModel
{
	private String productName, productDimension;
	private double productQuantity; 
  private double unitPrice, totalPrice;
  private String note;
  
  public ProductModel(String n, String d, double q, double up, double tp, String no)
  {
  	productName=n;
  	productDimension=d;
  	productQuantity=q;
  	unitPrice=up;
  	totalPrice=tp;
  	note=no;
  }
  
  public void setProductName(String n)
	{
  	productName=n;
	}
  public void setProductDimension(String d)
	{
  	productDimension=d;
	}  
  public void setProductQuantity(double q)
	{
  	productQuantity=q;
	}
  public void setUnitPrice(double up)
	{
  	unitPrice=up;
	}
  public void setTotalPrice(double tp)
	{
  	totalPrice=tp;
	}
  public void setNote(String no)
	{
  	note=no;
	}

  public String getProductName()
	{
		return productName;
	}
  public String getProductDimension()
	{
		return productDimension;
	}
  public double getProductQuantity()
	{
		return productQuantity;
	}
  public double getUnitPrice()
	{
		return unitPrice;
	}
  public double getTotalPrice()
	{
		return totalPrice;
	}
  public String getNote()
	{
		return note;
	}
}
