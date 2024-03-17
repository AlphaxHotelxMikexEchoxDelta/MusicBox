import app.MusicBox;
import app.ascii.Ascii;
import objects.Chanson;
import objects.Langue;
import objects.LivreAudio;
import objects.PlayList;
import serialisation.Serialisation;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {

        MusicBox musicBox = Serialisation.getObject() ;

        if( musicBox == null ){
            System.exit(1);
            System.err.println("Echec de la serialisation (X_X)");
        }

        Ascii.banner();

        Ascii.menu();

        Scanner scan = new Scanner( System.in );
        String choix = "Start" ;

        while( !choix.equals("q") ){

            System.out.print("Choix : ");
            choix = scan.nextLine();

            switch (choix) {
                case "ac":
                    musicBox.affiche_chansons();
                    break;
                case "al":
                    musicBox.affiche_livres();
                    break;
                case "ap":
                    musicBox.affiche_playlists();
                    break;
                case "rc":
                    System.out.print("Ajouter à la playlist: ");
                    choix = scan.nextLine();
                    System.out.print("Titre: ");
                    String titre_chanson = scan.nextLine();
                    System.out.print("Artiste: ");
                    String artiste = scan.nextLine();
                    System.out.print("Duree: ");
                    int duree_chanson = Integer.parseInt(scan.nextLine());
                    System.out.print("Id: ");
                    int id_chanson = Integer.parseInt(scan.nextLine()) ;
                    System.out.print("Contenu (lien Youtube): ");
                    String contenu_chanson = scan.nextLine();
                    musicBox.ajouter_chanson( choix, new Chanson(titre_chanson, artiste, duree_chanson, id_chanson, contenu_chanson) );
                    break;
                case "rl":
                    System.out.print("Ajouter à la playlist: ");
                    choix = scan.nextLine();
                    System.out.print("Titre: ");
                    String titre_livre = scan.nextLine();
                    System.out.print("Artiste: ");
                    String auteur = scan.nextLine();
                    System.out.print("Duree: ");
                    int duree_livre = Integer.parseInt(scan.nextLine());
                    System.out.print("Id: ");
                    int id_livre = Integer.parseInt(scan.nextLine()) ;
                    System.out.print("Contenu (lien Youtube): ");
                    String contenu_livre = scan.nextLine();
                    System.out.print("Langue (FR,EN,DE,IT,ESP): ");
                    Langue langue = Langue.valueOf(scan.nextLine());
                    musicBox.ajouter_livre(choix, new LivreAudio(titre_livre, auteur, duree_livre, id_livre, contenu_livre, langue) );
                    break;
                case "e":
                    System.out.print("Titre: ");
                    String titre_ecoute = scan.nextLine() ;
                    musicBox.ecouter(titre_ecoute);
                    break;
                case "n":
                    System.out.print("Creation de la playlist: ");
                    choix = scan.nextLine() ;
                    System.out.print("Id: ");
                    int id_playlist = Integer.parseInt(scan.nextLine()) ;
                    musicBox.cree_playlist( choix, id_playlist );
                    break;
                case "d":
                    System.out.print("Suppression de la playlist: ");
                    choix = scan.nextLine() ;
                    musicBox.supp_playlist(choix);
                    break;
                case "q":
                    System.out.println("Au revoir !");
                    break ;
                case "h":
                    Ascii.menu();
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
        Serialisation.putObject(musicBox);

    }
}
