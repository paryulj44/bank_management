package bank_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Sign_up3 extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sign_up3 frame = new Sign_up3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sign_up3() {
		setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		l11 = new JLabel("Form No");
		l11.setFont(new Font("Tahoma", Font.BOLD, 11));
		l11.setBounds(346, 11, 64, 20);
		contentPane.add(l11);
		
		t1 = new JTextField();
		t1.setBounds(420, 11, 86, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		l1 = new JLabel("Page 3- Account Details");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l1.setBounds(163, 32, 296, 31);
		contentPane.add(l1);
		
		l2 = new JLabel("Account Type");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		l2.setBounds(27, 72, 161, 31);
		contentPane.add(l2);
		
		r1 = new JRadioButton("Savings Account");
		r1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		r1.setBounds(27, 114, 146, 31);
		contentPane.add(r1);
		
		r2 = new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		r2.setBounds(264, 114, 146, 31);
		contentPane.add(r2);
		
		r3 = new JRadioButton("Current Account");
		r3.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		r3.setBounds(27, 148, 146, 31);
		contentPane.add(r3);
		
		r4 = new JRadioButton("Recurring Deposit Account");
		r4.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		r4.setBounds(268, 148, 142, 31);
		contentPane.add(r4);
		
		l3 = new JLabel("Card Number");
		l3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		l3.setBounds(27, 197, 161, 31);
		contentPane.add(l3);
		
		l4 = new JLabel("XXXX-XXXX-XXXX-4184");
		l4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		l4.setBounds(198, 197, 212, 31);
		contentPane.add(l4);
		
		l5 = new JLabel("(Your 16-digit Card number)");
		l5.setFont(new Font("Times New Roman", Font.PLAIN, 9));
		l5.setBounds(27, 225, 161, 20);
		contentPane.add(l5);
		
		l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
		l6.setFont(new Font("Times New Roman", Font.PLAIN, 9));
		l6.setBounds(198, 227, 212, 14);
		contentPane.add(l6);
		
		l7 = new JLabel("PIN");
		l7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		l7.setBounds(27, 271, 146, 31);
		contentPane.add(l7);
		
		l8 = new JLabel("XXXX");
		l8.setFont(new Font("Times New Roman", Font.BOLD, 11));
		l8.setBounds(198, 271, 97, 31);
		contentPane.add(l8);
		
		l9 = new JLabel("(4-digit password)");
		l9.setFont(new Font("Times New Roman", Font.PLAIN, 9));
		l9.setBounds(27, 298, 91, 20);
		contentPane.add(l9);
		
		l10 = new JLabel("Services Required:");
		l10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		l10.setBounds(27, 333, 146, 31);
		contentPane.add(l10);
		
		c1 = new JCheckBox("ATM CARD");
		c1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		c1.setBounds(27, 372, 97, 23);
		contentPane.add(c1);
		
		c2 = new JCheckBox("Internet Banking");
		c2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		c2.setBounds(198, 372, 146, 23);
		contentPane.add(c2);
		
		c3 = new JCheckBox("Mobile Banking");
		c3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		c3.setBounds(27, 409, 146, 23);
		contentPane.add(c3);
		
		c4 = new JCheckBox("EMAIL Alerts");
		c4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		c4.setBounds(198, 409, 161, 23);
		contentPane.add(c4);
		
		c5 = new JCheckBox("Cheque Book");
		c5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		c5.setBounds(27, 453, 146, 23);
		contentPane.add(c5);
		
		c6 = new JCheckBox("E-Statement");
		c6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		c6.setBounds(198, 453, 146, 23);
		contentPane.add(c6);
		
		c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.");
		c7.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		c7.setBounds(27, 490, 468, 31);
		contentPane.add(c7);
		
		b2 = new JButton("Cancel");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b2.setBounds(293, 549, 89, 31);
		contentPane.add(b2);
		
		b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String a = null;
			        if(r1.isSelected()){ 
			            a = "Saving Account";
			        }
			        else if(r2.isSelected()){ 
			            a = "Fixed Deposit Account";
			        }
			        else if(r3.isSelected()){ 
			            a = "Current Account";
			        }else if(r4.isSelected()){ 
			            a = "Recurring Deposit Account";
			        }
			        
			        Random ran = new Random();
			        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
			        long first8 = Math.abs(first7);
			        
			        long first3 = (ran.nextLong() % 9000L) + 1000L;
			        long first4 = Math.abs(first3);
			        
			        String b = "";
			        if(c1.isSelected()){ 
			            b = b+" ATM Card";
			        }
			        if(c2.isSelected()){ 
			            b = b+" Internet Banking";
			        }
			        if(c3.isSelected()){ 
			            b = b+" Mobile Banking";
			        }
			        if(c4.isSelected()){ 
			            b = b+" EMAIL Alerts";
			        }
			        if(c5.isSelected()){ 
			            b = b+" Cheque Book";
			        }
			        if(c6.isSelected()){ 
			            b = b+" E-Statement";
			        }
			        
			        String c = t1.getText();
			        
			        try {
			        	if(b.equals(""))
			        		JOptionPane.showMessageDialog(null, "Fill all the required fields");
			        	else {
			        		connector c1=new connector();
			        		String query1 = "insert into signup3 values('"+c+"','"+a+"','"+first8+"','"+first4+"','"+b+"')";  
		                    String query2 = "insert into login values('"+first8+"','"+first4+"')";
		                    c1.s.executeUpdate(query1);
		                    c1.s.executeUpdate(query2);
		                    JOptionPane.showMessageDialog(null, "Card Number: " + first8 + "\n Pin:"+ first4 + "\n Do remember the card number and pin");
		                    new Login().setVisible(true);
		                    setVisible(false);
			        	}
			        	
			        }catch(Exception ex) {
			        	ex.printStackTrace();
			        	
			        }
			}
		});
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b1.setBounds(121, 549, 89, 31);
		contentPane.add(b1);
	}
}
