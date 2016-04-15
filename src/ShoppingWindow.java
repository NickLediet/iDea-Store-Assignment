/**
 * Program:	ShoppingWindow.java
 * Purpose:	
 * Coder:	Eric Roodzant - 0644375
 * Date:	Apr 11, 2016
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

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
	private ArrayList<Product> products_arrl;	
	/* @Nick added Data of Products for use */
	String[] quant_arr = {"1","2","3","4","5","6","7","8","9","10"};
	String[] colour_arr = {"Black", "White", "Brown", "Orange" , "Blue", "Red"};
	
	/* @Nick added the arrays for JComboBox ... */
	private JComboBox<String> colour;
	private JComboBox<String> quantity;
	private JLabel[] lbl_arr = new JLabel[size];
	
	int i = 0;
	public ShoppingWindow()
	{
		
		super("Welcome to the iDea! Store Online Shopping System");
		this.setLayout(new BorderLayout());
	
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
		/* Customer init */
		customer = new Customer();
		
		
		
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
		products_arrl = new ArrayList<Product>();
		products_arrl.add( new Product("Carrot",
				"Nulla facilisi. Interdum et malesuada fames ac ante ipsum primis in faucibus. "
				+ "Vivamus lobortis viverra blandit. Suspendisse potenti. Etiam tristique molestie"
				+ " nisi, et hendrerit ipsum elementum egestas.", 
				"",
				149.99));
		products_arrl.add(new Product("The Iron Throne","Morbi mollis eros a lorem eleifend faucibus. "
				+ "Maecenas dictum lobortis libero, sed euismod risus euismod eu. Sed et tempor mi. "
				+ "Nunc dictum vehicula elit sed dignissim. Etiam rutrum venenatis mauris, vel mollis"
				+ " nibh bibendum at. ", "", 4000.59));
		products_arrl.add(new Product("Carrot",
				"Nulla facilisi. Interdum et malesuada fames ac ante ipsum primis in faucibus. "
				+ "Vivamus lobortis viverra blandit. Suspendisse potenti. Etiam tristique molestie"
				+ " nisi, et hendrerit ipsum elementum egestas.", 
				"",
				149.99));
		products_arrl.add(new Product("The Iron Throne","Morbi mollis eros a lorem eleifend faucibus. "
				+ "Maecenas dictum lobortis libero, sed euismod risus euismod eu. Sed et tempor mi. "
				+ "Nunc dictum vehicula elit sed dignissim. Etiam rutrum venenatis mauris, vel mollis"
				+ " nibh bibendum at. ", "", 4000.59));
		
		////////TO DO:

		/*
		Image newCarrot = carrot.getImage();
		BufferedImage bCarrot = new BufferedImage(20,10,BufferedImage.TYPE_INT_ARGB);
		Graphics g = bCarrot.createGraphics(); 
		g.drawImage(newCarrot, 0, 0, 20, 10, null); 
		ImageIcon newIcon = new ImageIcon(bCarrot); 
		lblCarrot = new JLabel(carrot);
		/////////*/
		for(Product p : products_arrl)// p is never used ... this is just a looping tool
		{
			/* @Nick init J-Combo box */
			colour = new JComboBox<>(colour_arr);
			quantity = new JComboBox<>(quant_arr);

			
			// carrot = new ImageIcon(products_arrl.get(i).getImage());
			lbl_arr[i] = new JLabel(products_arrl.get(i).getName());
			products[i] = new JPanel();
			products[i].setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1), ""));
			
			/* JTextDescription */
			description[i] = new JTextArea();
			description[i].setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1), ""));
			description[i].setText(products_arrl.get(i).getDescription());
			description[i].setPreferredSize(new Dimension(175,100));
			description[i].setLineWrap(true);
			description[i].setWrapStyleWord(true);
					
			description[i].setEditable(false);
			bMore[i] = new JButton("More");
			addToCart[i] = new JButton("Add To Cart");// @nick call add to cart from customer
			remove[i] = new JButton("Remove"); 
			
			/*@nick Trying to add listeners through here */
			/* addToCart btn */
			addToCart[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int temp_int = Integer.parseInt(quantity.getSelectedItem().toString());
					customer.addToCart(
							products_arrl.get(i).getName(), colour.getSelectedItem().toString(),
							temp_int, products_arrl.get(i).getPrice());
					subTotal.setText(Double.toString(Global.subtotal));
				}
			});
			
			/* remove */
			remove[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					customer.removeFromCart();
					subTotal.setText(Double.toString(Global.subtotal));
				}
			});
			
			//bMore[i]
			
			//products[i].add(lblCarrot);
			products[i].add(lbl_arr[i]);
			products[i].add(description[i]);
			products[i].add(colour);
			products[i].add(quantity);
			products[i].add(bMore[i]);
			products[i].add(addToCart[i]);
			products[i].add(remove[i]);
			topPanel.add(products[i]);
			
			/* abort!  So java insists that in someparts I wasn't final "enough"
			 * so I set up a enchanced for loop interating over products with i being a controller*/
			if(i == 3){
				i = 0;
				break;
			} else {
				i++;
			}
		}

		
	}
	private void buildBottomPanel()
	{
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout());
		lblSubTotal = new JLabel("SubTotal");
		confirmOrder = new JButton("Confirm Order");
		
		subTotal = new JTextField();
		subTotal.setPreferredSize(new Dimension(150,20));
		subTotal.setEditable(false);
		confirmOrder.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ConfirmWindow confirmFrame = new ConfirmWindow();
			}
		});
		
		bottomPanel.add(lblSubTotal);
		bottomPanel.add(subTotal);
		bottomPanel.add(confirmOrder);
		bottomPanel.setBackground(Color.CYAN);
	}
}
//End of class