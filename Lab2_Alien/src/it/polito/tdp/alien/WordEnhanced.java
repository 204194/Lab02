package it.polito.tdp.alien;
import java.util.*;

public class WordEnhanced {

		private String alienWorld;
		private List<String> traduzioni = new LinkedList<String>();
	
	public WordEnhanced(String alienWorld) {
			super();
			this.alienWorld = alienWorld;
		}
	
	public String getAlienWorld() {
		return alienWorld;
	}

	public void setAlienWorld(String alienWorld) {
		this.alienWorld = alienWorld;
	}

	public String compare(String alienWorld) {
		
		if(this.alienWorld.compareTo(alienWorld)==0)
			return this.alienWorld;
		
		else return null;
	}
	
	public void addTranslation(String translation) {
		if(!traduzioni.contains(translation)) {
			traduzioni.add(translation);
		}
	}
	
	public String stampaTraduzioni(){
		String risultato = "";
		for(String t: traduzioni) {
			risultato+=""+t+"\n";
		}
		return risultato;
	}
		

}
