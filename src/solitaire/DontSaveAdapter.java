//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Pelin lopussa tulevan ikkunan Don't save -napin toiminnallisuus, joka sulkee
//peli näkymän ja palauttaa päävalikkoon

package solitaire;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DontSaveAdapter implements ActionListener {
    
    JFrame frame;
    JComponent component;
    
    public DontSaveAdapter (JFrame frame2, JComponent component2){
     
     frame = frame2;
     component = component2;
     
     
     }
    
    public void actionPerformed (ActionEvent e){
       
        frame.getContentPane().removeAll();
        frame.getContentPane().add(new MainScreen(frame),Solitaire.constraints);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
        Window window = SwingUtilities.getWindowAncestor(component);
        
        if (window != null) window.dispose();
    }
}
