/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jeu;

/**
 *
 * @author mouhatcl
 */
public abstract class CarreauAchetable extends Carreau{
	private Joueur _proprietaire;
    public CarreauAchetable(int numero, String nomCarreau) {
        super(numero, nomCarreau);
    }
    

	public abstract int calculLoyer() ;

	public Joueur getProprietaire() {
		return this._proprietaire;
	}

	public void acheterPropriete(Joueur aJ) {
		throw new UnsupportedOperationException();
	}
 

}
