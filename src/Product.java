import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.*;
import javax.swing.*;

/**
 *  Progrem Name: Product.java
		Purpose: Simplifies the products to display to the GUI pannels.  Will also hold a method 
				create the images.
		Coder: Nick Lediet 
		Date: Apr 13, 2016
 */

public class Product
{
	private String name, description, image;
	private double price;
	
	/* Constructor */
	/* Zero-Arg */
	public Product(){
		name = ""; description = ""; image = "";
		price = 0;
	}
	/* Multi-Arg */ 
	public Product(String name, String description, String image, double price){
		this.name = name;
		this.description = description;
		this.image = image;
		this.price = price;
	}
	/* Getters and Setters */
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public String getImage()
	{
		return image;
	}
	public void setImage(String image)
	{
		this.image = image;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}	
}

