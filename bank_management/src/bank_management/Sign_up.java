package bank_management;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Sign_up extends JFrame {

	private JPanel contentPane;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JRadioButton r1;
	private JRadioButton r2;
	private JRadioButton r3;
	private JRadioButton r4;
	private JRadioButton r5;
	JComboBox c1,c2,c3;
	private JButton b1;
	
	Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sign_up frame = new Sign_up();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sign_up() {
		setTitle("NEW ACCOUNT APPLICATION FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		l1 = new JLabel("APPLICATION FORM NO:"+first);
		l1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		l1.setBounds(26, 26, 576, 31);
		contentPane.add(l1);
		
		l2 = new JLabel("Page 1: Personal Details");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l2.setBounds(26, 79, 323, 31);
		contentPane.add(l2);
		
		l3 = new JLabel("Name");
		l3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l3.setBounds(26, 121, 123, 31);
		contentPane.add(l3);
		
		l4 = new JLabel("Father's Name");
		l4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l4.setBounds(26, 163, 137, 31);
		contentPane.add(l4);
		
		l5 = new JLabel("Date Of Birth");
		l5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l5.setBounds(26, 205, 137, 31);
		contentPane.add(l5);
		
		l6 = new JLabel("Gender");
		l6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l6.setBounds(26, 247, 123, 31);
		contentPane.add(l6);
		
		l7 = new JLabel("Email Id");
		l7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l7.setBounds(26, 289, 123, 31);
		contentPane.add(l7);
		
		l8 = new JLabel("Marital Status");
		l8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l8.setBounds(26, 331, 137, 31);
		contentPane.add(l8);
		
		l9 = new JLabel("Address");
		l9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l9.setBounds(26, 372, 123, 31);
		contentPane.add(l9);
		
		l10 = new JLabel("City");
		l10.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l10.setBounds(26, 414, 123, 31);
		contentPane.add(l10);
		
		l11 = new JLabel("Pin Code");
		l11.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l11.setBounds(26, 456, 123, 31);
		contentPane.add(l11);
		
		l12 = new JLabel("State");
		l12.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l12.setBounds(26, 498, 123, 31);
		contentPane.add(l12);
		
		l13 = new JLabel("Date");
		l13.setFont(new Font("Raleway", Font.BOLD, 14));
		l13.setBounds(173, 205, 46, 31);
		contentPane.add(l13);
		
		l14 = new JLabel("Month");
		l14.setFont(new Font("Raleway", Font.BOLD, 14));
		l14.setBounds(310, 211, 46, 23);
		contentPane.add(l14);
		
		l15 = new JLabel("Year");
		l15.setFont(new Font("Raleway", Font.BOLD, 14));
		l15.setBounds(467, 209, 46, 23);
		contentPane.add(l15);
		
		t1 = new JTextField();
		t1.setBounds(173, 121, 340, 31);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(173, 160, 340, 36);
		contentPane.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(173, 289, 340, 31);
		contentPane.add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(173, 372, 340, 31);
		contentPane.add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setBounds(173, 414, 340, 31);
		contentPane.add(t5);
		t5.setColumns(10);
		
		t6 = new JTextField();
		t6.setText("");
		t6.setBounds(173, 456, 340, 31);
		contentPane.add(t6);
		t6.setColumns(10);
		
		t7 = new JTextField();
		t7.setText("");
		t7.setBounds(173, 498, 340, 31);
		contentPane.add(t7);
		t7.setColumns(10);
		
		r1 = new JRadioButton("Male");
		r1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);

		r1.setBounds(173, 247, 67, 31);
		contentPane.add(r1);
		
		r2 = new JRadioButton("Female");
		r2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);

		r2.setBounds(271, 247, 109, 31);
		contentPane.add(r2);
		
		r3 = new JRadioButton("Married");
		r3.setFont(new Font("Times New Roman", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);

		r3.setBounds(173, 331, 85, 31);
		contentPane.add(r3);
		
		r4 = new JRadioButton("Unmarried");
		r4.setFont(new Font("Times New Roman", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);

		r4.setBounds(271, 331, 109, 31);
		contentPane.add(r4);
		
		r5 = new JRadioButton("Other");
		r5.setFont(new Font("Times New Roman", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);

		r5.setBounds(396, 333, 85, 31);
		contentPane.add(r5);
		
		c1 = new JComboBox();
		c1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		c1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		c1.setBounds(212, 205, 64, 31);
		contentPane.add(c1);
		
		c2 = new JComboBox();
		c2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		c2.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		c2.setBounds(361, 205, 84, 31);
		contentPane.add(c2);
		
		c3 = new JComboBox();
		c3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		c3.setModel(new DefaultComboBoxModel(new String[] {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002"}));
		c3.setBounds(507, 205, 63, 31);
		contentPane.add(c3);
		
		b1 = new JButton("Next");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=t1.getText();
				String b=t2.getText();
				
				String ac=(String)c1.getSelectedItem();
				String bc=(String)c2.getSelectedItem();
				String cc=(String)c3.getSelectedItem();
				
				String d=null;
				if(r1.isSelected())
					d="Male";
				else if(r2.isSelected())
					d="Female";
				
				String e2=t3.getText();
				
				String f=null;
				if(r3.isSelected())
					f="Married";
				else if(r4.isSelected())
					f="Unmarried";
				else if(r5.isSelected())
					f="Other";
				
				String g = t4.getText();
		        String h = t5.getText();
		        String i = t6.getText();
		        String j = t7.getText();
		        
		        try {
		        	if(t6.getText().equals("")) {
		        		JOptionPane.showMessageDialog(null,"Fill all the required feilds");
		        	}
		        	else {
		        		connector c1=new connector();
		        		String query="insert into signup values('"+a+"','"+b+"','"+ac+"','"+bc+"','"+cc+"','"+d+"','"+e2+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+first+"')";
		        		c1.s.executeUpdate(query);
		        		new Sign_up2().setVisible(true);
		                setVisible(false);
		        	}
		        	
		        }
		        catch(Exception ex) {
		        	ex.printStackTrace();
		        }
				
			}
		});
		b1.setFont(new Font("Raleway", Font.BOLD, 14));
		b1.setBackground(Color.BLACK);
		    b1.setForeground(Color.WHITE);
		b1.setBounds(467, 554, 103, 36);
		contentPane.add(b1);
	}
}
