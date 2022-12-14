package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {


	protected int id;
	protected int likes;
	protected String bruker;
	protected String dato;

	public Innlegg() {

	}

	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;

	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;

	}

	public String getBruker() {

		return bruker;


	}

	public void setBruker(String bruker) {

		this.bruker = bruker;

	}

	public String getDato() {

		return dato;


	}

	public void setDato(String dato) {

		this.dato = dato;

	}

	public int getId() {

		return id;

	}

	public int getLikes() {

		return likes;

	}

	public void doLike() {

		likes += 1;

	}

	public boolean erLik(Innlegg innlegg) {

		if (id == innlegg.id) {
			return true;
		}

		return false;

	}

	@Override
	public String toString() {

		String s;

		s = Integer.toString(id) + "\n" + bruker + "\n" + dato + "\n" + Integer.toString(likes) + "\n";

		return s;
		// "1\nOle Olsen\n23-10\n7\n"

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		throw new UnsupportedOperationException(TODO.method());

	}
}
