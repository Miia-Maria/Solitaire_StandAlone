//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Pelin lopussa tulevan ikkunan Save -napin toiminnallisuus, joka sulkee
//peli näkymän ja avaa High Scores -näkymän näyttäen käyttäjän pisteet
//taulukossa

package solitaire;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SaveAdapter implements ActionListener {
    
    JFrame frame;
    int score;
    JTextField textField;
    JComponent component;
    
    public SaveAdapter (JFrame frame2, int score2, JTextField textField2, JComponent component2){
     
     frame = frame2;
     score = score2;
     textField = textField2;
     component = component2;
     
     }
    
    public void actionPerformed (ActionEvent e){
       
        if (textField.getText().length() == 0){
            
        String message = "You can't save without typing your name";
        JOptionPane.showMessageDialog(new JFrame(), message, "  ",
        JOptionPane.ERROR_MESSAGE);
  
        }
        else {
                ScoreList list = new ScoreList();
                list.name = textField.getText();
                list.score = score;
                Solitaire.scoreList.add(list);
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new HighScores(frame),Solitaire.constraints);
                frame.getContentPane().validate();
                frame.getContentPane().repaint();
                Window window = SwingUtilities.getWindowAncestor(component);

                if (window != null) window.dispose();
                }
    }
}
