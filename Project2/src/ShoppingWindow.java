/**
 * Program:	ShoppingWindow.java
 * Purpose:	
 * Coder:	Eric Roodzant - 0644375
 * Date:	Apr 11, 2016
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShoppingWindow extends JFrame
{
	private JButton more1;
	private JButton more2;
	private JButton more3;
	private JButton more4;
	
	private JButton addToCart1;
	private JButton addToCart2;
	private JButton addToCart3;
	private JButton addToCart4;
	
	private JButton remove1;
	private JButton remove2;
	private JButton remove3;
	private JButton remove4;
	
	private JButton confirmOrder;
	private JLabel subTotal;
	
	//description box's
	private JTextArea des1;
	private JTextArea des2;
	private JTextArea des3;
	private JTextArea des4;
	
	private JPanel topPanel;
	private JComboBox<String> colour, quantity;
	public ShoppingWindow()
	{
		super("Welcome to the iDea! Store Online Shopping System");
		this.setLayout(new BorderLayout());
		
		des1 = new JTextArea();
		des2 = new JTextArea();
		des3 = new JTextArea();
		des4 = new JTextArea();
		
		des1.setEditable(false);
		des2.setEditable(false);
		des3.setEditable(false);
		des4.setEditable(false);
		
		buildTopPanel();
		
		
		add(topPanel);
		
		setSize(700,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	private void buildTopPanel()
	{
		topPanel = new JPanel();
		topPanel.setLayout(new GridLayout());
	}
}
//End of class