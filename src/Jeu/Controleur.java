/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

import IHM.Questions;
import java.util.Random;

/**
 *
 * @author mouhatcl
 */
public class Controleur {
    private Monopoly monopoly;
    
    
    
    private int lancerDes(){
        return (int)(Math.random()*100%6)+1;
    }
    
    public Carreau lancerDesAvancer(Joueur j){
        //Lancer1
        int lancer = lancerDes();
        //Lancer2
        lancer += lancerDes();
        //Recup position du joueur
        lancer += j.getPositionCourante().getNumero();
        //Modulo pour rester sur le plateau
        lancer = lancer%40;
        //Return carreau correspondant
        return monopoly.getCarreau(lancer);
    }
    
    public void jouerUnCoup(Joueur j){
        j.setPositionCourante(lancerDesAvancer(j));
    }
    
    private void initPartie(){
            int nb;
            nb=Questions.askNb("Entrez le nombre de joueurs");
            for(int i=0;i<nb;i++){
                this.monopoly.getJoueurs().add(new Joueur(Questions.askStr("Entrez le nom du joueur "+Integer.toString(i+1))));
            }
    }
}
