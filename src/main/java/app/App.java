package app;

import objects.Chanson;
import objects.LivreAudio;
import objects.PlayList;
import objects.comparator.CompareArtiste;
import objects.comparator.CompareDuree;
import objects.comparator.CompareTitre;
import objects.mother.ElementMusical;

import java.awt.*;
import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class App implements Serializable {

    List<PlayList> play ;

    public App(List<PlayList> playLists) {
        this.play = playLists;
    }

    public void affiche_chansons(){
        List<ElementMusical> pop = new ArrayList<ElementMusical>() ;

        for( PlayList p : play ){
            for( ElementMusical e : p.getElementMusical()){
                if( e.getClass().equals( Chanson.class ) ){
                    pop.add(e) ;
                }
            }
        }

        pop.sort( new CompareTitre() );
        pop.forEach(System.out::println);
    }

    public void affiche_livres(){

        List<ElementMusical> pop = new ArrayList<ElementMusical>() ;

        for( PlayList p : play ){
            for( ElementMusical e : p.getElementMusical()){
                if( e.getClass().equals( LivreAudio.class ) ){
                    pop.add(e) ;
                }
            }
        }

        pop.sort( new CompareTitre() );
        pop.forEach(System.out::println);

    }

    public void affiche_playlists(){

        List<ElementMusical> pop = new ArrayList<ElementMusical>();

        for( PlayList p : play ) {
            pop.addAll(p.getElementMusical());
        }

        pop.sort( new CompareTitre() );
        pop.forEach(System.out::println);
    }

    public void ajouter_chanson( String nom, Chanson chanson ){
        for( PlayList p : play ){
            if( p.getNom().equals( nom ) ){
                p.addChanson(chanson);
            }
        }
    }

    public void ajouter_livre( String nom, LivreAudio livre ){
        for( PlayList p : play ){
            if( p.getNom().equals( nom ) ){
                p.addLivre(livre);
            }
        }
    }

    public void ecouter( String musical ) throws URISyntaxException, IOException {
        for( PlayList p : play ){
            for( ElementMusical e : p.getElementMusical() ){
                if( e.getTitre().equals( musical ) ){
                    System.out.println(e.getContenu());

                    Desktop desk=Desktop.getDesktop();
                    desk.browse(new URI(e.getContenu()));

                }
            }
        }
    }

    public void cree_playlist( String nom, int id ){
        play.add( new PlayList( nom, id, null, null) ) ;
    }

    public void supp_playlist( String nom ){
        play.removeIf(p -> p.getNom().equals(nom));
    }

}
