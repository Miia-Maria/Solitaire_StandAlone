//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Pelinäkymän Settings-painikkeen toiminnallisuus. Erona toiseen, tässä on
//mukana virheilmoitus, joka kysyy haluaako käyttäjä jatkaa poistumistaan

package solitaire;

import javax.swing.*;
import java.awt.event.*;

public class SettingsConfirmAdapter implements ActionListener {
    
    JFrame frame;
    
    public SettingsConfirmAdapter (JFrame frame2){
     
     frame = frame2;
     
     
     }
    
    public void actionPerformed (ActionEvent e){
        
        String[] options = {"Yes", "No"};
        
        if (JOptionPane.showOptionDialog(frame,
        "The game will not be saved. \n Do you want to continue?", "  ",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, 
        options[1]) == JOptionPane.YES_OPTION)  {
            
        frame.getContentPane().removeAll();
        frame.getContentPane().add(new Settings(frame), Solitaire.constraints);
        frame.getContentPane().validate();
        frame.getContentPane().repaint();
        }
    }
}
