package viikko2.perusteet.th;

import java.util.Scanner;

public class Opintopisteet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna lukukausien määrä: ");
		int lukuKaudet = scanner.nextInt();
		int opintopisteet = 0;
		for (int i = 1; i <= lukuKaudet; i++) {
			System.out.print("Anna " + i + ". lukukauden opintopisteesi: ");
			opintopisteet += scanner.nextInt();

		}

		int soFar = lukuKaudet * 30;

		System.out.println("Sinulla pitäisi olla tähän mennessä " + soFar + " opintopistettä.");
		System.out.println("Sinulla on " + opintopisteet + " opintopistettä.");
		if (opintopisteet > soFar) {
			System.out.println("Olet edellä tavoitteesta.");
		} else if (opintopisteet == soFar) {
			System.out.println("Olet tavoitteessa.");
		} else {
			System.out.println("Olet jäljessä tavoitteesta.");
		}
		int tutkinto = 210 - opintopisteet;

		System.out.println("Tutkinnosta puuttuu vielä " + tutkinto + " opintopistettä.");
	}

}
