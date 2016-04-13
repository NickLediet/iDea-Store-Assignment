/*
 * One day stuff will be here....
 */
public class Purchase
{
	/* instance fields */
	private String product, color;
	private int quantity;
	private double price;
	
	/* constructors */
	public Purchase(){
		product = "";
		color = "";
		quantity = 0;
		price = 0;
	}
	public Purchase(String product, String color, int quantity, double price){
		this.product = product;
		this.color = color;
		this.quantity = quantity;
		this.price = price;
	}
	/* Getters and Setters */
	public String getProduct()
	{
		return product;
	}
	public void setProduct(String product)
	{
		this.product = product;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	double calculatePurchase(){
		double total = price * quantity; 
		return total;
	}
}
//End of class