/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import Jeu.Carreau;
import Jeu.Monopoly;

/**
 *
 * @author nourik
 */
public class main{
    
    
    
    
    public static void main (String[] args) {
        Monopoly m1 = new Monopoly();
        m1.CreerPlateau("data.txt");
        
        
//        for(Carreau c : m1.getCarreaux()){                        //Affiche tout les carreau du monopoly
//            System.out.println(c.getNomCarreau());
//            System.out.println(c.getNumero());
//        }
       
       
       
       
    } 
   
   
    
   
   
   
}

