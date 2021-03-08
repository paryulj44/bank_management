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

public class Cheque extends JFrame {

	private JPanel contentPane;
	private JTextField lch9;
	private JLabel lch1,lch2,lch3,lch4,lch5,lch6,lch8;
	private JComboBox lch7;
	private JButton lch10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cheque frame = new Cheque();
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
	public Cheque() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lch1 = new JLabel("Apply Now");
		lch1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lch1.setBounds(260, 40, 126, 29);
		contentPane.add(lch1);
		
		lch2 = new JLabel("Category");
		lch2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lch2.setBounds(142, 121, 100, 24);
		contentPane.add(lch2);
		
		lch3 = new JLabel("Cheque Book");
		lch3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lch3.setBounds(370, 121, 139, 24);
		contentPane.add(lch3);
		
		lch4 = new JLabel("Sub Category");
		lch4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lch4.setBounds(142, 162, 116, 24);
		contentPane.add(lch4);
		
		lch5 = new JLabel("Cheque book request");
		lch5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lch5.setBounds(370, 162, 171, 19);
		contentPane.add(lch5);
		
		lch6 = new JLabel("Select Account");
		lch6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lch6.setBounds(142, 203, 126, 24);
		contentPane.add(lch6);
		
		lch7 = new JComboBox();
		lch7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lch7.setModel(new DefaultComboBoxModel(new String[] {"Select", "Savings ", "Current"}));
		lch7.setBounds(370, 207, 159, 21);
		contentPane.add(lch7);
		
		lch8 = new JLabel("Description");
		lch8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lch8.setBounds(142, 250, 126, 19);
		contentPane.add(lch8);
		
		lch9 = new JTextField();
		lch9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lch9.setBounds(370, 252, 159, 58);
		contentPane.add(lch9);
		lch9.setColumns(10);
		
		lch10 = new JButton("PROCEED");
		lch10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lch10.setBounds(272, 378, 145, 29);
		contentPane.add(lch10);
	}
}
