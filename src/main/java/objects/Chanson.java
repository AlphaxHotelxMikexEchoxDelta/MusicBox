package objects;

import objects.mother.ElementMusical;

import java.io.Serializable;

public class Chanson extends ElementMusical implements Serializable {

    public Chanson(String titre, String artiste, int duree, int id, String contenu) {
        super(titre, artiste, duree, id, contenu);
    }

    @Override
    public String toString() {
        return  "Chanson{ "+
                "titre='" + super.getTitre() + '\'' +
                ", personnage='" + super.getPersonnage() + '\'' +
                ", duree=" + super.getDuree() +
                ", id=" + super.getId() +
                ", contenu='" + super.getContenu() + '\'' +
                "}\n";
    }

}
