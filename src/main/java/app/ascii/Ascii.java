package app.ascii;

import java.awt.*;
import java.util.Scanner;

public class Ascii {

    public static void banner(){
        System.out.println("\033[0;34m"+"\t   _______       __");
        System.out.println("\t /   ------.   / .`_");
        System.out.println("\t|  /         ~--~    \\");
        System.out.println("\t| |             __    `.____________________ _^-----^");
        System.out.println("\t| |  I=|=======/--\\=========================| o o o |");
        System.out.println("\t\\ |  I=|=======\\__/=========================|_o_o_o_|");
        System.out.println("\t \\|                   /                       ~    ~");
        System.out.println("\t   \\       .---.    .       "+"\033[0;36m"+"MusicBox"+"\033[0;34m");
        System.out.println("\t     -----'     ~~''"+"\033[0m");
    }

    public static void menu(){

        System.out.println("\n\tMenu:");
        System.out.println("\t\tac : Afficher toutes les chansons, rangées par artiste");
        System.out.println("\t\tal : Afficher tous les livres audios, rangés par durée");
        System.out.println("\t\tap : Afficher les éléments dans une playlist, rangés par ordre alphabétique des titres");
        System.out.println("\t\trc : Rajouter une nouvelle chanson dans une playlist");
        System.out.println("\t\trl : Rajouter un nouveau livre audio dans une playlist");
        System.out.println("\t\te : Écouter une chanson ou un livre audio");
        System.out.println("\t\tn : Créer une nouvelle playlist vide");
        System.out.println("\t\td : Supprimer une playlist");
        System.out.println("\t\th : Help");
        System.out.println("\t\tq : Quitter");
    }
/*
RESET("\033[0m"),
BLACK("\033[0;30m"),
RED("\033[0;31m"),
GREEN("\033[0;32m"),
YELLOW("\033[0;33m"),
BLUE("\033[0;34m"),
PURPLE("\033[0;35m"),
CYAN("\033[0;36m"),
WHITE("\033[0;37m");
*/

}
