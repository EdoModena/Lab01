package it.polito.tdp.parole.model;

import java.util.*;

public class Parole2 {
	List<String> parole;	
	public Parole2() {
		parole= new ArrayList<String>();
	}
	
	public void addParola(String p) {
		p=p.toLowerCase();
		parole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(parole);
		return parole;
	}
	
	public void reset() {
		parole.clear();;
	}
	
	public void cancella(String p) {
		parole.remove(p);
	}

}