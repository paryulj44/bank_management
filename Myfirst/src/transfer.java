import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;

public class transfer extends JFrame {

	private JPanel t14;
	private JTextField t3;
	private JTextField t6;
	private JTextField t8;
	private JTextField t10;
	private JTextField t11;
	private JTextField t15;
	private JTextField t16;
	private JTextField t19;
	private JLabel t,t1,t2,t5,t7,t9,t13;
	private JButton t4,t12,t17,t18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					transfer frame = new transfer();
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
	public transfer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 694);
		t14 = new JPanel();
		t14.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(t14);
		t14.setLayout(null);
		
		t2 = new JLabel("Name");
		t2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		t2.setBounds(225, 134, 164, 21);
		t14.add(t2);
		
		t5 = new JLabel("Account No");
		t5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		t5.setBounds(225, 188, 164, 21);
		t14.add(t5);
		
		t7 = new JLabel("Available Balance");
		t7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		t7.setBounds(225, 246, 164, 21);
		t14.add(t7);
		
		t9 = new JLabel("Transfer Amount");
		t9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		t9.setBounds(225, 300, 164, 26);
		t14.add(t9);
		
		t13 = new JLabel("Credit Account");
		t13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		t13.setBounds(225, 358, 164, 21);
		t14.add(t13);
		
		t3 = new JTextField();
		t3.setEditable(false);
		t3.setBounds(513, 134, 193, 23);
		t14.add(t3);
		t3.setColumns(10);
		
		t6 = new JTextField();
		t6.setEditable(false);
		t6.setBounds(513, 188, 193, 23);
		t14.add(t6);
		t6.setColumns(10);
		
		t8 = new JTextField();
		t8.setEditable(false);
		t8.setBounds(513, 246, 193, 23);
		t14.add(t8);
		t8.setColumns(10);
		
		t10 = new JTextField();
		t10.setBounds(513, 300, 101, 26);
		t14.add(t10);
		t10.setColumns(10);
		
		t4 = new JButton("Search");
		t4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 String sql="select * from table_name where Name=?";
				 try{
				 pat = conn.prepareStatement(sql);
				 pat.setString(1,t19.getText());
				 rs = pat.executeQuery();
				 if(rs.next()){
				 	String add1=rs.getString("Name");
				 	t3.setText(add1);
				 	String add2=rs.getString("Acc");
				 	t6.setText(add2);
				 	String add3=rs.getString("Balance");
				 	t8.setText(add3);
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
		t4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		t4.setBounds(745, 93, 93, 21);
		t14.add(t4);
		
		t11 = new JTextField();
		t11.setEditable(false);
		t11.setBounds(641, 300, 101, 26);
		t14.add(t11);
		t11.setColumns(10);
		
		t12 = new JButton("Total");
		t12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 try{
				 String a1=t8.getText();
				 String a2=t10.getText();
				 int sum=Integer.parseInt(a1)-Integer.parseInt(a2);
				 String sum1=String.valueOf(sum);
				 t11.setText(sum1);
				 }catch(Exception e){
				 JOptionPane.showMessageDialog(null, e);
				 }
				 */
			}
		});
		t12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		t12.setBounds(769, 300, 93, 24);
		t14.add(t12);
		/*
		 * for generating acc no. from database and call the function also
		 public void Account(){
		 try{
		 String sql="select * from table_name";
		 pat=conn.prepareStatement(sql);
		 rs=pat.executeQuery();
		 while(rs.next()){
		 String account=rs.getString("Acc");
	     JComboBox.addItem(account);
		 }
		 }catch(Exception e){
		 JOptionPane.shoeMessageDialog(null, e);
		 }
		 }
		 */
		JComboBox comboBox = new JComboBox();
		comboBox.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
				/*
				 try{
				 String a1=(String) JComboBox.getSelectedItem();
				 String sql="select * from table_name where Acc=?";
				 pat=conn.prepareStatement(sql);
				 pat.setString(1, a1);
				 rs=pat.executeQuery();
				 if(rs.next()){
				 String add=rs.getString("Balance");
				 t15.setText(add);
				 }
				 }catch(Exception e){
				 JOptionPane.showMessageDialog(null, e);
				 }
				 */
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
			}
		});
		comboBox.setBounds(513, 358, 170, 21);
		t14.add(comboBox);
		
		t17 = new JButton("Show");
		t17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 try{
				 String a1=t10.getText();
				 String a2=t15.getText();
				 int sum=Integer.parseInt(a1)+Integer.parseInt(a2);
				 String sum1=String.valueOf(sum);
				 t16.setText(sum1);
				 
				 }catch(Exception e){
				 JOptionPane.showMessageDialog(null, e);
				 }
				 */
			}
		});
		t17.setFont(new Font("Times New Roman", Font.BOLD, 20));
		t17.setBounds(513, 438, 101, 33);
		t14.add(t17);
		/*public void TransferC() {
			
			 try{
			 String value1=(String) JComboBox.getSelectedItem();
			 String value2=t16.getText();
			 String sql="update table_name set Balance='"+value2+"' where Acc='"+value1+"'";
			 pat=conn.prepareStatement(sql);
			 pat.execute();
			 JOptionPane.showMessageDialog(null, "Successfully Transfered");
			 }catch(Exception e){
			 JOptionPane.showMessageDialog(null, e);
			 }
			
			
		}
		public void TransferD(){
		try{
		String value1=t19.getText();
		String value2=t11.getText();
		String sql="update table_name set Balance='"+value2+"' where Name='"+value1+"'";
		pat=conn.prepareStatement(sql);
		pat.execute();
		}catch(Exception e){
		JOptionPane.showMessageDialog(null, e);
		}
		}
		 */
		t18 = new JButton("Transfer");
		t18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				TransferD();
//				TransferC();
			}
		});
		t18.setFont(new Font("Times New Roman", Font.BOLD, 20));
		t18.setBounds(664, 438, 107, 33);
		t14.add(t18);
		
		t15 = new JTextField();
		t15.setEditable(false);
		t15.setBounds(706, 358, 85, 23);
		t14.add(t15);
		t15.setColumns(10);
		
		t16 = new JTextField();
		t16.setEditable(false);
		t16.setBounds(812, 358, 85, 23);
		t14.add(t16);
		t16.setColumns(10);
		
		t1 = new JLabel("Transfer");
		t1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		t1.setBounds(394, 25, 119, 33);
		t14.add(t1);
		
		t = new JLabel("User");
		t.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		t.setBounds(225, 86, 55, 26);
		t14.add(t);
		
		t19 = new JTextField();
		t19.setBounds(513, 93, 193, 19);
		t14.add(t19);
		t19.setColumns(10);
	}
}
