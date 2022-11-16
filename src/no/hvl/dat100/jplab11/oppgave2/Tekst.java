package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	protected String tekst;
	
	public Tekst () {
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		super();
		this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super();
		this.tekst = tekst;
	}
	
	public String getTekst() {
		return this.tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		return "TEKST\n" + this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.likes + "\n" + this.tekst + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
