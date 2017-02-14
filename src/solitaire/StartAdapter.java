//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Start-painikkeen toiminnallisuus. Avaa itse pelin

package solitaire;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartAdapter implements ActionListener {
    
    JFrame frame;
    
    public StartAdapter (JFrame frame2){
     
     frame = frame2;
     
     
     }
    
    public void actionPerformed (ActionEvent e){
        
        GridBagConstraints c = (GridBagConstraints) Solitaire.constraints.clone();
        c.insets = new Insets(15,15,15,15);
        c.weightx = 1.0;
        c.weighty = 1.0;
        frame.getContentPane().removeAll();
        frame.getContentPane().add(new Game(frame), c);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
    }
}
