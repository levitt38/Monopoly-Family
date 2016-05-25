
package Jeu;

import Data.TypeCarreau;

/**
 *
 * @author nourik
 */
public class Propriete extends CarreauAchetable {        
        
        public Propriete(int num, String chaine){
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
            return TypeCarreau.PropriteteAConstruire;
        }
}