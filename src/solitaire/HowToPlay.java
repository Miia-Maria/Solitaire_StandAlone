//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//How to Play -näkymä

package solitaire;

import javax.swing.*;
import java.awt.*;

public class HowToPlay extends JComponent {
    
    public HowToPlay(JFrame frame){
        
        setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
              
        JLabel label = new JLabel("How to Play?");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        label = new JLabel("  ");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Kirjoitetaan pelin ohjeet
        
        JTextArea text = new JTextArea ("fghdsfhdsh ghffffffffffuuuuuuuuuuuuuuuuuuuuu uuuuuuuuuuuuuuuuuuuuuuuuuuuuu uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu uuuuuuuuuuuuuuuuuu uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu    ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff", 
                                        15, 50);
        
        text.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        text.setEditable(false);
        text.setLineWrap(true);
        add(text);
        
        //Painikkeiden luonti
        
        label = new JLabel("  ");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JButton button = new JButton("Start Game");
        add(button);
         button.addActionListener(new StartAdapter(frame));
        
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        label = new JLabel("  ");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        button = new JButton("Back");
        add(button);
        button.addActionListener(new BackAdapter(frame));
        
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
}
