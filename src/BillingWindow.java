import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class BillingWindow extends JFrame
{
	SpringLayout layout;
	private JPanel customerInfo, customerInvoice;
	private JLabel lblInfo,lblInvoice,lblfname,lbllname,lbladdress,lblcity
					,lblprovince,lblpostalcode,lblemail,lblpaymentMethod;
	private JTextField fnameTF,lnameTF,addressTF,cityTF
					,provinceTF,postalcodeTF,emailTF;
	private JRadioButton masterCard,visa;
	private JTextArea invoiceTextArea;
	private JButton bContinue,bExit;
	
	public BillingWindow()
	{
		layout = new SpringLayout();
		this.setLayout(new GridLayout(1,2,5,5));
		
		buildLeftPanel();
		buildRightPanel();
		
		setSize(800,450);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void buildLeftPanel()
	{
		customerInfo = new JPanel(layout);
		//customerInfo.setSize(new Dimension(450,225));
		customerInfo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1), ""));

		lblfname = new JLabel("First Name:");
		lbllname = new JLabel("Last Name:");
		lbladdress = new JLabel("Address:");
		lblcity = new JLabel("City:");
		lblprovince = new JLabel("province:");
		lblpostalcode = new JLabel("Postal Code:");
		lblemail = new JLabel("Email Address:");
		lblpaymentMethod = new JLabel("Method of Payment:");
		
		fnameTF = new JTextField(15);
		lnameTF = new JTextField(15);
		addressTF = new JTextField(15);
		cityTF = new JTextField(15);
		provinceTF = new JTextField(15);
		postalcodeTF = new JTextField(15);
		emailTF = new JTextField(15);
		
		masterCard = new JRadioButton("Master Card");
		visa = new JRadioButton("Visa");
		
		bContinue = new JButton("Continue");
		
		customerInfo.add(lblfname);
		customerInfo.add(lbllname);
		customerInfo.add(lbladdress);
		customerInfo.add(lblcity);
		customerInfo.add(lblprovince);
		customerInfo.add(lblpostalcode);
		customerInfo.add(lblemail);
		customerInfo.add(lblpaymentMethod);
		customerInfo.add(fnameTF);
		customerInfo.add(lnameTF);
		customerInfo.add(addressTF);
		customerInfo.add(cityTF);
		customerInfo.add(provinceTF);
		customerInfo.add(postalcodeTF);
		customerInfo.add(emailTF);
		customerInfo.add(masterCard);
		ButtonGroup group = new ButtonGroup();
		group.add(masterCard);
		group.add(visa);
		customerInfo.add(visa);
		customerInfo.add(bContinue);
		
		layout.putConstraint(SpringLayout.WEST, lblfname, 5, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblfname, 10, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, lbllname, 5, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lbllname, 60, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, lbladdress, 5, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lbladdress, 110, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, lblcity, 5, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblcity, 160, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, lblprovince, 5, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblprovince, 210, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, lblpostalcode, 5, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblpostalcode, 260, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, lblemail, 5, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblemail, 310, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, lblpaymentMethod, 5, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblpaymentMethod, 360, SpringLayout.NORTH,
				this.getContentPane());
		
		
		
		
		layout.putConstraint(SpringLayout.WEST, fnameTF, 150, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, fnameTF, 10, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, lnameTF, 150, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lnameTF, 60, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, addressTF, 150, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, addressTF, 110, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, cityTF, 150, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, cityTF, 160, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, provinceTF, 150, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, provinceTF, 210, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, postalcodeTF, 150, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, postalcodeTF, 260, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, emailTF, 150, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, emailTF, 310, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, masterCard, 150, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, masterCard, 360, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, visa, 260, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, visa, 360, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, bContinue, 260, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, bContinue, 385, SpringLayout.NORTH,
				this.getContentPane());
		add(customerInfo);
		
	}
	private void buildRightPanel()
	{
		customerInvoice =  new JPanel(layout);
		bExit = new JButton("Exit");
		customerInvoice.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1), ""));
		
		invoiceTextArea = new JTextArea();
		invoiceTextArea.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1), ""));
		invoiceTextArea.setPreferredSize(new Dimension(350,340));
		invoiceTextArea.setLineWrap(true);
		invoiceTextArea.setWrapStyleWord(true);
		customerInvoice.add(invoiceTextArea);
		
		
		customerInvoice.add(bExit);
		layout.putConstraint(SpringLayout.WEST, invoiceTextArea, 20, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, invoiceTextArea, 20, SpringLayout.NORTH,
				this.getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, bExit, 250, SpringLayout.WEST,
				this.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, bExit, 370, SpringLayout.NORTH,
				this.getContentPane());
		
		add(customerInvoice);
	}
}
//End of class