package atm_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Signup2 extends JFrame implements ActionListener{
	
	JComboBox comboBox;
	JComboBox comboBox2;
	JComboBox comboBox3;
	JComboBox comboBox4;
	JComboBox comboBox5;
	JTextField textPan;
	JTextField textAadhar;
	JRadioButton r1;
	JRadioButton r2;
	JRadioButton e1;
	JRadioButton e2;
	JButton next;

	String formno;

	public Signup2(String formno) {
		super("Application Form");
		
		this.formno = formno;
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		Image i2 =i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(100,  5, 100, 100);
		add(image);
				

		JLabel l1 = new JLabel ("Page 2: ");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(300, 30, 600, 40);
		add(l1);
		
		JLabel l2= new JLabel("Additional Details ");
		l2.setFont(new Font("Raleway",Font.BOLD,22));
		l2.setBounds(300, 60, 600, 40);
		add(l2);
		
		JLabel l3 = new JLabel("Religion: ");
		l3.setFont(new Font("Raleway",Font.BOLD,18));
		l3.setBounds(100,130,100,30);
		add(l3);
		
		String religion[] = {"Hindu","Muslim","Sikh","Christinity","Other"};
		comboBox = new JComboBox(religion);
		comboBox.setBackground(new Color(252,208,76));
		comboBox.setFont(new Font("Raleway",Font.BOLD,14));
		comboBox.setBounds(350, 120, 320, 30);
		add(comboBox);	
		
		JLabel l4 = new JLabel("Category: ");
		l4.setFont(new Font("Raleway",Font.BOLD,18));
		l4.setBounds(100,170,100,30);
		add(l4);
		
		String category[] = {"General","OBC","SC","ST","Other"};
		comboBox2 = new JComboBox (category);
		comboBox2.setBackground(new Color(252,208,76));
		comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
		comboBox2.setBounds(350, 170, 320, 30);
		add(comboBox2);
		
		
		JLabel l5 = new JLabel("Income: ");
		l5.setFont(new Font("Raleway",Font.BOLD,18));
		l5.setBounds(100,220,100,30);
		add(l5);
		
		String income[] = {"null","1,<150000","<250000","500000","Upto 1000000","Above 1000000"};     
		comboBox3 = new JComboBox (income);
		comboBox3.setBackground(new Color(252,208,76));
		comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
		comboBox3.setBounds(350, 220, 320, 30);
		add(comboBox3);
		
		JLabel l6 = new JLabel("Educational: ");
		l6.setFont(new Font("Raleway",Font.BOLD,18));
		l6.setBounds(100,270,150,30);
		add(l6);
		
		String educational[] = {"Non-Graduate","Under-Graduate","Graduate","Diploma","Post Graduation","Professional","Other"};     
		comboBox4 = new JComboBox (educational);
		comboBox4.setBackground(new Color(252,208,76));
		comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
		comboBox4.setBounds(350, 270, 320, 30);
		add(comboBox4);
		
		JLabel l7 = new JLabel("Occupation: ");
		l7.setFont(new Font("Raleway",Font.BOLD,18));
		l7.setBounds(100,320,150,30);
		add(l7);
		
		String occupation[] = {"Slaried","Self-Employed","Business","Student","Retired ","Other"};     
		comboBox5 = new JComboBox (occupation);
		comboBox5.setBackground(new Color(252,208,76));
		comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
		comboBox5.setBounds(350, 320, 320, 30);
		add(comboBox5);
		
		JLabel l8 = new JLabel("Pan Number: ");
		l8.setFont(new Font("Raleway",Font.BOLD,18));
		l8.setBounds(100,370,150,30);
		add(l8);
		
		textPan = new JTextField();
		textPan.setFont(new Font("Raleway",Font.BOLD,18));
		textPan.setBounds(350,370,320,30);
		add(textPan);
		
		JLabel l9 = new JLabel("Aadhar Number: ");
		l9.setFont(new Font("Raleway",Font.BOLD,18));
		l9.setBounds(100,420,150,30);
		add(l9);
		
		textAadhar = new JTextField();
		textAadhar.setFont(new Font("Raleway",Font.BOLD,18));
		textAadhar.setBounds(350,420,320,30);
		add(textAadhar);
		
		JLabel l10 = new JLabel("Senior Citizen: ");
		l10.setFont(new Font("Raleway",Font.BOLD,18));
		l10.setBounds(100,480,150,30);
		add(l10);
		
		r1 = new JRadioButton("Yes");
		r1.setFont(new Font("Raleway",Font.BOLD,16));
		r1.setBackground(new Color(252,208,76));
		r1.setBounds(350,480,100,30);
		add (r1);
		
		r2 = new JRadioButton("No");
		r2.setFont(new Font("Raleway",Font.BOLD,16));
		r2.setBackground(new Color(252,208,76));
		r2.setBounds(450,480,100,30);
		add(r2);
		
		ButtonGroup buttonGroup =new ButtonGroup();
		buttonGroup.add(r1);
		buttonGroup.add(r2);
		
		
		JLabel l11 = new JLabel("Existing Account: ");
		l11.setFont(new Font("Raleway",Font.BOLD,18));
		l11.setBounds(100,520,200,30);
		add(l11);
		
		e1 = new JRadioButton("Yes");
		e1.setFont(new Font("Raleway",Font.BOLD,16));
		e1.setBackground(new Color(252,208,76));
		e1.setBounds(350,520,100,30);
		add (e1);
		
		e2 = new JRadioButton("No");
		e2.setFont(new Font("Raleway",Font.BOLD,16));
		e2.setBackground(new Color(252,208,76));
		e2.setBounds(450,520,100,30);
		add(e2);
		
		ButtonGroup buttonGroup1 =new ButtonGroup();
		buttonGroup1.add(e1);
		buttonGroup1.add(e2);
		
		
		JLabel l12 = new JLabel("Form No: ");
		l12.setFont(new Font("Raleway",Font.BOLD,18));
		l12.setBounds(700,10,100,30);
		add(l12); 
		
		JLabel l13 = new JLabel(formno);
		l13.setFont(new Font("Raleway",Font.BOLD,14));
		l13.setBounds(780,10,100,30);
		add(l13);
		
		next = new JButton("Next");
		next.setFont(new Font("Raleway",Font.BOLD,16));
		next.setBackground(Color.white);
		next.setForeground(Color.black);
		next.setBounds(570, 630, 100, 30);
		next.addActionListener(this);
		add (next);

		setLayout(null);
		setSize(850,750);
		setLocation(450, 80);
		getContentPane().setBackground(new Color(252,208,76));
		setVisible(true);

		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String rel = (String) comboBox.getSelectedItem();
		String cate =(String) comboBox2.getSelectedItem();
		String inc =(String) comboBox3.getSelectedItem();
		String edu = (String) comboBox4.getSelectedItem();
		String occ= (String) comboBox5.getSelectedItem();
		
		String pan = textPan.getText();
		String aadhar = textAadhar.getText();
		
		String scitizen = null;
		 if (r1.isSelected())
		{
			scitizen = "Yes";
		} else if (r2.isSelected())
		{
			scitizen = "No";
		}
		 
		String eAccount = null;
		if (r1.isSelected())
		{
			eAccount= "Yes";
		}
		else if (r2.isSelected())
		{
			eAccount= "No";
		}
		
		try {
		
		if (textPan.getText().equals("") || textAadhar.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"Kindly fill all the fields");
		}
		else {
			Connect c1= new Connect();
			String q = "insert into Signup_2 values ('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
			c1.statement.executeUpdate(q);
			new Signup3(formno);
			setVisible(false);
		}
		
		
		}
		catch (Exception E)
		{
			E.printStackTrace();
		}
		

		
	}
	
	public static void main(String[] args)
	{
		new Signup2("");
	}

}
