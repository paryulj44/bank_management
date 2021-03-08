package bank_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class Transaction extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaction frame = new Transaction();
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
	public Transaction() {
		setTitle("TRANSACTIONS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Please  Select From Transcation");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l1.setBounds(66, 21, 414, 27);
		contentPane.add(l1);
		
		JButton b1 = new JButton("Deposit");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b1.setBounds(45, 132, 150, 38);
		contentPane.add(b1);
		
		JButton b2 = new JButton("Cash-Withdraw");
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b2.setBackground(Color.BLACK);
		b2.setBounds(301, 132, 150, 38);
		contentPane.add(b2);
		
		JButton b3 = new JButton("Past Cash");
		b3.setForeground(Color.WHITE);
		b3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b3.setBackground(Color.BLACK);
		b3.setBounds(45, 218, 150, 38);
		contentPane.add(b3);
		
		JButton b4 = new JButton("Mini-Statement");
		b4.setForeground(Color.WHITE);
		b4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b4.setBackground(Color.BLACK);
		b4.setBounds(301, 218, 150, 38);
		contentPane.add(b4);
		
		JButton b5 = new JButton("Pin Change");
		b5.setForeground(Color.WHITE);
		b5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b5.setBackground(Color.BLACK);
		b5.setBounds(45, 304, 150, 38);
		contentPane.add(b5);
		
		JButton b6 = new JButton("Balance Enquiry");
		b6.setForeground(Color.WHITE);
		b6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b6.setBackground(Color.BLACK);
		b6.setBounds(301, 304, 150, 38);
		contentPane.add(b6);
		
		JButton b7 = new JButton("Next");
		b7.setForeground(Color.WHITE);
		b7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b7.setBackground(Color.BLACK);
		b7.setBounds(301, 393, 150, 38);
		contentPane.add(b7);
		
		JButton b8 = new JButton("Exit");
		b8.setForeground(Color.WHITE);
		b8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		b8.setBackground(Color.BLACK);
		b8.setBounds(45, 393, 150, 38);
		contentPane.add(b8);
	}
}
