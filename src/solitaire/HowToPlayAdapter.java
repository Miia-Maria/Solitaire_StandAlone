//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//How to Play -painikkeen toiminnallisuus. Avaa How to Play -ikkunan

package solitaire;

import javax.swing.*;
import java.awt.event.*;

public class HowToPlayAdapter implements ActionListener {
    
    JFrame frame;
    
    public HowToPlayAdapter (JFrame frame2){
     
     frame = frame2;
     
     
     }
    
    public void actionPerformed (ActionEvent e){
        
        frame.getContentPane().removeAll();
        frame.getContentPane().add(new HowToPlay(frame), Solitaire.constraints);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
    }
}
