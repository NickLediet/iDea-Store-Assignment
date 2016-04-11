import java.util.ArrayList;

/* 
 * Documentation to come
 */
public class Customer
{	
	/* instance fields */
	private String firstName, lastName, address, province, postalCode,
					email, paymentMethod;
	private static final double HST_RATE = 0.13, SHIPPING_FEE = 25;
	
	/* Constructor */
	public Customer(){
		firstName = ""; lastName= ""; address= ""; province= ""; postalCode= "";
		email= ""; paymentMethod = "";
		Global.cart = new ArrayList<Purchase>();
		Global.subtotal = 0;
	}
	/* Generated Getters and Setters */
	
	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getProvince()
	{
		return province;
	}

	public void setProvince(String province)
	{
		this.province = province;
	}

	public String getPostalCode()
	{
		return postalCode;
	}

	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPaymentMethod()
	{
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod)
	{
		this.paymentMethod = paymentMethod;
	}

	public static double getHstRate()
	{
		return HST_RATE;
	}

	public static double getShippingFee()
	{
		return SHIPPING_FEE;
	}
	
	/* addToCart */
	public void addToCart(String product, String color, int quantity, double price){
		Purchase purchase = new Purchase(product, color, quantity, price);
		Global.cart.add(purchase);
		calculateSubtotal();
	}
	/* removeFromCart() */
	public void removeFromCart(){
		Global.cart.remove(Global.cart.size() - 1);
		calculateSubtotal();
	}
	/* clearCart() */
	public void clearCart(){
		Global.cart.clear(); 
		calculateSubtotal();
	}
	/* calculateSubtotal() */
	void calculateSubtotal(){
		Global.subtotal = 0;
		for(int i = 0; i < Global.cart.size(); i++ ){
			Global.subtotal += Global.cart.get(i).getPrice();
		}
	}
	/* calculateHst() */
	double calculateHst(){
		double hst = Global.subtotal * HST_RATE;
		return hst;
	}
	/* calculateShipping()*/
	double calculateShipping(){
		double shippingCost, shipModifier = 0;
		if(Global.subtotal <= 75){
			shipModifier = 1;
		} else if(Global.subtotal > 75 && Global.subtotal <= 200){
			shipModifier = 2;
		} else if(Global.subtotal > 200 && Global.subtotal <= 550){
			shipModifier = 3;
		} else if(Global.subtotal > 550){
			shipModifier = 4;
		}
		
		shippingCost = SHIPPING_FEE * shipModifier;
		return shippingCost;
	}
	/* calculateTotal */
	double calculateTotal(){
		return Global.subtotal + calculateHst() + calculateShipping();
	}
}
//End of class





























