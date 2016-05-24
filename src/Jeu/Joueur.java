package Jeu;

import java.util.ArrayList;

public class Joueur {
	private String _nomJoueur;
	private int _cash = 1500;
	public ArrayList<Gare> _gares = new ArrayList<Gare>();
	private Carreau _positionCourante;

	public void payerLoyer(int aL) {
		throw new UnsupportedOperationException();
	}

	public void recevoirLoyer(int aL) {
		throw new UnsupportedOperationException();
	}

    public Joueur(String _nomJoueur) {
        this._nomJoueur = _nomJoueur;
    }
    public void recevoirPaie(){
        
        
        
    }
    public Carreau getPositionCourante(){
        
        return this._positionCourante;
        
    }
}