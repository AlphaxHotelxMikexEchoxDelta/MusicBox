package objects;

import objects.mother.ElementMusical;

import java.io.Serializable;

public class LivreAudio extends ElementMusical implements Serializable {

    public LivreAudio(String titre, String auteur, int duree, int id, String contenu, Langue langue) {
        super(titre, auteur, duree, id, contenu, langue);
    }

    @Override
    public String toString() {
        return  "LivreAudio{ " +
                "titre='" + super.getTitre() + '\'' +
                ", personnage='" + super.getPersonnage() + '\'' +
                ", duree=" + super.getDuree() +
                ", id=" + super.getDuree() +
                ", contenu='" + super.getContenu() + '\'' +
                ", langue=" + super.getLangue() +
                "}\n";
    }

}
