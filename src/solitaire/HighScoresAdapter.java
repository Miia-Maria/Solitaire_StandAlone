//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//High Scores -painikkeen toiminnallisuus. Avaa High scores -näkymän.

package solitaire;

import javax.swing.*;
import java.awt.event.*;

public class HighScoresAdapter implements ActionListener {
    
    JFrame frame;
    
    public HighScoresAdapter (JFrame frame2){
     
     frame = frame2;
     
     
     }
    
    public void actionPerformed (ActionEvent e){
        
        frame.getContentPane().removeAll();
        frame.getContentPane().add(new HighScores(frame), Solitaire.constraints);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
    }
}
