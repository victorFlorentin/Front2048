package MainView;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;


public class Board {
   
    private ArrayList<JLabel> tiles;
    
    
    Board(JPanel panel){
        fillArray();
        createBoard(panel);
    }
    private void fillArray(){
        tiles = new ArrayList<JLabel>();
        for(int i=0; i<16; i++){
            tiles.add(new JLabel("0"));
            tiles.get(i).setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
            tiles.get(i).setHorizontalAlignment(SwingConstants.CENTER);
        }
    }
    private void createBoard(JPanel panel){
        tiles.forEach(label -> {
        panel.add(label);

        });
    }
    
    public void updateBoard(ArrayList<Integer> values, JPanel panel) {
        for (Component c : panel.getComponents()) {
        	((JLabel) c).setText("holis");
        }
    }
}