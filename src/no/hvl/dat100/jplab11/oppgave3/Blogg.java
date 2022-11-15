package no.hvl.dat100.jplab11.oppgave3;

import java.util.Arrays;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	
	private Innlegg[] innleggstabell;
	private int nesteLedig = 0;

	public Blogg() {
		this.innleggstabell = new Innlegg[20];
		
	}

	public Blogg(int lengde) {
		this.innleggstabell = new Innlegg[lengde];

	}

	public int getAntall() {
		return this.nesteLedig;

	}
	
	public Innlegg[] getSamling() {
		return this.innleggstabell;
		

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		return Arrays.asList(innleggstabell).indexOf(innlegg);
		

	}

	public boolean finnes(Innlegg innlegg) {
		return Arrays.asList(innleggstabell).contains(innlegg);
		
		
	}

	public boolean ledigPlass() {
		return this.nesteLedig < innleggstabell.length;
		

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(this.ledigPlass()) {
			this.innleggstabell[nesteLedig] = innlegg;
			return true;
		}
		return false;
		
	}
	
	public String toString() {
		String output = Integer.toString(nesteLedig) + "\n";
		
		for (int i = 0; i < nesteLedig; i++) {
			output += innleggstabell[i].toString();
			
		}
		
		return output;
		
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] temp = this.innleggstabell;
		
		this.innleggstabell = new Innlegg[temp.length + 1];
		
		for (int i = 0; i < this.innleggstabell.length; i++) {
			this.innleggstabell[i] = temp[i];
		}
		
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		this.utvid();
		if (this.ledigPlass()) {
			this.leggTil(innlegg);
			return true;
		}
		return false;
		
	}


	
	public boolean slett(Innlegg innlegg) {
		if (this.finnes(innlegg)) {
			this.innleggstabell[this.finnInnlegg(innlegg)] = this.innleggstabell[this.nesteLedig-1];
			this.innleggstabell[this.nesteLedig-1] = null;
			this.nesteLedig--;
			return true;
		}
		return false;
		
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());
	
	}
}