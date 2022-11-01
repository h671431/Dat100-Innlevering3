package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	
	protected String tekst;
	
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		this.likes = likes;
		
	}
	
	public String getTekst() {
		
		return tekst;
		

	}

	public void setTekst(String tekst) {
		
		this.tekst = tekst;
		
	}

	@Override
	public String toString() {
		
		String s;

		s = "TEKST" + Integer.toString(id) + "\n" + getBruker() + "\n" + getDato() + "\n" + Integer.toString(likes) + "\n" + getTekst() + "\n";

		return s;
		
		// TEKST\n1\nOle Olsen\n23-10\n0\nen tekst\n
		

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
