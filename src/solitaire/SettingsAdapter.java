//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Settings-painikkeen toiminnallisuus. Avaa Settings-näkymän

package solitaire;

import javax.swing.*;
import java.awt.event.*;

public class SettingsAdapter implements ActionListener {
    
    JFrame frame;
    
    public SettingsAdapter (JFrame frame2){
     
     frame = frame2;
     
     
     }
    
    public void actionPerformed (ActionEvent e){
        
        frame.getContentPane().removeAll();
        frame.getContentPane().add(new Settings(frame), Solitaire.constraints);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
    }
}
