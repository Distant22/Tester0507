import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class page4 {

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
			System.out.println("DB Connectd page 4");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page4 window = new page4();
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
	public page4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon shopimg = new ImageIcon(this.getClass().getResource("/shop2.png"));
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 250));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
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
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\1102µ{³]´Á¥½\\page3_04.png"));
		lblNewLabel_3.setBounds(17, 510, 339, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		JLabel lblNccuMisGroup_1 = new JLabel("");
		lblNccuMisGroup_1.setIcon(new ImageIcon("C:\\Users\\acer\\Desktop\\1102\u7A0B\u8A2D\u671F\u672B\\banner.png"));
		lblNccuMisGroup_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblNccuMisGroup_1.setBounds(-4, -2, 339, 52);
		frame.getContentPane().add(lblNccuMisGroup_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(shopimg);
		lblNewLabel.setBounds(50, 205, 177, 116);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		frame.setBounds(100, 30, 350, 600);
		

	}

	public void run() {
		// TODO Auto-generated method stub
		initialize();
		try {
			page4 window = new page4();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
