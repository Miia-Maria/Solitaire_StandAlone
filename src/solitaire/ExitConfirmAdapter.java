//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Pelinäkymän Exit-painikkeen toiminnallisuus. Erona toiseen, tässä on
//mukana virheilmoitus, joka kysyy haluaako käyttäjä jatkaa poistumistaan

package solitaire;

import javax.swing.*;
import java.awt.event.*;

public class ExitConfirmAdapter implements ActionListener {
    
    JFrame frame;
    
    public ExitConfirmAdapter (JFrame frame2){
     
     frame = frame2;
     
     
     }
    
    public void actionPerformed (ActionEvent e){
        
        String[] options = {"Yes", "No"};
        
        if (JOptionPane.showOptionDialog(frame,
        "The game will not be saved. \n Do you want to continue?", "  ",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, 
        options[1]) == JOptionPane.YES_OPTION)  {
        
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        }
        
    }
}
