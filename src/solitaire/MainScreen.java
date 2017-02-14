//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Pelin aloitusnäkymä

package solitaire;

import javax.swing.*;
import java.awt.*;


public class MainScreen extends JComponent {

    public MainScreen(JFrame frame){
        
        //Kaikkien painikkeiden luonti
        
        setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
                
        JButton button = new JButton("                        Start                        ");
        add(button);
        button.addActionListener(new StartAdapter(frame));
                
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel label = new JLabel("  ");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        label = new JLabel("  ");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        button = new JButton("                How to Play?                ");
        add(button);
        button.addActionListener(new HowToPlayAdapter(frame));
        
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        label = new JLabel("  ");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        button = new JButton("                 High Scores                 ");
        add(button);
        button.addActionListener(new HighScoresAdapter(frame));
        
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        label = new JLabel("  ");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        button = new JButton("                    Settings                     ");
        add(button);
        button.addActionListener(new SettingsAdapter(frame));
        
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        label = new JLabel("  ");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        button = new JButton("                         Exit                         ");
        add(button);
        button.addActionListener(new ExitAdapter(frame));
        
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        
      
        
    }
}
