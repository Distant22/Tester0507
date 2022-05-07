import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class page2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page2 window = new page2();
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
	public page2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon banner = new ImageIcon(this.getClass().getResource("/banner.png"));
		ImageIcon button = new ImageIcon(this.getClass().getResource("/button00.png"));
		ImageIcon ShopIcon = new ImageIcon(this.getClass().getResource("/shop2.png"));
		ImageIcon whiteBlackButton = new ImageIcon(this.getClass().getResource("/buttonwhiteblack.png"));
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 250));
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 30, 350, 600);
		
		JLabel lblNewLabel = new JLabel("SHOP NOW");
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setFont(new Font("Garamond", Font.BOLD, 23));
		lblNewLabel.setBounds(129, 265, 182, 76);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel NccuLabel = new JLabel("NCCU");
		NccuLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 36));
		NccuLabel.setBounds(24, 70, 329, 101);
		frame.getContentPane().add(NccuLabel);
		
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
		
		
		JLabel lblLogin = new JLabel("log in");
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Book Antiqua", Font.BOLD, 16));
		lblLogin.setBounds(67, 391, 51, 54);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblLogin_1 = new JLabel("sign up");
		lblLogin_1.setForeground(Color.BLACK);
		lblLogin_1.setFont(new Font("Book Antiqua", Font.BOLD, 16));
		lblLogin_1.setBounds(208, 391, 73, 54);
		frame.getContentPane().add(lblLogin_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(whiteBlackButton);
		lblNewLabel_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1.setFont(new Font("Garamond", Font.BOLD, 28));
		lblNewLabel_1.setBounds(31, 401, 116, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(ShopIcon);
		lblNewLabel_1_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_1_2.setFont(new Font("Garamond", Font.BOLD, 28));
		lblNewLabel_1_2.setBounds(80, 276, 116, 53);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(whiteBlackButton);
		lblNewLabel_1_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1_1.setFont(new Font("Garamond", Font.BOLD, 28));
		lblNewLabel_1_1.setBounds(178, 401, 116, 37);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(button);
		lblNewLabel_3.setBounds(45, 243, 252, 126);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 250, 250));
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(43, 263, 252, 89);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				page3 p3 = new page3();
				p3.run();
				frame.dispose();
			}	
		});
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(null);
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(31, 401, 117, 37);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(null);
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setOpaque(false);
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBounds(178, 401, 117, 37);
		frame.getContentPane().add(btnNewButton_1_1);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void run() {
		// TODO Auto-generated method stub
		initialize();
		try {
			page2 window = new page2();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
