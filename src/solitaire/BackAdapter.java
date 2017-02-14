//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Tässä luokassa toteutetaan kaikkien Back-painikkeiden toiminnallisuus, joka 
//heittää käyttäjän takaisin päävalikkoon

package solitaire;

import javax.swing.*;
import java.awt.event.*;

public class BackAdapter implements ActionListener {
    
    JFrame frame;
    
    public BackAdapter (JFrame frame2){
     
     frame = frame2;
     
     
     }
    
    public void actionPerformed (ActionEvent e){
        
        frame.getContentPane().removeAll();
        frame.getContentPane().add(new MainScreen(frame), Solitaire.constraints);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
    }
}
