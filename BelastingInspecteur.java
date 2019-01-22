package kermisOpdracht;

import java.util.ArrayList;

public class BelastingInspecteur {
double belastingGeldTotaal, belastingGeldDeze;

	void zakkenVullen(ArrayList<Attractie> aa, Kassa k) {
		for (Attractie a : aa) {
			if (a instanceof GokAttractie) {
				 belastingGeldTotaal += ((GokAttractie)a).kansSpelBelastingBetalen(a);
			}
		}
		
		System.out.println("De inspecteur heeft in totaal " + (belastingGeldTotaal - k.betaaldeBelasting) + " opgehaald.");
		System.out.println("Tot nu toe is er " + k.betaaldeBelasting + "afgedragen.\n\n");
		
		k.betaaldeBelasting = belastingGeldTotaal;
		
	}
}