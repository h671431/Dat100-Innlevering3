package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	
	protected int id;
	protected int likes;
	protected String bruker;
	protected String dato;
	protected String tekst;
	protected String url;
	
	
	public Bilde(int id, String bruker, String dato, String tekst, String url){
		super(id, bruker, dato, tekst);
		this.url = url;
		
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
		this.url = url;
		
	}
	
	public String getUrl() {
		
		return url;
		

	}

	public void setUrl(String url) {
		
		this.url = url;
		
	}

	@Override
	public String toString() {
		
		String s;

		s = "BILDE" + Integer.toString(id) + "\n" + getBruker() + "\n" + getDato() + "\n" + Integer.toString(likes) + "\n" + getUrl() + "\n";

		return s;
		
		// BILDE\n1\nOle Olsen\n23-10\n0\net bilde\nhttps://www.picture.com/oo/jpg\n
		

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
