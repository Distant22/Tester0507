import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class page3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		String server = "jdbc:mysql://140.119.19.73:3315/";
		String database = "tuegroup9"; // change to your own database
		String url = server + database + "?useSSL=false";
		String username = "tuegroup9"; // change to your own username
		String password = "kft8027"; // change to your own password
		
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB Connectd page 3");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page3 window = new page3();
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
	public page3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void run() {
		// TODO Auto-generated method stub
		initialize();
		try {
			page3 window = new page3();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private void initialize() {
		
		ImageIcon banner = new ImageIcon(this.getClass().getResource("/banner.png"));
		ImageIcon ShopBlock = new ImageIcon(this.getClass().getResource("/page3fix01.png"));
		ImageIcon ShopBottomIcon = new ImageIcon(this.getClass().getResource("/page3_04.png"));
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 250));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(ShopBlock);
		lblNewLabel.setBounds(35, 78, 130, 120);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDueThisWeek = new JLabel("DUE THIS WEEK");
		lblDueThisWeek.setFont(new Font("微软雅黑", Font.BOLD, 17));
		lblDueThisWeek.setBounds(99, 35, 186, 70);
		frame.getContentPane().add(lblDueThisWeek);
		
		JLabel lblComingSoon = new JLabel("COMING SOON");
		lblComingSoon.setFont(new Font("微软雅黑", Font.BOLD, 17));
		lblComingSoon.setBounds(99, 262, 186, 70);
		frame.getContentPane().add(lblComingSoon);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(ShopBlock);
		lblNewLabel_2.setBounds(35, 178, 130, 120);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Shop");
		lblNewLabel_2_1.setForeground(new Color(255, 99, 71));
		lblNewLabel_2_1.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(38, 528, 35, 39);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Chat");
		lblNewLabel_2_1_1.setForeground(new Color(255, 165, 0));
		lblNewLabel_2_1_1.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
		lblNewLabel_2_1_1.setBounds(114, 528, 35, 39);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Collection");
		lblNewLabel_2_1_2.setForeground(new Color(255, 165, 0));
		lblNewLabel_2_1_2.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
		lblNewLabel_2_1_2.setBounds(174, 528, 88, 39);
		frame.getContentPane().add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Profile");
		lblNewLabel_2_1_2_1.setForeground(new Color(255, 165, 0));
		lblNewLabel_2_1_2_1.setFont(new Font("Book Antiqua", Font.PLAIN, 13));
		lblNewLabel_2_1_2_1.setBounds(261, 528, 88, 39);
		frame.getContentPane().add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(ShopBlock);
		lblNewLabel_1.setBounds(175, 78, 130, 120);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(ShopBlock);
		lblNewLabel_1_1.setBounds(175, 178, 130, 120);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel5 = new JLabel("");
		lblNewLabel5.setIcon(ShopBlock);
		lblNewLabel5.setBounds(35, 300, 130, 120);
		frame.getContentPane().add(lblNewLabel5);
		
		JLabel lblNewLabel6 = new JLabel("");
		lblNewLabel6.setIcon(ShopBlock);
		lblNewLabel6.setBounds(35, 400, 130, 120);
		frame.getContentPane().add(lblNewLabel6);
		
		JLabel lblNewLabel7 = new JLabel("");
		lblNewLabel7.setIcon(ShopBlock);
		lblNewLabel7.setBounds(175, 300, 130, 120);
		frame.getContentPane().add(lblNewLabel7);
		
		JLabel lblNewLabel8 = new JLabel("");
		lblNewLabel8.setIcon(ShopBlock);
		lblNewLabel8.setBounds(175, 400, 130, 120);
		frame.getContentPane().add(lblNewLabel8);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(ShopBottomIcon);
		lblNewLabel_3.setBounds(17, 510, 339, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		JLabel lblNccuMisGroup_1 = new JLabel("");
		lblNccuMisGroup_1.setIcon(banner);
		lblNccuMisGroup_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblNccuMisGroup_1.setBounds(-4, -2, 339, 52);
		frame.getContentPane().add(lblNccuMisGroup_1);
		
		JButton btnNewButton1 = new JButton("");
		btnNewButton1.setBounds(44, 95, 104, 82);
		btnNewButton1.setOpaque(false);
		btnNewButton1.setContentAreaFilled(false);
		btnNewButton1.setBorderPainted(false);
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page4 p4 = new page4();
				p4.run();
				frame.dispose();
			}	
		});
		
		
		frame.getContentPane().add(btnNewButton1);
		
		
		
		frame.setBounds(100, 30, 350, 600);
		
		
		
	}
}
