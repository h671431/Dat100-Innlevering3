package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {

	// TODO - deklarering av objektvariable

	private int id;
	private int likes;
	private String bruker;
	private String dato;

	public Innlegg() {

	}

	public Innlegg(int id, String bruker, String dato) {

		// TODO
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;

		// throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;

		// throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}

	public String getBruker() {

		return bruker;

		// throw new UnsupportedOperationException(TODO.method());

	}

	public void setBruker(String bruker) {

		this.bruker = bruker;

		// throw new UnsupportedOperationException(TODO.method());
	}

	public String getDato() {

		return dato;

		// throw new UnsupportedOperationException(TODO.method());

	}

	public void setDato(String dato) {

		this.dato = dato;

		// throw new UnsupportedOperationException(TODO.method());
	}

	public int getId() {

		return id;

		// throw new UnsupportedOperationException(TODO.method());

	}

	public int getLikes() {

		return likes;

		// throw new UnsupportedOperationException(TODO.method());

	}

	public void doLike() {

		likes += 1;

		// throw new UnsupportedOperationException(TODO.method());
	}

	public boolean erLik(Innlegg innlegg) {

		if (id == innlegg.id) {
			return true;
		}

		return false;

		// throw new UnsupportedOperationException(TODO.method());

	}

	@Override
	public String toString() {

		String s;

		s = Integer.toString(id) + "\n" + bruker + "\n" + dato + "\n" + Integer.toString(likes) + "\n";

		return s;
		// "1\nOle Olsen\n23-10\n7\n"

		// throw new UnsupportedOperationException(TODO.method());

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		throw new UnsupportedOperationException(TODO.method());

	}
}
