import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConfirmWindow extends JFrame
{
	private JList<String> orders;
	private JLabel lblsubTotal,lblHST,lblShipping,lblTotal,lbleditButton;
	private JTextField subTotal_field,hst_field,shipping_field,total_field;
	private JButton bEdit,bContinueShopping,bCheckout;
	private JPanel list_Panel,calc_Panel,bottom_Panel;
	SpringLayout layout;
	public ConfirmWindow()
	{
		super("Confirm Order");
		layout = new SpringLayout();
		setLayout(layout);
		
		
		//array is cart
		String [] arrayOfOrders = {"order 1", "order 2","order 3"};
		
		orders = new JList<String>(arrayOfOrders);
		orders.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		orders.setBorder(BorderFactory.createLineBorder(Color.black,1));
		orders.setPreferredSize(new Dimension(480,200));

		add(orders);
		
		
		layout.putConstraint(SpringLayout.WEST, orders, 5, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, orders, 20, SpringLayout.NORTH,
				this.getContentPane());
		
		
		
		buildCalcPanel();
		
		
		
		buildBottomPanel();
		setSize(500,450);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildCalcPanel()
	{
		//calc_Panel = new JPanel();
		//SpringLayout layout = new SpringLayout();
		//calc_Panel.setLayout(layout);
		
		lblsubTotal = new JLabel("SubTotal");
		lblHST = new JLabel("HST Amount");
		lblShipping = new JLabel("Shipping");
		lblTotal = new JLabel("Total");
		
		subTotal_field = new JTextField("",10);
		

		hst_field = new JTextField("",10);

		shipping_field = new JTextField("",10);

		total_field = new JTextField("",10);

		setSize(175,200);
		add(lblsubTotal);
		add(subTotal_field);
		add(lblHST);
		add(hst_field);
		add(lblShipping);
		add(shipping_field);
		add(lblTotal);
		add(total_field);
		
		
		layout.putConstraint(SpringLayout.WEST, lblsubTotal, 250, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblsubTotal, 230, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, subTotal_field, 350, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, subTotal_field, 230, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, lblHST, 250, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblHST, 260, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, hst_field, 350, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, hst_field, 260, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, lblShipping, 250, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblShipping, 290, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, shipping_field,350, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, shipping_field, 290, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, lblTotal, 250, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblTotal, 320, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, total_field, 350, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, total_field, 320, SpringLayout.NORTH,
				this.getContentPane());
		
	}
	private void buildBottomPanel()
	{

		lbleditButton = new JLabel("Select a Purchase to edit");
		
		bEdit = new JButton("edit");
		bContinueShopping = new JButton("Continue Shopping");
		bCheckout = new JButton("Checkout");
		
		add(lbleditButton);
		add(bEdit);
		add(bContinueShopping);
		add(bCheckout);

		layout.putConstraint(SpringLayout.WEST, lbleditButton, 10, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lbleditButton, 360, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, bEdit, 160, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, bEdit, 360, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, bContinueShopping, 230, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, bContinueShopping, 360, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, bCheckout, 380, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, bCheckout, 360, SpringLayout.NORTH,
				this.getContentPane());
		
	}
}
//End of class