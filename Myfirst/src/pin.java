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

public class pin extends JFrame {

	private JPanel contentPane;
	private JTextField p3;
	private JTextField p5;
	private JLabel p1,p2,p4;
	private JButton p6,p7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pin frame = new pin();
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
	public pin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 983, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		p1 = new JLabel("Pin Change");
		p1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		p1.setBounds(389, 95, 135, 29);
		contentPane.add(p1);
		
		p2 = new JLabel("Enter Old Pin");
		p2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		p2.setBounds(283, 205, 151, 29);
		contentPane.add(p2);
		
		p4 = new JLabel("Enter New Pin");
		p4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		p4.setBounds(283, 264, 151, 26);
		contentPane.add(p4);
		
		p3 = new JTextField();
		p3.setBounds(525, 205, 157, 27);
		contentPane.add(p3);
		p3.setColumns(10);
		
		p5 = new JTextField();
		p5.setBounds(525, 268, 157, 26);
		contentPane.add(p5);
		p5.setColumns(10);
		
		p6 = new JButton("Change");
		p6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 try{
				 String value1=jTextField1.getText();
				 String value2=p5.getText();
				 String sql="update table_name set pin='"+value2+"' where Name='"+value1+"'";
				 pat=conn.prepareStatement(sql);
				 pat.execute();
				 JOptionPane.showMessageDialog(null, "Pin successfully changed");
				 }catch(Exception e){
				 JOptionPane.showMessageDialog(null, e);
				 }
				 */
			}
		});
		p6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		p6.setBounds(352, 373, 115, 29);
		contentPane.add(p6);
		
		p7 = new JButton("Clear");
		p7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 p3.setText("");
				 p5.setText("");
				 */
			}
		});
		p7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		p7.setBounds(513, 373, 115, 29);
		contentPane.add(p7);
	}

}
