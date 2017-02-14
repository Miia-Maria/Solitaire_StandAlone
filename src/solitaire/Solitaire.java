//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Solitairen perustiedot, muun muassa ikkunan koko ja layout

package solitaire;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Solitaire {
    static GridBagConstraints constraints;
    static ArrayList <ScoreList> scoreList = new ArrayList <ScoreList>();
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Solitaire");  
        frame.setSize(1800, 950);
        frame.setLayout (new GridBagLayout());
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.fill = GridBagConstraints.BOTH;
        frame.getContentPane().add(new MainScreen(frame), constraints);
        frame.setVisible(true);
        
        frame.addWindowListener(new ClosingAdapter());
    }
    
}
