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
import java.awt.Toolkit;

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
		
		JButton BotonJuegoNuevo = new JButton("");
		BotonJuegoNuevo.setIcon(new ImageIcon("C:\\Users\\marti\\OneDrive\\Escritorio\\proyecto 2048\\Front2048\\res\\juego nuevo.png"));
		BotonJuegoNuevo.setForeground(Color.BLACK);
		BotonJuegoNuevo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		BotonJuegoNuevo.setFont(new Font("customFont", Font.BOLD | Font.ITALIC, 15));
		BotonJuegoNuevo.setBackground(Color.LIGHT_GRAY);
		BotonJuegoNuevo.setBounds(332, 279, 163, 70);
		panel.add(BotonJuegoNuevo);
		
		JLabel CartelBienvenida = new JLabel("");
		CartelBienvenida.setBackground(Color.GRAY);
		CartelBienvenida.setIcon(new ImageIcon("C:\\Users\\marti\\OneDrive\\Escritorio\\proyecto 2048\\Front2048\\res\\bienvenido.png"));
		CartelBienvenida.setForeground(Color.BLACK);
		CartelBienvenida.setFont(new Font("customFont", Font.BOLD | Font.ITALIC, 24));
		CartelBienvenida.setBounds(207, 34, 418, 173);
		panel.add(CartelBienvenida);
		
		JLabel ImagenCadenaSuperior = new JLabel("New label");
		ImagenCadenaSuperior.setIcon(new ImageIcon("C:\\Users\\marti\\OneDrive\\Escritorio\\proyecto 2048\\Front2048\\res\\parte superior.png"));
		ImagenCadenaSuperior.setBounds(0, 0, 172, 132);
		panel.add(ImagenCadenaSuperior);
		
		JLabel ImagenCadenaInferior = new JLabel("New label");
		ImagenCadenaInferior.setIcon(new ImageIcon("C:\\Users\\marti\\OneDrive\\Escritorio\\proyecto 2048\\Front2048\\res\\parte inferior.png"));
		ImagenCadenaInferior.setBounds(639, 473, 161, 127);
		panel.add(ImagenCadenaInferior);
		frame.setBounds(100, 100, 818, 641);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
