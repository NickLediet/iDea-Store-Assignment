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
		setLayout(new FlowLayout());
		
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
		
		setSize(250,300);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
//End of class