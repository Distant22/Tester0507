import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class shop {

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
			System.out.println("DB Connectd");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					shop window = new shop();
					
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
	public shop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	

	
	private void initialize() {
		
		ImageIcon banner = new ImageIcon(this.getClass().getResource("/banner.png"));
		ImageIcon shop2 = new ImageIcon(this.getClass().getResource("/shop2.png"));
		ImageIcon home2 = new ImageIcon(this.getClass().getResource("/home2.png"));
		ImageIcon button = new ImageIcon(this.getClass().getResource("/button00.png"));
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 250));
		frame.setBounds(100, 30, 350, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Customer");
		lblNewLabel_3_1_2.setFont(new Font("Book Antiqua", Font.BOLD, 26));
		lblNewLabel_3_1_2.setBounds(129, 311, 210, 56);
		frame.getContentPane().add(lblNewLabel_3_1_2);
		
		JLabel lblSelect = new JLabel("Select your identity");
		lblSelect.setFont(new Font("Mongolian Baiti", Font.PLAIN, 22));
		lblSelect.setBounds(76, 215, 258, 101);
		frame.getContentPane().add(lblSelect);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Cooperation");
		lblNewLabel_3_1_2_1.setFont(new Font("Book Antiqua", Font.BOLD, 24));
		lblNewLabel_3_1_2_1.setBounds(126, 432, 210, 56);
		frame.getContentPane().add(lblNewLabel_3_1_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(shop2);
		lblNewLabel_3_1.setBounds(82, 312, 34, 56);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(home2);
		lblNewLabel_3_1_1.setBounds(78, 433, 51, 56);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(button);
		lblNewLabel_3.setBounds(42, 401, 252, 126);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(button);
		lblNewLabel_2.setBounds(42, 284, 252, 116);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("NCCU");
		lblNewLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 36));
		lblNewLabel.setBounds(24, 70, 329, 101);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNccuMisGroup_1 = new JLabel("");
		lblNccuMisGroup_1.setIcon(banner);
		lblNccuMisGroup_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblNccuMisGroup_1.setBounds(-4, -2, 339, 52);
		frame.getContentPane().add(lblNccuMisGroup_1);
		
		JLabel lblNccuMisGroup = new JLabel("NCCU MIS GROUP 9");
		lblNccuMisGroup.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblNccuMisGroup.setBounds(24, 30, 329, 101);
		frame.getContentPane().add(lblNccuMisGroup);
		
		JLabel lblGroupBuying = new JLabel("GROUP BUYING");
		lblGroupBuying.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 36));
		lblGroupBuying.setBounds(24, 110, 329, 101);
		frame.getContentPane().add(lblGroupBuying);
		
		JLabel lblSystem = new JLabel("System");
		lblSystem.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 36));
		lblSystem.setBounds(24, 150, 329, 101);
		frame.getContentPane().add(lblSystem);
		

		
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(null);
		btnNewButton_1.setBackground(new Color(255, 250, 250));
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_1.setBounds(42, 421, 252, 91);
		//加下面三行code 可以讓button變成隱形
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setToolTipText("");
		btnNewButton.setIcon(null);
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton.setBounds(42, 298, 252, 85);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton);
		

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page2 p2 = new page2();
				p2.run();
				frame.dispose();
			}	
		});
		

	}
}
