/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

import Data.Evenement;
import Data.TypeCarreau;
import IHM.Affichage;
import IHM.Questions;
import java.util.Random;

/**
 *
 * @author mouhatcl
 */
public class Controleur {
    private Monopoly monopoly;
    
    public void payerJoueur(Joueur j){
        j.recevoirPaie();
        Questions.affiche("tu as reçu ton dû bro !");
    }
    
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
        //Est-ce un jour de paye ?
        if(lancer>40){
            payerJoueur(j);
            lancer = lancer%40;
        } else {lancer = lancer%40;}
        //Return carreau correspondant
        return monopoly.getCarreau(lancer);
    }
    
    public void jouerUnCoup(Joueur j){
        j.setPositionCourante(lancerDesAvancer(j));
        Evenement res = j.getPositionCourante().evenementEnCours(j);
        switch(res){
            case PayéLoyer : Questions.affiche("tour"); break;
            default : Questions.affiche("tour"); ;
        }
        
    }
    
       
    public void initPartie(){
            int nb;
            nb=Questions.askNb("Entrez le nombre de joueurs");
            for(int i=0;i<nb;i++){
                this.monopoly.addJoueur(new Joueur(Questions.askStr("Entrez le nom du joueur "+Integer.toString(i+1)),this.monopoly.getCarreau(0)));
                Affichage.AfficherJoueur(this.monopoly.getJoueurs().get(this.monopoly.getJoueurs().size()-1));
            }
            for (Joueur j:this.monopoly.getJoueurs()){
            this.jouerUnCoup(j);
            Affichage.AfficherJoueur(j);
            }
            
    }

    public Controleur() {
        this.monopoly = new Monopoly();
    }
   
}
