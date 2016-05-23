package Jeu;

import IHM.Questions;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Monopoly{
        private ArrayList<Carreau> carreaux = new ArrayList<>();
        private ArrayList<Joueur> joueurs = new ArrayList<>();
        
	public void CreerPlateau(String dataFilename){
		buildGamePlateau(dataFilename);
	}
	
	private void buildGamePlateau(String dataFilename)
	{
		try{
			ArrayList<String[]> data = readDataFile(dataFilename, ",");
			
			
			for(int i=0; i<data.size(); ++i){
				String caseType = data.get(i)[0];
				if(caseType.compareTo("P") == 0){
					System.out.println("Propriété :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                                        getCarreaux().add(new Propriete(Integer.valueOf(data.get(i)[1]),data.get(i)[2]));
				}
				else if(caseType.compareTo("G") == 0){
					System.out.println("Gare :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                                        getCarreaux().add(new Gare(Integer.valueOf(data.get(i)[1]),data.get(i)[2]));
				}
				else if(caseType.compareTo("C") == 0){
					System.out.println("Compagnie :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                                        getCarreaux().add(new Compagnie(Integer.valueOf(data.get(i)[1]),data.get(i)[2]));
				}
				else if(caseType.compareTo("AU") == 0){
					System.out.println("Case Autre :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                                        getCarreaux().add(new AutreCarreau(Integer.valueOf(data.get(i)[1]),data.get(i)[2]));
				}
				else
					System.err.println("[buildGamePleateau()] : Invalid Data type");
			}
			
		} 
		catch(FileNotFoundException e){
			System.err.println("[buildGamePlateau()] : File is not found!");
		}
		catch(IOException e){
			System.err.println("[buildGamePlateau()] : Error while reading file!");
		}
	}
	
	private ArrayList<String[]> readDataFile(String filename, String token) throws FileNotFoundException, IOException
	{
		ArrayList<String[]> data = new ArrayList<String[]>();
		
		BufferedReader reader  = new BufferedReader(new FileReader(filename));
		String line = null;
		while((line = reader.readLine()) != null){
			data.add(line.split(token));
		}
		reader.close();
		
		return data;
	}

        private void initPartie(){
            int nb;
            nb=Questions.askNb("Entrez le nombre de joueurs");
            for(int i=0;i<nb;i++){
                this.joueurs.add(new Joueur(Questions.askStr("Entrez le nom du joueur "+Integer.toString(i+1))));
            }
        }
    /**
     * @return the carreaux
     */
        
    public ArrayList<Carreau> getCarreaux() {
        return carreaux;
    }
}

