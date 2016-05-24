package Jeu;

import IHM.Questions;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Monopoly{
        private HashMap<String,Carreau> carreaux = new HashMap<>();
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
                                        getCarreaux().put(Integer.toString(i),new Propriete(Integer.valueOf(data.get(i)[1]),data.get(i)[2]));
				}
				else if(caseType.compareTo("G") == 0){
					System.out.println("Gare :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                                        getCarreaux().put(Integer.toString(i),new Gare(Integer.valueOf(data.get(i)[1]),data.get(i)[2]));
				}
				else if(caseType.compareTo("C") == 0){
					System.out.println("Compagnie :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                                        getCarreaux().put(Integer.toString(i),new Compagnie(Integer.valueOf(data.get(i)[1]),data.get(i)[2]));
				}
				else if(caseType.compareTo("AU") == 0){
					System.out.println("Case Autre :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                                        getCarreaux().put(Integer.toString(i),new AutreCarreau(Integer.valueOf(data.get(i)[1]),data.get(i)[2]));
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

        public void addJoueur(Joueur j){
            
            this.joueurs.add(j);
            
        }
        public ArrayList<Joueur> getJoueurs(){
            
            return this.joueurs;
            
        }
    /**
     * @return the carreaux
     */
        
    public HashMap<String,Carreau> getCarreaux() {
        return carreaux;
    }
}

