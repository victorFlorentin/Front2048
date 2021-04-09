package MainView;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
/**
 *
 * @author victo
 */
public class MainViewPanel {
	
	private JPanel mainPanel;
    private JPanel boardPanel;
    private Board board;
    
    MainViewPanel(){
    	this.mainPanel = new JPanel();
    	mainPanel.setBounds(0, 0, 800, 600);
    	mainPanel.setLayout(null);

    	this.boardPanel = new JPanel();
        boardPanel.setLayout(new java.awt.GridLayout(4, 4));
        boardPanel.setBounds(144, 32, 512, 512);
        boardPanel.setBackground(Color.CYAN);
        mainPanel.add(boardPanel);
        this.board= new Board(boardPanel);
        System.out.println("asdaasd");        
    }
    public JPanel getPanel() {
    	return this.mainPanel;
    }
    public void AddListener() {
    	mainPanel.setFocusable(true);
    	mainPanel.requestFocusInWindow();
        mainPanel.addKeyListener(new KeyAdapter() {
    		
			@Override
			public void keyPressed(KeyEvent KE) {
				if (KE.getKeyChar() == 'w' || KE.getKeyCode() == KeyEvent.VK_UP) {
					System.out.println("key pressed: "+KE.getKeyChar());
					board.updateBoard(null,boardPanel);
				}
			}
		});
    }
    
}
