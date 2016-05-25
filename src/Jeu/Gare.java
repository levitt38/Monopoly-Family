package Jeu;

import Data.TypeCarreau;

public class Gare extends CarreauAchetable {

        public Gare(int num, String chaine){
            super(num,chaine);
        }
        
	public void action(Joueur aJ) {
		throw new UnsupportedOperationException();
	}

        @Override
	public int calculLoyer() {
		throw new UnsupportedOperationException();
	}

        
        @Override
        public TypeCarreau getType(){
            return TypeCarreau.Gare;
        }
}