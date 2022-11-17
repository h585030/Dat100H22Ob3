package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private int nesteledig;
	private Innlegg[] innleggtabell;

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		this.nesteledig = 0;
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0;
	}

	public int getAntall() {
		return this.nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return this.innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < this.nesteledig; i++) {
			if (this.innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < this.nesteledig; i++) {
			if (this.innleggtabell[i].erLik(innlegg)) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		if (this.innleggtabell.length == this.nesteledig) {
			return false;
		}
		return true;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (!this.ledigPlass()) {
			return false;
		}
		if (!this.finnes(innlegg)) {
			this.innleggtabell[this.nesteledig] = innlegg;
			this.nesteledig++;
			return true;
		}
		return false;
	}
	
	public String toString() {
		String innlegget = this.nesteledig + "\n";
		for (int i = 0; i < this.nesteledig; i++) {
			innlegget += this.innleggtabell[i].toString();
		}
		return innlegget;

	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}