//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Ikkunan käynnistyksen ja sulkemisen adapteri

package solitaire;

import java.awt.event.*;

public class ClosingAdapter extends WindowAdapter{
        public ClosingAdapter(){
        }
        public void windowClosing(WindowEvent e){
            System.exit(0);
        } 
}