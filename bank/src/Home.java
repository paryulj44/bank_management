import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;

public class Home {

	private JFrame frame;
	private JTextField Name;
	private JTextField Age;
	private JTextField Salary;
	private JTextField Nationality;
	private JTextField Other;
	private JTextField Score;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 1076, 62);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_5 = new JLabel("                   Home Loan Eligibility:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 45));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(94)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 928, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(19, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(205, 492, 491, 62);
		panel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel_1_1);
		
		JButton btnNewButton = new JButton("Check Eligibility");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel_1_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int age=Integer.parseInt(Age.getText());
			       int score=Integer.parseInt(Score.getText());
			       double salary=Double.parseDouble(Salary.getText());
			       double other=Double.parseDouble(Other.getText());
			       double total=salary+other;
			       JComboBox<String> Experience = null;
				Integer experience =(Integer)Experience.getSelectedItem();
			       JComboBox<String> Occupation = null;
				String occupation=(String) Occupation.getSelectedItem();
			       String nationality=Nationality.getText();
			       
			       if(occupation=="Salaried" && experience>=3) {
			    	   if(age>23 && age<62) {
			    	     if(nationality=="Indian") {
			    				 if(score>750){
			    					 if(total>=25000 && total<50000)
			    					   JOptionPane.showMessageDialog(null, "Congrats,You are Eligible For Home Loan Upto 18.64 Lakhs");
			    					 else if(total>=50000 && total<75000)
			    					   JOptionPane.showMessageDialog(null, "Congrats,You are Eligible For Home Loan Upto 37.28 Lakhs");
			    					   else 
			    						   JOptionPane.showMessageDialog(null, "Congrats,You are Eligible For Home Loan Upto 55.93 Lakhs");
			    					
			    				   }
			    				   
			    			   }
			    		   }
			    		   
			    	   }
			       else if(occupation=="Self-Employed" && experience>=5) {
				    	   if(age>25 && age<70) {
				    	     if(nationality=="Indian") {
				    				 if(score>750){
				    					 if(total>=25000 && total<50000)
				    					   JOptionPane.showMessageDialog(null, "Congrats,You are Eligible For Home Loan Upto 18.64 Lakhs");
				    					 else if(total>=50000 && total<75000)
				    					   JOptionPane.showMessageDialog(null, "Congrats,You are Eligible For Home Loan Upto 37.28 Lakhs");
				    					   else 
				    						   JOptionPane.showMessageDialog(null, "Congrats,You are Eligible For Home Loan Upto 55.93 Lakhs");
				    					
				    				   }
				    				   
				    			   }
				    		   }
				    		   
				    	   }
			       else {
			    	   JOptionPane.showMessageDialog(null, "Sorry,You are not eligible for Home Loan");
			    	   
			       }
			    	   
			      }});
	      
		
		JLabel lblNewLabel = new JLabel("Enter Your Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(123, 82, 404, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Your Age:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(123, 137, 367, 62);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Are you Self-Employed or Salaried:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(123, 244, 367, 51);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("Monthly Salary is Rs:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(123, 346, 367, 59);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CIBIL Score:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(123, 197, 367, 46);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_9 = new JLabel("Work Experience/Business Continuity:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_9.setBounds(123, 305, 367, 30);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Other Source is Rs:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_10.setBounds(123, 399, 210, 29);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Nationality:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_11.setBounds(123, 440, 155, 32);
		frame.getContentPane().add(lblNewLabel_11);
		
		
		
		Name = new JTextField();
		Name.setFont(new Font("Tahoma", Font.BOLD, 19));
		Name.setBounds(635, 92, 178, 32);
		frame.getContentPane().add(Name);
	    Name.setColumns(10);
		
		Age = new JTextField();
		Age.setFont(new Font("Tahoma", Font.BOLD, 19));
		Age.setBounds(635, 151, 178, 31);
		frame.getContentPane().add(Age);
		Age.setColumns(10);
		
		Score = new JTextField();
		Score.setFont(new Font("Tahoma", Font.BOLD, 19));
		Score.setBounds(635, 203, 178, 31);
		frame.getContentPane().add(Score);
		Score.setColumns(10);
		
		JComboBox<String> Experience = new JComboBox<>();
		Experience.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5", "Greater than 6"}));
		Experience.setBounds(635, 307, 178, 30);
		frame.getContentPane().add(Experience);
		
		JComboBox<String> Occupation = new JComboBox<>();
		Occupation.setModel(new DefaultComboBoxModel<String>(new String[] {"Salaried", "Self-Employed"}));
		Occupation.setMaximumRowCount(5);
		Occupation.setBounds(635, 256, 178, 30);
		frame.getContentPane().add(Occupation);
		
		Salary = new JTextField();
		Salary.setFont(new Font("Tahoma", Font.BOLD, 19));
		Salary.setBounds(635, 358, 178, 31);
		frame.getContentPane().add(Salary);
		Salary.setColumns(10);
		
		Other = new JTextField();
		Other.setFont(new Font("Tahoma", Font.BOLD, 19));
		Other.setBounds(635, 399, 178, 31);
		frame.getContentPane().add(Other);
		Other.setColumns(10);
		
		Nationality = new JTextField();
		Nationality.setFont(new Font("Tahoma", Font.BOLD, 19));
		Nationality.setBounds(635, 440, 178, 31);
		frame.getContentPane().add(Nationality);
		Nationality.setColumns(10);
		
				
	}
	}


