//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Pelin lopussa tuleva näkymä, tässä End of game -napin toiminnallisuus

package solitaire;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EndAdapter implements ActionListener {
    
    JFrame frame;
    int score;
    
    public EndAdapter (JFrame frame2, int score2){
         
        frame = frame2;
        score = score2;
        
        
     }
    
    public void actionPerformed (ActionEvent e){
        
        JDialog dialog = new JDialog(frame, "End of Game", true);
        
        JPanel panel = new JPanel();
        dialog.pack();
        dialog.setPreferredSize(new Dimension(300,250));
        SpringLayout layout = new SpringLayout();
        panel.setLayout(layout);
        dialog.add(panel);
        SpringLayout springLayout = new SpringLayout();
        dialog.setLayout(springLayout);
        
        //Ikkunan paikan määrittäminen
        
        springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, dialog);
        springLayout.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST, dialog);
        springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, dialog);
        springLayout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, dialog);
              
        //Komponenttien luonti ja paikan määrittäminen
        
        JLabel label = new JLabel("Congratulations!");
        panel.add(label);
        
        layout.putConstraint(SpringLayout.WEST, label, 15, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.EAST, label, 15, SpringLayout.EAST, panel);
        layout.putConstraint(SpringLayout.NORTH, label, 15, SpringLayout.NORTH, panel);
               
        JLabel label2 = new JLabel("Your score is " + Integer.toString (score));
        panel.add(label2);
        
        layout.putConstraint(SpringLayout.WEST, label2, 15, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.EAST, label2, 15, SpringLayout.EAST, panel);
        layout.putConstraint(SpringLayout.NORTH, label2, 15, SpringLayout.SOUTH, label);

        JLabel label3 = new JLabel("Type your name:");
        panel.add(label3);
        
        layout.putConstraint(SpringLayout.WEST, label3, 15, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.EAST, label3, 15, SpringLayout.EAST, panel);
        layout.putConstraint(SpringLayout.NORTH, label3, 15, SpringLayout.SOUTH, label2);

        JTextField textField = new JTextField(20);
        panel.add(textField);
        textField.addActionListener(new SaveAdapter(frame, score, textField, textField));   
        
        layout.putConstraint(SpringLayout.WEST, textField, 15, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.EAST, textField, -30, SpringLayout.EAST, panel);
        layout.putConstraint(SpringLayout.NORTH, textField, 15, SpringLayout.SOUTH, label3);

        //Luodaan toinen paneeli, jotta saadaan Save ja Don't save -painikkeeet vierekkäin
        //Määritetään niiden paikat ja etäisyydet toisistaan
        
        JPanel panel2 = new JPanel();
        panel.add(panel2);
        
        layout.putConstraint(SpringLayout.WEST, panel2, 15, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.EAST, panel2, 15, SpringLayout.EAST, panel);
        layout.putConstraint(SpringLayout.NORTH, panel2, 15, SpringLayout.SOUTH, textField);
        layout.putConstraint(SpringLayout.EAST, panel2, 5, SpringLayout.SOUTH, panel);
        layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, panel2, 0, SpringLayout.HORIZONTAL_CENTER, panel);
        
        panel2.setLayout(new GridLayout(1,2,15,0));
        
        JButton button = new JButton("Save");
        panel2.add(button);
        button.addActionListener(new SaveAdapter(frame, score, textField, button));
        
        JButton button2 = new JButton("Don't save");
        panel2.add(button2);
        button2.addActionListener(new DontSaveAdapter(frame, button));
     
        dialog.setSize(700, 600);
        dialog.pack();
        dialog.setLocationRelativeTo(frame);
                
        dialog.setVisible(true);
        
    }
}
