package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	List<String> parole= new LinkedList<String>();	
	public Parole() {
		
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
		parole.removeAll(parole);
	}
	
	public void cancella(String p) {
		for(String s: parole) {
			if(s.compareTo(p)==0)
				parole.remove(s);
		}
	}

}
