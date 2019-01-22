package kermisOpdracht;

abstract class RisicoRijkeAttracties extends Attractie {
	protected final int MAXRUNS;
	boolean beurtGehad = true;

	protected RisicoRijkeAttracties(String naam, double prijs, int oppervlakte, int maxRuns) {
		super(naam, prijs, oppervlakte);
		this.MAXRUNS = maxRuns;

	}

	@Override
	protected void draaien() {

		if (!beurtGehad && kaartjes % MAXRUNS == 0) {
			System.out.println("Sorry " + naam + " is gesloten voor onderhoud.");
		} else {
			System.out.println("Je koopt een kaartje voor " + naam);
			omzet += prijs;
			kaartjes++;
			beurtGehad = false;
		}

	}

}