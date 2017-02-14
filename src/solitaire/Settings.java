//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Pelin Settings-näkymä

package solitaire;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Settings extends JPanel implements ActionListener, WindowListener, ChangeListener {
            
    int selectedTheme = 2;
    int selectedDifficulty = 1;
    JRadioButton radio1, radio2, radio3, radio4, radio5, radio6, radio7;
    static final int FPS_MIN = 0;
    static final int FPS_MAX = 5;
    static final int FPS_INIT = 2;

    JFrame frame;
       
    public Settings (JFrame frame){
               
        this.frame = frame;
        
       setLayout (new BoxLayout(this, BoxLayout.Y_AXIS));
        
        JLabel label = new JLabel("Settings");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        label = new JLabel("  ");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //Luodaan paneeli, jonka sisälle tulevat kaikki asetuksien komponentit
        //Asetetaan väri valkoiseksi, jotta painikkeet erottuvat myöhemmin
        //lisättävästä taustasta
        
        JPanel panel = new JPanel(new GridBagLayout());
        add(panel);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        panel.setBackground(Color.WHITE);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(4,4,4,4);
        
        //Luodaan Theme- ja Difficulty-otsikot ja asetetaan ne paiaklleen
        
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        
        label = new JLabel("Theme");
        panel.add(label, c);
        label.setVerticalAlignment(SwingConstants.TOP);
                
        
        c.gridx = 0;
        c.gridy = 1;
        c.anchor = GridBagConstraints.LINE_START;
        
        label = new JLabel("Difficulty");
        panel.add(label, c);
        label.setVerticalAlignment(SwingConstants.TOP);
        
        //Luodaan Volume-otsikko ja asetetaan se paikalleen
        
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 3;
        c.weighty = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.LAST_LINE_START;
        
        JPanel vPanel = new JPanel(new GridLayout(3,1));
        panel.add(vPanel, c);
        vPanel.setBackground(Color.WHITE);
        
        label = new JLabel("Volume");
        vPanel.add(label, c);
        
        //Luodaan uusi paneeli Themen radiobuttoneille, asetetaan tausta 
        //valkoiseksi ja laitetaan paikalleen
        
        c.gridx = 2;
        c.gridy = 0;
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        
        JPanel tPanel = new JPanel(new GridLayout(4,1));
        panel.add(tPanel, c);
        tPanel.setBackground(Color.WHITE);
                           
        radio1 = new JRadioButton("Spring");
        tPanel.add(radio1);
        radio1.addActionListener(this);
        radio1.setBackground(Color.WHITE);
        
        radio2 = new JRadioButton("Summer");
        tPanel.add(radio2);
        radio2.addActionListener(this);
        radio2.setBackground(Color.WHITE);
        
        radio3 = new JRadioButton("Autumn/Fall");
        tPanel.add(radio3);
        radio3.addActionListener(this);
        radio3.setSelected(true);
        radio3.setBackground(Color.WHITE);
        
        radio4 = new JRadioButton ("Winter");
        tPanel.add(radio4);
        radio4.addActionListener(this);
        radio4.setBackground(Color.WHITE);
        
        //Luodaan uusi paneeli Difficultyn radiobuttoneille, asetetaan tausta 
        //valkoiseksi ja laitetaan paikalleen
        
        c.gridx = 2;
        c.gridy = 1;
        c.anchor = GridBagConstraints.LINE_END;
                
        JPanel dPanel = new JPanel(new GridLayout(3,1));
        panel.add(dPanel, c);
        dPanel.setBackground(Color.WHITE);
                
        radio5 = new JRadioButton("Noob");
        dPanel.add(radio5);
        radio5.addActionListener(this);
        radio5.setBackground(Color.WHITE);
        
        radio6 = new JRadioButton("Normal");
        dPanel.add(radio6);
        radio6.addActionListener(this);
        radio6.setSelected(true);
        radio6.setBackground(Color.WHITE);
        
        radio7 = new JRadioButton("Imposible");
        dPanel.add(radio7);
        radio7.addActionListener(this);
        radio7.setBackground(Color.WHITE);
        
        //Luodaan Volumen slider

        JSlider slider = new JSlider(JSlider.HORIZONTAL, FPS_MIN, FPS_MAX, FPS_INIT);
        vPanel.add(slider);
        slider.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        slider.addChangeListener(this); 
        
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBorder(
        BorderFactory.createEmptyBorder(0,0,10,0));
        slider.setBackground(Color.WHITE);
        
        label = new JLabel("  ");
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JButton button = new JButton("Back");
        add(button);
        button.addActionListener(new BackAdapter(frame));
        
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
       
    } 
    
   
    
   public void actionPerformed (ActionEvent e){
       
       //Radiobuttoneiden toiminnalisuudet
       
       if (e.getSource() == radio1){
           
       selectedTheme = 0;
       
       radio2.setSelected(false);
       radio3.setSelected(false);
       radio4.setSelected(false);
       

       }     
       
       if (e.getSource() == radio2){
           
       selectedTheme = 0;
       
       radio1.setSelected(false);
       radio3.setSelected(false);
       radio4.setSelected(false);
                  
       } 
       
       if (e.getSource() == radio3){
           
       selectedTheme = 0;
       
       radio1.setSelected(false);
       radio2.setSelected(false);
       radio4.setSelected(false);
                  
       }
      
       if (e.getSource() == radio4){
           
       selectedTheme = 0;
       
       radio1.setSelected(false);
       radio2.setSelected(false);
       radio3.setSelected(false);
                  
       }
       
       if (e.getSource() == radio5){
           
       selectedTheme = 0;
       
       radio6.setSelected(false);
       radio7.setSelected(false);
                        
       }
       
       if (e.getSource() == radio6){
           
       selectedTheme = 0;
       
       radio5.setSelected(false);
       radio7.setSelected(false);
                        
       }
       
       if (e.getSource() == radio7){
           
       selectedTheme = 0;
       
       radio5.setSelected(false);
       radio6.setSelected(false);
                        
       }
}
   public void windowDeiconified(WindowEvent e) {
        //startAnimation();
    }
   public void windowIconified(WindowEvent e) {
        //stopAnimation();
    }
   public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}   
    
    //Sliderin toiminnalisuutta
    
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
        if (!source.getValueIsAdjusting()) {
            int fps = (int)source.getValue();
            if (fps == 0) {
                
            } else {
                
              }
        }
    }

    public void startAnimation() {
        
    }

    public void stopAnimation() {
        
    }
}