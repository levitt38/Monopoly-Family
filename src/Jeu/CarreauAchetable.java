/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

import Data.Evenement;
import Data.TypeCarreau;
import IHM.Questions;
import IHM.TextColors;

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
        this._proprietaire = null;
    }
    
        public abstract TypeCarreau getType();
        
        public int getPrixAchat(){
                return this.prixAchat;
            }

	public abstract int calculLoyer() ;
        
        public boolean estLibre(){
            return (this.getProprietaire()==null);
        }

        public void actionProprieteLibre(Joueur j){
            int choix = Questions.voulezVousAcheter(this.getNomCarreau());
            if(choix == 0){
                return;
            } else {
                if(j.getCash()>=this.getPrixAchat()){
                    this.setProprietaire(j);
                    j.addCarreauAchetable(this);
                    j.modifCash(-this.getPrixAchat());
                } else{
                    Questions.affiche(TextColors.RED+"Vous n'avez pas assez d'argent, revenez plus tard"+TextColors.RESET);
                }
            }
        }
            
        public void actionProprietePrise(Joueur j){
            Joueur proprio = this.getProprietaire();
            if(proprio.equals(j)){
                Questions.affiche("Vous êtes sur une de vos propriété");
            } else {
                int loyer = this.calculLoyer();
                j.modifCash(-loyer);
                proprio.modifCash(loyer);
                Questions.affiche(j.getNomJoueur()+" a payé un loyer de "+loyer+"€ a "+proprio.getNomJoueur());
            }
        }
        
	public void action(Joueur aJ) {
            if(! this.estLibre()){
                this.actionProprietePrise(aJ);
            } else{ this.actionProprieteLibre(aJ); }
	}
        
	public Joueur getProprietaire() {
		return this._proprietaire;
	}

        public void setProprietaire(Joueur _proprietaire) {
            this._proprietaire = _proprietaire;
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
                //j.payerLoyer(this.calculLoyer());
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
