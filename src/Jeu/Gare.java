package Jeu;

import Data.TypeCarreau;

public class Gare extends CarreauAchetable {

        public Gare(int num, String chaine){
            super(num,chaine,200);
        }
        
        @Override
        public TypeCarreau getType(){
            return TypeCarreau.Gare;
        }
 
        @Override
	public int calculLoyer() {
            int nb_gares = this.getProprietaire().getGares().size();
            switch(nb_gares){
                case 1 : return 25;
                case 2 : return 50;
                case 3 : return 75;
                case 4 : return 100;
                default : return 0;
            }
	}

    public Gare(int numero, String nomCarreau, int prixAchat) {
        super(numero, nomCarreau, prixAchat);
    }

        
        
}