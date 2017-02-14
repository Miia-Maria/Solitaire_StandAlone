//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//High scores -näkymä

package solitaire;

import javax.swing.*;
import java.awt.*;
import java.util.*;


public class HighScores extends JComponent {
    
    public HighScores (JFrame frame){
        
        setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
        
        JLabel label = new JLabel("High Scores");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        label = new JLabel("  ");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Taulukon luonti ja listan teko, johon pisteet tallennetaan
        
        JTable table = new JTable(10,3);
        table.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        add(table);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.getColumnModel().getColumn(0).setPreferredWidth(25);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(50);
        
        for (int i=0; i < table.getRowCount(); i++){
            table.getModel().setValueAt(Integer.toString(i+1)+".",i,0);
        }
        
        ArrayList <ScoreList> scoreList = new ArrayList <ScoreList>();
        ScoreList x;
        
        for (int i=0; i<Solitaire.scoreList.size(); i++) {
        
            x = Solitaire.scoreList.get(i);
            scoreList.add(x);
        }
        
        //Järjestää listan suurimman pistemäärän mukaan ja liittää nimen pistemäärään
        
        Collections.sort(scoreList);
        
        for (int i=0; i < table.getRowCount(); i++){
            if (i >= scoreList.size()) break;
            table.getModel().setValueAt(scoreList.get(i).name,i,1);
            table.getModel().setValueAt(scoreList.get(i).score,i,2);
        }    
        
        label = new JLabel("  ");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JButton button = new JButton("Back");
        add(button);
        button.addActionListener(new BackAdapter(frame));
        
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        
    }
}
