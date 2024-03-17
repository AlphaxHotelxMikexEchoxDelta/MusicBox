package objects;

import objects.mother.ElementMusical;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlayList implements Serializable {

    private String nom ;
    private int id ;
    private List<LivreAudio> livres ;
    private List<Chanson> chansons ;

    public PlayList(String nom, int id, List<LivreAudio> livres, List<Chanson> chansons) {
        this.nom = nom;
        this.id = id;
        this.livres = livres;
        this.chansons = chansons;
    }

    public List<ElementMusical> getElementMusical(){
        List<ElementMusical> list = new ArrayList<ElementMusical>();

        if( livres != null ){
            for( ElementMusical e : livres ){
                list.add(e) ;
            }
        }
        if( chansons != null ){
            for( ElementMusical e : chansons ){
                list.add(e) ;
            }
        }

        return list ;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<LivreAudio> getLivres() {
        return livres;
    }

    public void setLivres(List<LivreAudio> livres) {
        this.livres = livres;
    }
    public void addLivre( LivreAudio livre ){ this.livres.add(livre); }


    public List<Chanson> getChansons() {
        return chansons;
    }

    public void setChansons(List<Chanson> chansons) {
        this.chansons = chansons;
    }

    public void addChanson( Chanson chanson ){ this.chansons.add(chanson); }

    @Override
    public String toString() {
        return "PlayList{" +
                "nom='" + nom + '\'' +
                ", id=" + id +
                ", livres=" + livres +
                ", chansons=" + chansons +
                '}';
    }

}
