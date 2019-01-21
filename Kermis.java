package kermisOpdracht;

import java.util.ArrayList;
import java.util.Scanner;

public class Kermis {

	Scanner sc = new Scanner(System.in);
	ArrayList<Attractie> aa = new ArrayList<>();
	Kassa kassa = new Kassa();

	public static void main(String[] args) {
		System.out.println('k' + 0);
		System.out.println('k');

		new Kermis().run();
	}

	private void run() {

//		Maak een array met kermis attracties
		bouwKermis();

//		Print welkom text
		printWelcome();

		while (true) {
			// Print keuze menu van attracties
			printMenu();
			getChoice();
		}

	}

	private void getChoice() {

		if (sc.hasNextInt()) {
			aa.get(sc.nextInt() - 1).draaien();
		} else if (sc.hasNextLine()) {
			String s = sc.nextLine();
			if (s.equals("o")) {
				printOmzet();
			} else if (s.equals("k")) {
				printKaartjes();
			} else if (s.equals("m")) {
				opstellingsKeuring();
			}
		}
	}

	private void opstellingsKeuring() {
		 System.out.println("Een monteur komt langs om onderhoud te plegen.");
		
		for (Attractie a : aa) {
			if(a instanceof RisicoRijkeAttracties) {
				if(a.kaartjes != 0 && !((RisicoRijkeAttracties)a).beurtGehad && a.kaartjes % ((RisicoRijkeAttracties)a).MAXRUNS == 0) {
					((RisicoRijkeAttracties)a).beurtGehad = true;
					System.out.println("De monteur heeft onderhoud gepleegd aan " + a.naam + " en de attractie is weer open voor bezoekers.");
				}
				
			}
		}
		
	}

	private void printKaartjes() {
		for (Attractie a : aa) {
			System.out.println(a.naam + " heeft " + a.kaartjes + " kaartje(s) verkocht.");
		}

		System.out.println("\n\nIn totaal zijn er " + kassa.getKaartjes(aa) + " kaartjes verkocht.\n\n");

	}

	private void printOmzet() {
		for (Attractie a : aa) {
			System.out.println("De omzet van " + a.naam + " = €" + a.omzet + ".");
		}

		System.out.println("\n\nDe totale omzet is: " + kassa.getOmzet(aa) + "\n\n");

	}

	private void printWelcome() {
		System.out.println("===== WELCOME TO NOODLELAND =====");
		System.out.println("");

	}

	private void printMenu() {
		System.out.println("Maak je keuze:");
		System.out.println("[1] botsautos");
		System.out.println("[2] Spin");
		System.out.println("[3] SpiegelPaleis");
		System.out.println("[4] Spookhuis");
		System.out.println("[5] Hawaii");
		System.out.println("[6] LadderKlimmen");
		System.out.println("");
		System.out.println("Type [o] voor een overzicht van de omzet.");
		System.out.println("Type [k] voor een overzicht van de kaartjes.");
		System.out.println("Type [m] om een monteur te bestellen.");
		System.out.println("");
	}

	private void bouwKermis() {
//		make instances of concrete attraction classes		
		Attractie ba = new BotsAutos("BotsAuto's", 2.50, 0);
		Attractie ha = new Hawaii("Hawaii", 2.90, 0, 10);
		Attractie lk = new LadderKlimmen("LadderKlimmen", 5.00, 0);
		Attractie sp = new SpiegelPaleis("Spiegelpaleis", 2.75, 0);
		Attractie spin = new Spin("Spin", 2.25, 0, 5);
		Attractie sh = new Spookhuis("Spookhuis", 3.20, 0);

		aa.add(ba);
		aa.add(spin);
		aa.add(sp);
		aa.add(sh);
		aa.add(ha);
		aa.add(lk);

	}

}
