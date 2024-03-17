package objects.comparator;

import objects.Chanson;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class CompareArtiste implements Comparator<Chanson>, Serializable {
    @Override
    public int compare(Chanson chanson1, Chanson chanson2) {

        if(Objects.equals(chanson1.getPersonnage(), chanson2.getPersonnage())){
            return chanson1.compareTo(chanson2) ;
        }
        return chanson1.getPersonnage().compareTo(chanson2.getPersonnage());

    }

}
