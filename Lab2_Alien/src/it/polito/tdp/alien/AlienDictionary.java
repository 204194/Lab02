package it.polito.tdp.alien;
import java.util.*;

public class AlienDictionary {
	private List<World> dizionario = new LinkedList<World>();
	
	public void addWord(String alienWord, String translation){
		boolean trovata = false;
		for(World wtemp: dizionario) {
			if(wtemp.compare(alienWord)!=null){
				wtemp.setTranslation(translation);
				trovata = true;
			} 
		}
		if(!trovata && controllaParola(alienWord) && controllaParola(translation)) {
			World w = new World(alienWord, translation);
			dizionario.add(w);
		}
	}
	
	public String translateWord(String alienWord){
		/*Il metodo viene chiamato dal Controller per la traduzione della parola alienWord passata
come parametro. Il metodo restituisce la parola tradotta, altrimenti null se alienWord non è
presente nel dizionario.*/
		String traduzione="";
		boolean trovata = false;
		for(World wtemp: dizionario) {
			if(wtemp.compare(alienWord)!=null){
				traduzione = wtemp.getTranslation();
				trovata = true;
				break;
			} 
		}
		
		if(trovata && controllaParola(alienWord)) {
			return traduzione;
		} else
		return null;
	}
	
	
	public boolean controllaParola(String parola) {
		if(parola.matches("[a-zA-Z ]*")) {
			return true;
			}
		else return false;

}
}
