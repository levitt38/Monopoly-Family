package Jeu;

public abstract class Carreau {
	private int _numero;
	private String _nomCarreau;
        
        
        public Carreau(int numero, String nomCarreau){
            this._nomCarreau = nomCarreau;
            this._numero = numero;
        }

    public int getNumero() {
        return _numero;
    }


    public String getNomCarreau() {
        return _nomCarreau;
    }

}