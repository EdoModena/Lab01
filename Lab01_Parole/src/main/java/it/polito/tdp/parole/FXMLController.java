package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCancella;
    
    @FXML
    private TextArea txtTempi;
    
    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	long t=System.nanoTime();
    	String m=txtTempi.getText();
    	elenco.addParola(txtParola.getText());
    	txtParola.clear();
    	String n=new String();
    	for(String s: elenco.getElenco()) {
    		n=n+s+"\n";
    		txtResult.setText(n);
    	}
    	long time=System.nanoTime();
    	txtTempi.setText(m+"Tempo Inserisci: "+(time-t)+ "\n");
    }
    

    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	long t=System.nanoTime();
    	String s=txtTempi.getText();
    	elenco.reset();
    	txtResult.clear();
    	long time=System.nanoTime();
    	txtTempi.setText(s+"Tempo Reset: "+(time-t)+"\n");
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	long t=System.nanoTime();
    	String m=txtTempi.getText();
    	String s=txtResult.getSelectedText();
    	elenco.cancella(s);
    	txtResult.clear();
    	String n=new String();
    	for(String S: elenco.getElenco()) {
    		n=n+S+"\n";
    		txtResult.setText(n);
    	}
    	long time=System.nanoTime();
    	txtTempi.setText(m+"Tempo Cancella: "+(time-t)+"\n");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
