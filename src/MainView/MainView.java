package MainView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MainView {
	private Font customFont;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView window = new MainView();
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
	public MainView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
		    //create the font to use. Specify the size!
		      customFont = Font.createFont(Font.TRUETYPE_FONT, new File("CATFranken-Deutsch.ttf")).deriveFont(12f);
		    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    //register the font
		    ge.registerFont(customFont);
		} catch (IOException e) {
		    e.printStackTrace();
		} catch(FontFormatException e) {
		    e.printStackTrace();
		}
		frame = new JFrame();
		frame.setTitle("2048");
		frame.getContentPane().setSize(new Dimension(800, 600));
		frame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frame.getContentPane().setBounds(new Rectangle(0, 0, 800, 600));
		frame.getContentPane().setPreferredSize(new Dimension(800, 600));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 800, 600);
		//panel.setBounds(300, 161, 308, 368);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Juego Nuevo");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.setFont(new Font("customFont", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(332, 279, 163, 70);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("bienvenido a 2048");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\marti\\OneDrive\\Escritorio\\proyecto 2048\\Front2048\\res\\bienvenido.png"));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("customFont", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(300, 94, 255, 88);
		panel.add(lblNewLabel);
		frame.setBounds(100, 100, 818, 641);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
