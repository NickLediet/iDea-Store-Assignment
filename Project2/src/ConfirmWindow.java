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
	public ConfirmWindow()
	{
		super("Confirm Order");
		setLayout(new GridLayout(3,1));
		
		buildListPanel();
		buildCalcPanel();
		buildBottomPanel();
		setSize(500,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void buildListPanel()
	{
		list_Panel = new JPanel(new FlowLayout());
		//array is cart
		String [] arrayOfOrders = {"order 1", "order 2","order 3"};
		
		orders = new JList<String>(arrayOfOrders);
		orders.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		orders.setBorder(BorderFactory.createLineBorder(Color.black,1));
		orders.setPreferredSize(new Dimension(350,200));

		list_Panel.add(orders);
		list_Panel.setSize(350,220);
		add(list_Panel);
	}
	private void buildCalcPanel()
	{
		calc_Panel = new JPanel();
		calc_Panel.setLayout(new GridLayout(4,2,10,5));
		//calc_Panel.setLocation(250, 250);
		
		//layout.putConstraint(SpringLayout.EAST, lblsubTotal, 5, SpringLayout.EAST, subTotal_field);
		
		
		lblsubTotal = new JLabel("SubTotal");
		lblHST = new JLabel("HST Amount");
		lblShipping = new JLabel("Shipping");
		lblTotal = new JLabel("Total");
		
		subTotal_field = new JTextField("",10);
		
		//subTotal_field.setLocation(250, 250);
		//subTotal_field.setPreferredSize(new Dimension(100,20));
		//subTotal_field.setAlignmentX(RIGHT_ALIGNMENT);
		
		hst_field = new JTextField("",10);
		//hst_field.setPreferredSize(new Dimension(100,20));
		//hst_field.setAlignmentX(RIGHT_ALIGNMENT);
		
		shipping_field = new JTextField("",10);
		//shipping_field.setPreferredSize(new Dimension(100,20));
	//	shipping_field.setAlignmentX(RIGHT_ALIGNMENT);
		
		total_field = new JTextField("",10);
		//total_field.setPreferredSize(new Dimension(100,20));
		//total_field.setAlignmentX(RIGHT_ALIGNMENT);
		calc_Panel.setSize(175,200);
		calc_Panel.add(lblsubTotal);
		calc_Panel.add(subTotal_field);
		calc_Panel.add(lblHST);
		calc_Panel.add(hst_field);
		calc_Panel.add(lblShipping);
		calc_Panel.add(shipping_field);
		calc_Panel.add(lblTotal);
		calc_Panel.add(total_field);
		
		add(calc_Panel);
	}
	private void buildBottomPanel()
	{
		bottom_Panel = new JPanel(new FlowLayout());
		
		lbleditButton = new JLabel("Select a Purchase to edit");
		
		bEdit = new JButton("edit");
		bContinueShopping = new JButton("Continue Shopping");
		bCheckout = new JButton("Checkout");
		
		bottom_Panel.add(lbleditButton);
		bottom_Panel.add(bEdit);
		bottom_Panel.add(bContinueShopping);
		bottom_Panel.add(bCheckout);
		add(bottom_Panel);
		
	}
}
//End of class