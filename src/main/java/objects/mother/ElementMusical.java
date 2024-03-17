package objects.mother;

import objects.Langue;

import java.io.Serializable;

public abstract class ElementMusical implements Comparable<ElementMusical>, Serializable {

    private String titre ;
    private String personnage ;
    private int duree ;
    private int id ;
    private String contenu ;

    private Langue langue ;

    public ElementMusical(String titre, String personnage, int duree, int id, String contenu) {
        this.titre = titre;
        this.personnage = personnage;
        this.duree = duree;
        this.id = id;
        this.contenu = contenu;
    }

    public ElementMusical(String titre, String personnage, int duree, int id, String contenu, Langue langue) {
        this.titre = titre;
        this.personnage = personnage;
        this.duree = duree;
        this.id = id;
        this.contenu = contenu;
        this.langue = langue;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getPersonnage() {
        return personnage;
    }

    public void setPersonnage(String personnage) {
        this.personnage = personnage;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Langue getLangue() {
        return langue;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    @Override
    public int compareTo(ElementMusical o) {
        if( this.getId() < o.getId() ){
            return -1 ;
        }
        else{
            return 1 ;
        }
    }
}
