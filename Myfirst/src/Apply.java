import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;

public class Apply extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apply frame = new Apply();
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
	public Apply() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 725);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(66, 121, 552, 117);
		contentPane.add(textArea);
		
		table = new JTable();
		table.setBounds(128, 472, 96, -31);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Apply Now");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel.setBounds(292, 28, 136, 32);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrCreditCardApply = new JTextArea();
		txtrCreditCardApply.setText("Credit Card\r\nApply for my bank of India Credits Cards and avail various benefits\r\nand offers.");
		txtrCreditCardApply.setBounds(66, 291, 552, 117);
		contentPane.add(txtrCreditCardApply);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(66, 472, 552, 117);
		contentPane.add(textArea_2);
		
		JLabel lblNewLabel_1 = new JLabel("Credit Card");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1.setBounds(87, 140, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Credit Card");
		lblNewLabel_2.setBounds(97, 163, 45, 13);
		contentPane.add(lblNewLabel_2);
	}
}
