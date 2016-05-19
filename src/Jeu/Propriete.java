
package Jeu;

/**
 *
 * @author nourik
 */
public class Propriete extends Carreau {
	private Joueur proprietaire;
        
        
        public Propriete(int num, String chaine){
            super(num,chaine);
        }
        
	public void action(Joueur aJ) {
		throw new UnsupportedOperationException();
	}

	private int calculLoyer() {
		throw new UnsupportedOperationException();
	}

	private Joueur getProprietaire() {
		return this.proprietaire;
	}

	private void acheterPropriete(Joueur aJ) {
		throw new UnsupportedOperationException();
	}
}