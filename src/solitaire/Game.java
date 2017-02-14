//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Tämän hetkinen pelinäkymä

package solitaire;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Game extends JPanel{
 
    public Game (JFrame frame){
    
        SpringLayout layout = new SpringLayout(); 
        
        setLayout(layout);
        
        Random randomGenerator = new Random();
     
        int score = randomGenerator.nextInt(10000);
        
        //Luodaan End of game -painike ja määritetään sen paikka. Poistetaan, kun
        //lisätään oikea peli
                      
        JButton button = new JButton("End of game");
        
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, button, 0, SpringLayout.HORIZONTAL_CENTER, this);
        layout.putConstraint(SpringLayout.VERTICAL_CENTER, button, 0, SpringLayout.VERTICAL_CENTER, this);
        add(button);
        button.addActionListener(new EndAdapter(frame, score));
        
        //Luodaan paneeli, johon sijoitetaan kaikki loput, oikeat, painikkeet
        
        JPanel panel = new JPanel(new GridLayout(1,4));
        
        layout.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST, this);
        layout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, this);
        add(panel); 
        
                
        button = new JButton("How to Play?");
        panel.add(button);
        button.addActionListener(new HowToPlayConfirmAdapter(frame));

                     
        button.setAlignmentY(Component.BOTTOM_ALIGNMENT);             
                
        button = new JButton("High Scores");
        panel.add(button);
        button.addActionListener(new HighScoresConfirmAdapter(frame));
        
        button.setAlignmentY(Component.BOTTOM_ALIGNMENT);

        
        button = new JButton("Settings");
        panel.add(button);
        button.addActionListener(new SettingsConfirmAdapter(frame));
        
        button.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        
        button = new JButton("Exit");
        panel.add(button);
        button.addActionListener(new ExitConfirmAdapter(frame));
        
        button.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        
    
}
    public void paintComponent(Graphics g){
        
        
        super.paintComponent(g);
    }
}
