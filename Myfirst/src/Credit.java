import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Credit extends JFrame {

	private JPanel contentPane;
	private JTextField lc9;
	private JLabel lc1,lc2,lc3,lc4,lc5,lc6,lc8;
	private JComboBox lc7;
	private JButton lc10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit frame = new Credit();
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
	public Credit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 705);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lc1 = new JLabel("Apply Now");
		lc1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lc1.setBounds(278, 29, 129, 23);
		contentPane.add(lc1);
		
		lc2 = new JLabel("Category");
		lc2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lc2.setBounds(166, 124, 85, 23);
		contentPane.add(lc2);
		
		lc3 = new JLabel("Credit Cards");
		lc3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lc3.setBounds(371, 124, 115, 23);
		contentPane.add(lc3);
		
		lc4 = new JLabel("Sub Category");
		lc4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lc4.setBounds(166, 173, 115, 23);
		contentPane.add(lc4);
		
		lc5 = new JLabel("Apply for Credit Cards");
		lc5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lc5.setBounds(371, 173, 191, 20);
		contentPane.add(lc5);
		
		lc6 = new JLabel("Select Account");
		lc6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lc6.setBounds(166, 216, 134, 23);
		contentPane.add(lc6);
		
		lc7 = new JComboBox();
		lc7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lc7.setModel(new DefaultComboBoxModel(new String[] {"Select", "Savings", "Current"}));
		lc7.setBounds(371, 216, 129, 24);
		contentPane.add(lc7);
		
		lc8 = new JLabel("Description");
		lc8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lc8.setBounds(166, 259, 115, 32);
		contentPane.add(lc8);
		
		lc9 = new JTextField();
		lc9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lc9.setBounds(371, 268, 185, 62);
		contentPane.add(lc9);
		lc9.setColumns(10);
		
		lc10 = new JButton("PROCEED");
		lc10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lc10.setBounds(266, 420, 160, 42);
		contentPane.add(lc10);
	}
}
