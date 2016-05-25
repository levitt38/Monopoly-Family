/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

import Data.Evenement;
import Data.TypeCarreau;

/**
 *
 * @author mouhatcl
 */
public abstract class CarreauAchetable extends Carreau{
	private Joueur _proprietaire;
        private int prixAchat;

    public CarreauAchetable(int numero, String nomCarreau,int prixAchat) {
        super(numero, nomCarreau);
        this.prixAchat = prixAchat;
    }
    public CarreauAchetable(int numero, String nomCarreau) {
        super(numero, nomCarreau);
    }
        public int getPrixAchat(){
            return this.prixAchat;
        }

	public abstract int calculLoyer() ;

	public Joueur getProprietaire() {
		return this._proprietaire;
	}

	public void acheterPropriete(Joueur aJ) {
		throw new UnsupportedOperationException();
	}
 
        public boolean verifierAchat(Joueur j){
            return this.calculLoyer()<j.getCash();
        }
        
        public Evenement evenementEnCours(Joueur j){
            CarreauAchetable c = (CarreauAchetable)j.getPositionCourante();
            if(c.getProprietaire()!=null){
                j.payerLoyer(this.calculLoyer());
                return Evenement.PayéLoyer;
            }else{
                if(c.verifierAchat(j)){
                    return Evenement.AchatPossible;
                }else{
                    return Evenement.Rien;
                }
            }
        }
}
