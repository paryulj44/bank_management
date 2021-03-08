import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Debit extends JFrame {

	private JPanel contentPane;
	private JButton l11;
	private JLabel l1;
	private JTextField tf;
	private JLabel l2;
	private JLabel l3,l4,l5,l6,l8,l10;
	private JComboBox l7,l9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Debit frame = new Debit();
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
	
	public Debit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 726);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    l1 = new JLabel("Category");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l1.setBounds(208, 103, 95, 29);
		contentPane.add(l1);
		
	    l2 = new JLabel("Apply Now");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		l2.setBounds(310, 20, 115, 26);
		contentPane.add(l2);
		
		l3 = new JLabel("Debit Card");
		l3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		l3.setBounds(414, 106, 160, 23);
		contentPane.add(l3);
		
	    l4 = new JLabel("Sub Category");
		l4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l4.setBounds(208, 154, 115, 23);
		contentPane.add(l4);
		
		l5 = new JLabel("Issue New Debit Card");
		l5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		l5.setBounds(411, 161, 186, 16);
		contentPane.add(l5);
		
		l6 = new JLabel("Sub Child Category");
		l6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l6.setBounds(208, 198, 167, 29);
		contentPane.add(l6);
		
		l7 = new JComboBox();
		l7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		l7.setModel(new DefaultComboBoxModel(new String[] {"Master", "Rupay", "VISA"}));
		l7.setBounds(411, 206, 172, 21);
		contentPane.add(l7);
		
		l8 = new JLabel("Select Account");
		l8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l8.setBounds(208, 247, 134, 23);
		contentPane.add(l8);
		
		l9 = new JComboBox();
		l9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		l9.setModel(new DefaultComboBoxModel(new String[] {"Select", "Savings", "Current"}));
		l9.setBounds(411, 250, 172, 21);
		contentPane.add(l9);
		
		l10 = new JLabel("Description");
		l10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l10.setBounds(208, 289, 122, 13);
		contentPane.add(l10);
		
		tf = new JTextField();
		tf.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tf.setBounds(411, 288, 172, 52);
		contentPane.add(tf);
		tf.setColumns(10);
		
		l11 = new JButton("PROCEED");
		l11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		l11.setBackground(Color.BLACK);
		l11.setForeground(Color.WHITE);
		l11.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l11.setBounds(297, 438, 160, 38);
		contentPane.add(l11);
	}
	
}
