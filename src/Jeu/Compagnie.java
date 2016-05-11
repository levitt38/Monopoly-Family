package Jeu;


public class Compagnie extends Carreau {
	private Joueur _proprietaire;

        public Compagnie(int num, String chaine){
            super(num,chaine);
        }
        
	public void action(Joueur aJ) {
		throw new UnsupportedOperationException();
	}

	private int calculLoyer() {
		throw new UnsupportedOperationException();
	}

	private Joueur getProprietaire() {
		return this._proprietaire;
	}

	private void acheterPropriete(Joueur aJ) {
		throw new UnsupportedOperationException();
	}
}