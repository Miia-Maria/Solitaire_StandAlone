//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Exit-painikkeen toiminnallisuus. Sulkee koko ikkunan

package solitaire;

import javax.swing.*;
import java.awt.event.*;

public class ExitAdapter implements ActionListener {
    
    JFrame frame;
    
    public ExitAdapter (JFrame frame2){
     
     frame = frame2;
     
     
     }
    
    public void actionPerformed (ActionEvent e){
        
        
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        
    }
}
