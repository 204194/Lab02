package it.polito.tdp.alien;
import java.util.*;

public class World {
	private String alienWorld;
	private String translation;
	
	public World(String alienWorld, String translation) {
		super();
		this.alienWorld = alienWorld;
		this.translation = translation;
	}

	public String getAlienWorld() {
		return alienWorld;
	}

	public void setAlienWorld(String alienWorld) {
		this.alienWorld = alienWorld;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	public String compare(String alienWorld) {
		
		if(this.alienWorld.compareTo(alienWorld)==0)
			return this.alienWorld;
		
		else return null;
	}
	
	

}
