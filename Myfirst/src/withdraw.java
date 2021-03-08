import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class withdraw extends JFrame {

	private JPanel contentPane;
	private JTextField w2;
	private JTextField w5;
	private JTextField w7;
	private JTextField w9;
	private JTextField w11;
	private JTextField w13;
	private JLabel w,w1,w4,w6,w8,w10,w12;
	private JButton wb3,wb14,wb15; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					withdraw frame = new withdraw();
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
	public withdraw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 593);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		w = new JLabel("Withdraw");
		w.setFont(new Font("Times New Roman", Font.BOLD, 24));
		w.setBounds(349, 24, 149, 40);
		contentPane.add(w);
		
		w1 = new JLabel("User");
		w1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		w1.setBounds(184, 112, 73, 26);
		contentPane.add(w1);
		
		w4 = new JLabel("Name");
		w4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		w4.setBounds(184, 170, 73, 26);
		contentPane.add(w4);
		
		w6 = new JLabel("Account No.");
		w6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		w6.setBounds(184, 219, 137, 32);
		contentPane.add(w6);
		
		w8 = new JLabel("Available Balance");
		w8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		w8.setBounds(184, 274, 177, 26);
		contentPane.add(w8);
		
		w10 = new JLabel("Amount");
		w10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		w10.setBounds(184, 323, 103, 26);
		contentPane.add(w10);
		
		w12 = new JLabel("Total");
		w12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		w12.setBounds(184, 365, 73, 26);
		contentPane.add(w12);
		
		w2 = new JTextField();
		w2.setBounds(440, 116, 187, 26);
		contentPane.add(w2);
		w2.setColumns(10);
		
		w5 = new JTextField();
		w5.setEditable(false);
		w5.setBounds(440, 170, 187, 26);
		contentPane.add(w5);
		w5.setColumns(10);
		
		w7 = new JTextField();
		w7.setEditable(false);
		w7.setBounds(440, 219, 187, 29);
		contentPane.add(w7);
		w7.setColumns(10);
		
		w9 = new JTextField();
		w9.setEditable(false);
		w9.setBounds(440, 274, 187, 26);
		contentPane.add(w9);
		w9.setColumns(10);
		
		w11 = new JTextField();
		w11.setBounds(440, 323, 187, 26);
		contentPane.add(w11);
		w11.setColumns(10);
		
		w13 = new JTextField();
		w13.setBounds(440, 365, 187, 26);
		contentPane.add(w13);
		w13.setColumns(10);
		
		wb3 = new JButton("search");
		wb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 String sql="select * from table_name where Name=?";
				 try{
				 pat = conn.prepareStatement(sql);
				 pat.setString(1,w2.getText());
				 rs = pat.executeQuery();
				 if(rs.next()){
				 	String add1=rs.getString("Name");
				 	w5.setText(add1);
				 	String add2=rs.getString("Acc");
				 	w7.setText(add2);
				 	String add3=rs.getString("Balance");
				 	w9.setText(add3);
				 	rs.close();
				 	pat.close();
				 }
				 else{
				 JOptionPane.showMessageDialog(null, "Enter correct name");
				 }
				 }catch(Exception e){
				 JOptionPane.shoeMessageDialog(null,e);
				 }
				
				 */
			}
		});
		wb3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		wb3.setBounds(668, 112, 108, 27);
		contentPane.add(wb3);
		
		wb14 = new JButton("show");
		wb14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 try{
				 String a1=t9.getText();
				 String a2=t11.getText();
				 int sum=Integer.parseInt(a1)-Integer.parseInt(a2);
				 String sum1=String.valueOf(sum);
				 t13.setText(sum1);
				 
				 }catch(Exception e){
				 JOptionPane.showMessageDialog(null, e);
				 }
				 */
			}
		});
		wb14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		wb14.setBounds(668, 365, 108, 27);
		contentPane.add(wb14);
		
		wb15 = new JButton("withdraw");
		wb15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*try {
					String a1=w2.getText();
					String a2=w13.getText();
					String sql="update table_name set Balance='"+a2+"' where Name='"+a1+"'";
					pat=conn.prepareStatement(sql);
					pat.execute();
					JOptionPane.showMessageDialog(null, "withdraw successful");
				}catch(Exception e){
				JOptionPane.showMessageDialog(null, e);
				}
				*/
			}
		});
		wb15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		wb15.setBounds(349, 442, 149, 32);
		contentPane.add(wb15);
	}

}
