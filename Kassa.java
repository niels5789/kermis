package kermisOpdracht;

import java.util.ArrayList;

public class Kassa {
	double betaaldeBelasting;

	int getKaartjes(ArrayList<Attractie> aa) {
		int k = 0;

		for (Attractie a : aa) {
			k += a.kaartjes;
		}

		return k;
	}

	double getOmzet(ArrayList<Attractie> aa) {
		double d = 0;

		for (Attractie a : aa) {
			d += a.omzet;
		}

		return d;
	}
}