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
		
		Bilde bilde = new Bilde();
		
		//throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		Bilde bilde = new bilde();
		
		//throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}
	
	public String getUrl() {
		
		return url;
		
		//throw new UnsupportedOperationException(TODO.method());

	}

	public void setUrl(String url) {
		
		this.url = url;
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		
		String s;

		s = Integer.toString(id) + "\n" + bruker + "\n" + dato + "\n" + Integer.toString(likes) + "\n" + url + "\n";

		return s;
		
		// BILDE\n1\nOle Olsen\n23-10\n0\net bilde\nhttps://www.picture.com/oo/jpg\n
		
		//throw new UnsupportedOperationException(TODO.method ());

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
