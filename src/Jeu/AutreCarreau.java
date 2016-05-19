
package Jeu;

/**
 *
 * @author nourik
 */
public class AutreCarreau extends Carreau {
	private Joueur proprietaire;

        public AutreCarreau(int num, String chaine){
            super(num,chaine);
        }
        
        
	public void action(Joueur aJ) {
		throw new UnsupportedOperationException();
	}

}