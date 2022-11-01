package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	
	protected int id;
	protected String bruker;
	protected String dato;
	protected String tekst;
	protected int likes;
	
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		
		Tekst tekst = new tekst();
		
		//throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		
		Bilde bilde = new bilde();
		
		//throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public String getTekst() {
		
		return tekst;
		
		//throw new UnsupportedOperationException(TODO.method());

	}

	public void setTekst(String tekst) {
		
		this.tekst = tekst;
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		
		String s;

		s = Integer.toString(id) + "\n" + bruker + "\n" + dato + "\n" + Integer.toString(likes) + "\n" + tekst + "\n";

		return s;
		
		// TEKST\n1\nOle Olsen\n23-10\n0\nen tekst\n
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
