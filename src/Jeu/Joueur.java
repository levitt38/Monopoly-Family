package Jeu;

import java.util.ArrayList;

public class Joueur {
	private String _nomJoueur;
	private int _cash = 1500;
	private ArrayList<Gare> _gares = new ArrayList<Gare>();
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
        
        throw new UnsupportedOperationException();
        
    }
    public Carreau getPositionCourante(){
        
        return this._positionCourante;
        
    }

    public ArrayList<Gare> getGares() {
        return _gares;
    }

    

    public String getNomJoueur() {
        return _nomJoueur;
    }

    public void setNomJoueur(String _nomJoueur) {
        this._nomJoueur = _nomJoueur;
    }

    public int getCash() {
        return _cash;
    }

    public void setCash(int _cash) {
        this._cash = _cash;
    }

    public void setPositionCourante(Carreau _positionCourante) {
        this._positionCourante = _positionCourante;
    }
}