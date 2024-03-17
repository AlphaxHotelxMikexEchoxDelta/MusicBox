package objects.comparator;

import objects.mother.ElementMusical;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class CompareTitre implements Comparator<ElementMusical>, Serializable {

    @Override
    public int compare(ElementMusical o1, ElementMusical o2) {
        if(Objects.equals(o1.getTitre(), o2.getTitre())){
            return o1.compareTo(o2) ;
        }
        return o1.getTitre().compareTo(o2.getTitre());
    }
}
