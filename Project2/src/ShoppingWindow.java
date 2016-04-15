/**
 * Program:	ShoppingWindow.java
 * Purpose:	
 * Coder:	Eric Roodzant - 0644375
 * Date:	Apr 11, 2016
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;
import javax.swing.*;

public class ShoppingWindow extends JFrame
{ 

	private int size = 4;
	
	private  JButton [] bMore;
	
	private JButton [] addToCart;
	
	private JButton [] remove;
	
	private JButton confirmOrder;
	private JLabel lblSubTotal;
	private JLabel lblCarrot,lblironThrone; 
	
	//array of images
	private JLabel [] images;
	//description box's
	private JTextArea [] description;
	
	private JTextField subTotal;
	private JPanel topPanel,bottomPanel;
	
	private JComboBox<String> []colour;
	private JComboBox<String> []quantity;
	
	//array of string to grab images
	private String [] imageList = {"Carrot.jpg","IronThrone.jpg","table.jpg","couch.jpg"};
	private JPanel [] products;
	
	//private Image carrot;
	public ShoppingWindow() throws IOException
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
	private void buildTopPanel() throws IOException
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
		
		//colour = new JComboBox<String>();
		
		//initialize array of images
		images = new JLabel[size];	

		
		for(int i = 0;i<products.length;i++)
		{

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
			
			//create a new image that is scaled down to fit in panel
			BufferedImage image = ImageIO.read(new File(imageList[i]));
			BufferedImage newImage = new BufferedImage(180, 150,BufferedImage.SCALE_SMOOTH);
			newImage.getGraphics().drawImage(image, 0, 0, 180, 150, null); 
			ImageIcon newIcon = new ImageIcon(newImage);
			//add image to label array
			images[i] = new JLabel(newIcon);
			
			//add image to panel
			products[i].add(images[i]);

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