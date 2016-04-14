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
	
	private JComboBox<String> []colour;
	private JComboBox<String> []quantity;
	
	private JPanel [] products;
	
	private BufferedImage ironThrone;

	private ImageIcon carrot;
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
		topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(1,4,10,10));
		topPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1), ""));
		topPanel.setBackground(Color.white);
		products = new JPanel[size];
		
		description = new JTextArea[size];
		bMore = new JButton[size];
		addToCart = new JButton[size];
		remove = new JButton[size];
		
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
			carrot = new ImageIcon("carrot.jpg");
			lblCarrot = new JLabel(carrot);
			products[i] = new JPanel();
			products[i].setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1), ""));
			
			description[i] = new JTextArea();
			description[i].setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1), ""));
			description[i].setText("description goes here");
			description[i].setPreferredSize(new Dimension(175,100));
			description[i].setLineWrap(true);
			description[i].setWrapStyleWord(true);
			
			description[i].setEditable(false);
			bMore[i] = new JButton("More");
			addToCart[i] = new JButton("Add To Cart");
			remove[i] = new JButton("Remove");
			
			//bMore[i]
			
			//products[i].add(lblCarrot);

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
		
		subTotal = new JTextField();
		subTotal.setPreferredSize(new Dimension(150,20));
		subTotal.setEditable(false);
		
		bottomPanel.add(lblSubTotal);
		bottomPanel.add(subTotal);
		bottomPanel.add(confirmOrder);
		bottomPanel.setBackground(Color.CYAN);
	}
}
//End of class