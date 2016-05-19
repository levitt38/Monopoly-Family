/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

/**
 *
 * @author nourik
 */
public class Controleur {
    private Monopoly monopoly;
    
    public Controleur(){
        this.monopoly = new Monopoly();
    }
    
    private Carreau LancerDésAvancer(Joueur joueur){
            int positionJoueur = joueur.getPositionCourante().getNumero();
            int i1 = 0;
            //lancer n°1
            i1 += (int)(Math.random()*100%6);
            i1 += 1;
            //lancer n°1
            i1 += (int)(Math.random()*100%6);
            i1 += 1;
            
            return this.monopoly.getCarreaux().get(i1);
    }
    
    public void lancerDésAvancer(Joueur joueur){
        
    }
    
}
