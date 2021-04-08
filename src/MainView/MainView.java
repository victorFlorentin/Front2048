package MainView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import javax.swing.JPanel;

public class MainView {

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
		frame = new JFrame();
		frame.getContentPane().setSize(new Dimension(800, 600));
		frame.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frame.getContentPane().setBounds(new Rectangle(0, 0, 800, 600));
		frame.getContentPane().setPreferredSize(new Dimension(800, 600));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(43, 25, 512, 512);
		//panel.setBounds(300, 161, 308, 368);
		frame.getContentPane().add(panel);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
