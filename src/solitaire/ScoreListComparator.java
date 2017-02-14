//Tekijät: Miia-Maria Mikkola ja Jenni Hautala

//High scores -listan vertailu

package solitaire;

import java.util.*;

public class ScoreListComparator implements Comparator <ScoreList> {

    @Override
    public int compare(ScoreList x, ScoreList y){
    
        return x.compareTo (y);
    }  
}
