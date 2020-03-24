package Tentti;

import java.util.ArrayList;

public class Joukkue {

	ArrayList<Pelaaja> pelaajat = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joukkue helmarit = new Joukkue();

		Joukkue huuhkajat = new Joukkue();

		Pelaaja anna = new Pelaaja("Anna", "anna@example.com");

		Pelaaja katarina = new Pelaaja("Katarina", "katarina@example.com");

		Pelaaja elli = new Pelaaja("Elli", "elli@example.com");

		Pelaaja joel = new Pelaaja("Joel", "joel@example.com");

		Pelaaja teemu = new Pelaaja("Teemu", "teemu@example.com");

		helmarit.lisaaPelaaja(anna);

		helmarit.lisaaPelaaja(katarina);

		helmarit.lisaaPelaaja(elli);

		huuhkajat.lisaaPelaaja(teemu);

		huuhkajat.lisaaPelaaja(joel);

		System.out.println("=== Ensimmäinen joukkue ===");

		System.out.println(helmarit);

		System.out.println("=== Toinen joukkue ===");

		System.out.println(huuhkajat);

		// Muutetaan Joelin sähköpostiosoite:

		joel.setEmail("joel@palloliitto.fi");

		// Tulostetaan uudella sähköpostiosoitteella:

		System.out.println("=== Toinen joukkue ===");

		System.out.println(huuhkajat);

	}

	public Joukkue() {

	}

	public void lisaaPelaaja(Pelaaja pelaaja) {
		pelaajat.add(pelaaja);

	}

	public String toString() {

		String temp = "";

		for (Pelaaja pelaaja : pelaajat) {
			temp += pelaaja + "\n";
		}

		return temp;
	}

}
