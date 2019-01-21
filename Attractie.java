package kermisOpdracht;

public abstract class Attractie {
//	Zou ik alles final kunnen maken?
	protected String naam;
	protected double prijs, omzet;
	protected int oppervlakte, kaartjes;
	
	protected Attractie(String naam, double prijs, int oppervlakte) {
		this.naam = naam;
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
	}
	
//	override the toString method (because im lazy)
	@Override
	public String toString() {
		return naam;
	}
	
//	Start attractie
	protected void draaien() {
		System.out.println("Je koopt een kaartje voor " + naam );
		omzet += prijs;
		kaartjes ++;
	}
}
