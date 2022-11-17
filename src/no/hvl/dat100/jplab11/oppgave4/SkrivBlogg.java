package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		File file = new File(mappe + filnavn);
		FileWriter writer;
		boolean bool = false;
		
		try {
			writer = new FileWriter(file);
			writer.write(samling.toString());
			writer.close();
			bool = true;
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			return bool;
		}
	}
}