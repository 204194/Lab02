package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    AlienDictionary ad = new AlienDictionary();
    
    @FXML
    void doTranslate(ActionEvent event) {
    	    String parolaIns = txtWord.getText();
    	    if(parolaIns==null) {
    	    		return;
    	    }
    	    
    	    if(!parolaIns.matches("[a-zA-Z ]*")){
    	    		txtResult.appendText("\nInserire solo caratteri alfabetici.");
    	    }
  // else {
    	    	if(parolaIns.contains(" ")) {
    	    		String parole[] = parolaIns.split(" ");
    	    		ad.addWord(parole[0], parole[1]);
    	    		txtResult.appendText("\nHai aggiunto "+parole[0]+" "+parole[1]+" al dizionario.");
    	    	}
    	    	else {
    	        if(ad.translateWord(parolaIns)!=null) {
    	    		txtResult.appendText("\nTraduzione: \n"+ad.translateWord(parolaIns));
    	      } else {
    	    		txtResult.appendText("\nLa parola inserita non e' presente nel dizionario.");
    	          }
    	    }
   //}
 
    }
    
    @FXML
    void doReset(ActionEvent event) {
    		txtResult.setText("Welcome to Alien Dictionary 2017.");
    }
    
  
}