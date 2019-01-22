package kermisOpdracht;

interface GokAttractie {

	default double kansSpelBelastingBetalen(Attractie a) {
		return a.omzet * 0.3;
	}
}