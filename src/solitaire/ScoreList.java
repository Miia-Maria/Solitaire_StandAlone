//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//Arpoo pisteet End of game -painikketta painaessa. Poistetaan, kun lisätään
//oikea peli

package solitaire;

public class ScoreList implements Comparable <ScoreList> {
    
    String name;
    int score;
    
    @Override
    public int compareTo(ScoreList o){
    
        if (o.score < score) return (-1);
        
        else if (o.score == score) return (0);
        
        else return (1);
           
    }
    
    
}
