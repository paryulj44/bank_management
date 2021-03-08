import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class block extends JFrame {

	private JPanel contentPane;
	private JLabel b2,b5,b1;
	private JRadioButton bb3,bb4;
	private JComboBox b6;
	private JButton bb7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					block frame = new block();
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
	public block() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		b2 = new JLabel("Do you want to block ?");
		b2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		b2.setBounds(285, 135, 373, 29);
		contentPane.add(b2);
		
		bb3 = new JRadioButton("YES");
		bb3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		bb3.setBounds(285, 202, 103, 21);
		contentPane.add(bb3);
		
		bb4 = new JRadioButton("NO");
		bb4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		bb4.setBounds(429, 202, 103, 21);
		contentPane.add(bb4);
		
		b5 = new JLabel("Reason to block ?");
		b5.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		b5.setBounds(285, 257, 231, 29);
		contentPane.add(b5);
		
		b6 = new JComboBox();
		b6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		b6.setModel(new DefaultComboBoxModel(new String[] {"card is lost", "Technical error ", "others"}));
		b6.setEditable(true);
		b6.setBounds(285, 305, 201, 29);
		contentPane.add(b6);
		
		bb7 = new JButton("Sumbit Request");
		bb7.setFont(new Font("Times New Roman", Font.BOLD, 22));
		bb7.setBounds(323, 374, 185, 29);
		contentPane.add(bb7);
		
		b1 = new JLabel("Block Debit Card");
		b1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		b1.setBounds(362, 63, 208, 29);
		contentPane.add(b1);
	}
}
