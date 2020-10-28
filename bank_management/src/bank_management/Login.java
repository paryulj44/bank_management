package bank_management;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionEvent;

public class Login extends JFrame  {
	JLabel l1,l2;
	private JPanel l3;
	private JLabel l4;
	JButton b1,b2,b3;
	private JTextField tf1;
	private JPasswordField pf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 437, 495);
		l3 = new JPanel();
		l3.setBackground(Color.WHITE);
		l3.setMaximumSize(new Dimension(50000, 50000));
		l3.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(l3);
		l3.setLayout(null);
		
		l1 = new JLabel("Welcome to ATM");
		l1.setFont(new Font("Osward", Font.BOLD, 38));
		l1.setMaximumSize(new Dimension(45, 45));
		l1.setBounds(31, 28, 350, 35);
		l3.add(l1);
		
		l2 = new JLabel("Card No");
		l2.setFont(new Font("Raleway", Font.BOLD, 28));
		l2.setBounds(31, 98, 141, 24);
		l3.add(l2);
		
		l4 = new JLabel("PIN");
		l4.setFont(new Font("Raleway", Font.BOLD, 28));
		l4.setBounds(31, 180, 141, 24);
		l3.add(l4);
		
		b1 = new JButton("Sign In");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				connector c1=new connector();
				String a=tf1.getText();
				String b=pf1.getText();
				String query="select * from login where cardno='"+a+"'and pin='"+b+"' ";
				ResultSet rs=c1.s.executeQuery(query); 
				if(rs.next()) {
					new Transaction().setVisible(true);
					setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Card Number or Password");
				}
				}catch(Exception ex) {
					ex.printStackTrace();
                    System.out.println("error: "+ex);
				}
			}
		});
		
		b1.setBackground(Color.BLACK);
	    b1.setForeground(Color.WHITE);
		b1.setBounds(31, 265, 126, 46);
		l3.add(b1);
		
		b2 = new JButton("Clear");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				pf1.setText("");
				
			}
		});
		b2.setBackground(Color.BLACK);
	    b2.setForeground(Color.WHITE);
		b2.setBounds(210, 265, 126, 46);
		l3.add(b2);
		
		b3 = new JButton("Sign Up");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Sign_up().setVisible(true);
                setVisible(false);
			}
		});
		b3.setBackground(Color.BLACK);
	    b3.setForeground(Color.WHITE);
		b3.setBounds(31, 344, 305, 46);
		l3.add(b3);
		
		tf1 = new JTextField();
		tf1.setBounds(182, 98, 229, 24);
		l3.add(tf1);
		tf1.setColumns(10);
		
		pf1 = new JPasswordField();
		pf1.setBounds(182, 180, 229, 24);
		l3.add(pf1);
	}
}
