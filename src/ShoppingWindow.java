/**
 * Program:	ShoppingWindow.java
 * Purpose:	
 * Coder:	Eric Roodzant - 0644375
 * Date:	Apr 11, 2016
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class ShoppingWindow extends JFrame
{
	/* @nick Customer */
	Customer customer;

	private int size = 4;
	
	private  JButton [] bMore;
	
	private JButton [] addToCart;
	
	private JButton [] remove;
	
	private JButton confirmOrder;
	private JLabel lblSubTotal;
	private JLabel lblCarrot; 
	
	//description box's
	private JTextArea [] description;
	
	private JTextField subTotal;
	private JPanel topPanel,bottomPanel;
	
	private JPanel [] products;
	private Product [] products_arr;
	
	private BufferedImage ironThrone;

	private ImageIcon carrot;
	/* Customer init */
	customer = new Customer();
	/* @Nick added Data of Products for use */
	private String[] quant_arr  = {"1","2","3","4","5","6","7","8","9","10"};
	private String[] colour_arr = {"Black", "White", "Brown", "Orange" , "Blue", "Red"};
	/* @Nick added the arrays for JComboBox ... */
	private JComboBox[] colour;
	@SuppressWarnings("rawtypes")/* @nick, I have no idea what is happening here...
									just eclipse sure seems to like it */
	private JComboBox[] quantity;
	public ShoppingWindow()
	{
		super("Welcome to the iDea! Store Online Shopping System");
		this.setLayout(new BorderLayout());
	
		/* ERRRORRRRR HEEEEEREEE @!!!!!!! FUUUUUCk */	
		buildTopPanel();
		buildBottomPanel();
		
		add(topPanel,BorderLayout.CENTER);
		add(bottomPanel,BorderLayout.SOUTH);
		
		
		setSize(800,450);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	private void buildTopPanel()
	{
		topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(1,4,10,10));
		topPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1), ""));
		topPanel.setBackground(Color.white);
		products = new JPanel[size];
		
		description = new JTextArea[size];
		bMore = new JButton[size];
		addToCart = new JButton[size];
		remove = new JButton[size];
		
		
		
		/* @ NICK Product population */
		products_arr[0] = new Product("Carrot",
				"Nulla facilisi. Interdum et malesuada fames ac ante ipsum primis in faucibus. "
				+ "Vivamus lobortis viverra blandit. Suspendisse potenti. Etiam tristique molestie"
				+ " nisi, et hendrerit ipsum elementum egestas.", 
				"",
				149.99);
		products_arr[1] = new Product("The Iron Throne","Morbi mollis eros a lorem eleifend faucibus. "
				+ "Maecenas dictum lobortis libero, sed euismod risus euismod eu. Sed et tempor mi. "
				+ "Nunc dictum vehicula elit sed dignissim. Etiam rutrum venenatis mauris, vel mollis"
				+ " nibh bibendum at. ", "", 4000.59);
		products_arr[2] = new Product("Carrot",
				"Nulla facilisi. Interdum et malesuada fames ac ante ipsum primis in faucibus. "
				+ "Vivamus lobortis viverra blandit. Suspendisse potenti. Etiam tristique molestie"
				+ " nisi, et hendrerit ipsum elementum egestas.", 
				"",
				149.99);
		products_arr[3] = new Product("The Iron Throne","Morbi mollis eros a lorem eleifend faucibus. "
				+ "Maecenas dictum lobortis libero, sed euismod risus euismod eu. Sed et tempor mi. "
				+ "Nunc dictum vehicula elit sed dignissim. Etiam rutrum venenatis mauris, vel mollis"
				+ " nibh bibendum at. ", "", 4000.59);
		////////TO DO:

		/*
		Image newCarrot = carrot.getImage();
		BufferedImage bCarrot = new BufferedImage(20,10,BufferedImage.TYPE_INT_ARGB);
		Graphics g = bCarrot.createGraphics(); 
		g.drawImage(newCarrot, 0, 0, 20, 10, null); 
		ImageIcon newIcon = new ImageIcon(bCarrot); 
		lblCarrot = new JLabel(carrot);
		/////////*/
		for(int i = 0;i<products.length;i++)
		{
			/* @Nick init J-Combo box */
			colour[i] = new JComboBox<String>(colour_arr);
			quantity[i] = new JComboBox<String>(quant_arr);
			
			
			carrot = new ImageIcon(products_arr[i].getImage());
			lblCarrot = new JLabel(products_arr[i].getName());
			products[i] = new JPanel();
			products[i].setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1), ""));
			
			/* JTextDescription */
			description[i] = new JTextArea();
			description[i].setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1), ""));
			description[i].setText(products_arr[i].getDescription());
			description[i].setPreferredSize(new Dimension(175,100));
			description[i].setLineWrap(true);
			description[i].setWrapStyleWord(true);
					
			description[i].setEditable(false);
			bMore[i] = new JButton("More");
			addToCart[i] = new JButton("Add To Cart");// @nick call add to cart from customer
			remove[i] = new JButton("Remove"); /*( @nick call remove from cart from customer
												Something to think about: do I need to be unique /  call an instance of it */
			
			/*@nick Trying to add listeners through here */
			/* addToCart btn */
			addToCart[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int temp_int = Integer.parseInt(quantity[i].getSelectedItem().toString());
					customer.addToCart(
							products_arr[i].getName(), colour[i].getSelectedItem().toString(),
							temp_int, products_arr[i].getPrice());
				}
			});
			
			/* remove */
			remove[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					customer.removeFromCart();
				}
			});
			
			//bMore[i]
			
			//products[i].add(lblCarrot);
			products[i].add(colour[i]);
			products[i].add(quantity[i]);
			products[i].add(description[i]);
			products[i].add(bMore[i]);
			products[i].add(addToCart[i]);
			products[i].add(remove[i]);
			topPanel.add(products[i]);
		}

		
	}
	private void buildBottomPanel()
	{
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout());
		lblSubTotal = new JLabel("SubTotal");
		confirmOrder = new JButton("Confirm Order");
		
		subTotal = new JTextField(Double.toString(Global.subtotal));
		subTotal.setPreferredSize(new Dimension(150,20));
		subTotal.setEditable(false);
		
		bottomPanel.add(lblSubTotal);
		bottomPanel.add(subTotal);
		bottomPanel.add(confirmOrder);
		bottomPanel.setBackground(Color.CYAN);
	}
}
//End of class