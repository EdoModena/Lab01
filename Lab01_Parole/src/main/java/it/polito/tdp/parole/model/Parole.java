package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	List<String> parole;	
	public Parole() {
		parole= new LinkedList<String>();
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
