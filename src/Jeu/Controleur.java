/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

import java.util.Random;

/**
 *
 * @author mouhatcl
 */
public class Controleur {
    private int cesttropfacile;
    private static final Random RANDOM = new Random();
    
    private int lancerD6(){
        
        return RANDOM.nextInt(6)+1;
        
    }
    
    public Carreau lancerDesAvancer(Joueur j){
        
        int d1 = lancerD6();
        int d2 = lancerD6();
        Carreau c1 = j.getPositionCourante();
        int p = c1.getNumero();
        Carreau c2 = getCarreau(d1+d2+p);
        if((p+d1+d2)>= 40){
            
            j.recevoirPaie();
            
        }
        return c2;
        
    }
    public void jouerUnCoup(Joueur j){
        
        Carreau c = lancerDesAvancer(j); //jet de dès retournant la nouvelle position du joueur j au carreau c
        action(j); //action du joueur j sur la case c
        
    }
}
