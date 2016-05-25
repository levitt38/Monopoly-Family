package Jeu;

import Data.TypeCarreau;


public class Compagnie extends CarreauAchetable {


        public Compagnie(int num, String chaine){
            super(num,chaine);
        }
        
	public void action(Joueur aJ) {
		throw new UnsupportedOperationException();
	}

        @Override
	public int calculLoyer() {
		throw new UnsupportedOperationException();
	}

    public Compagnie(int numero, String nomCarreau, int prixAchat) {
        super(numero, nomCarreau, prixAchat);
    }

        @Override
        public TypeCarreau getType(){
            return TypeCarreau.Compagnie;
        }
}