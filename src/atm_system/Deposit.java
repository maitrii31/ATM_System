package atm_system;

import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Deposit extends JFrame implements ActionListener {
	
	String pin;
	JTextField textField;
	JButton b1;
	JButton b2;


	 Deposit(String pin) 
	 {		
		 this.pin=pin;
		 ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
		 Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
		 ImageIcon i3= new ImageIcon(i2);
		 JLabel l3 = new JLabel(i3);
		 l3.setBounds(0, 0, 1550, 830);
		 add(l3);
		 
		 JLabel label1 = new JLabel("ENTER DEPOSIT AMOUNT");
		 label1.setFont(new Font("System",Font.BOLD,16));
		 label1.setBounds(460, 180, 400, 35);
		 label1.setForeground(Color.white);
		 l3.add(label1);
		 
		 textField= new JTextField();
		 textField.setBackground(new Color(65,125,128));
		 textField.setForeground(Color.white);
		 textField.setBounds(460, 230, 320, 25);
		 textField.setFont(new Font ("Raleway",Font.BOLD,22));
		 l3.add(textField);
		 
		 b1 = new JButton("Deposit");
		 b1.setBounds(700, 362, 150, 35);
		 b1.setBackground(new Color(65,125,128));
		 b1.setForeground(Color.white);
		 b1.addActionListener(this); 
		 l3.add(b1);
		 
		 b2 = new JButton("Cancel");
		 b2.setBounds(700, 406, 150, 35);
		 b2.setBackground(new Color(65,125,128));
		 b2.setForeground(Color.white);
		 b2.addActionListener(this); 
		 l3.add(b2);
		 
		
		 setLayout(null);
		 setSize(1550,1080);
		 setLocation(0, 0);
		 setVisible(true);
		
	 }
	 
	 @Override
	public void actionPerformed(ActionEvent e) {
		 
		try { 
		String amount= textField.getText();
	//	Date date = new Date(); //
	//	LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();

		if (e.getSource()==b1)
		  {
			if(textField.getText().equals(""))
			{
				JOptionPane.showInternalMessageDialog(null,"Please enter the Amount you want to Deposit");
			}
			else {
				Connect c = new Connect();
				c.statement.executeUpdate("insert into bank values('"+pin+"','"+dateTime+"','Deposit','"+amount+"')");
				JOptionPane.showMessageDialog(null,"Rs."+amount+" Deposited Successfully");
				setVisible(false);
				new main_class(pin);
			}
			
		  }else if (e.getSource()==b2)
		  {
			  setVisible(false);
			  new main_class(pin);
		  }
		}
		catch(Exception E)
		{
			E.printStackTrace();
		}
 
	}
		

	public static void main(String[] args)
	{
		new Deposit("");
	}

}