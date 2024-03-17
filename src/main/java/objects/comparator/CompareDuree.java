package objects.comparator;

import objects.LivreAudio;

import java.io.Serializable;
import java.util.Comparator;

public class CompareDuree implements Comparator<LivreAudio>, Serializable {
    @Override
    public int compare(LivreAudio livre1, LivreAudio livre2) {

        if( livre1.getDuree() == livre2.getDuree() ){
            return livre1.compareTo(livre2) ;
        }
        return livre1.getDuree() - livre2.getDuree() ;

    }
}

