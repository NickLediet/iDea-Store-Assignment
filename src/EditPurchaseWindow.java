import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EditPurchaseWindow extends JFrame
{
	private JLabel lblproduct,lblcolour,lblquantity,lblprice;
	private JTextField productTF,priceTF;
	private JComboBox<String> cmbColour,cmbQuantity;
	private JButton bDone;
	
	public EditPurchaseWindow()
	{
		super("Edit Purchase");
		SpringLayout layout = new SpringLayout();
		this.setLayout(layout);
		
		lblproduct = new JLabel("Product");
		lblcolour = new JLabel("Colour");
		lblquantity = new JLabel("Quantity");
		lblprice = new JLabel("Price");
		
		productTF = new JTextField("",7);
		
		cmbColour = new JComboBox();
		cmbQuantity = new JComboBox();
		
		priceTF = new JTextField("",5);
		
		bDone = new JButton("Done");
		
		add(lblproduct);
		add(productTF);
		add(lblcolour);
		add(cmbColour);
		add(lblquantity);
		add(cmbQuantity);
		add(lblprice);
		add(priceTF);
		add(bDone);
		
		
		layout.putConstraint(SpringLayout.WEST, lblproduct, 30, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblproduct, 30, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, productTF, 100, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, productTF, 30, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, lblcolour, 30, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblcolour, 90, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, cmbColour, 100, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, cmbColour, 90, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, lblquantity, 30, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblquantity, 150, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, cmbQuantity, 100, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, cmbQuantity, 150, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, lblprice, 30, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblprice, 210, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, priceTF, 100, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, priceTF, 210, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, bDone, 180, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, bDone, 210, SpringLayout.NORTH,
				this.getContentPane());
		
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
//End of class