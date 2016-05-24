/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Jeu.Gare;
import Jeu.Joueur;

/**
 *
 * @author mouhatcl
 */
public class Affichage {
    public static void AfficherJoueur(Joueur j){
        Questions.affiche(j.getNomJoueur());
        Questions.increment();
        Questions.affiche(Integer.toString(j.getCash())+" $");
        Questions.affiche(j.getPositionCourante().getNomCarreau());
        Questions.affiche("Gares :");
        Questions.increment();
        for (Gare g:j.getGares()){
            Questions.affiche(g.getNomCarreau());
        }
        Questions.decrement();
        Questions.decrement();
    }
}
