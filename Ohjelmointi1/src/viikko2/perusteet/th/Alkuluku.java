package viikko2.perusteet.th;

import java.util.Scanner;

public class Alkuluku {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Syötä jokin positiivinen kokonaisluku: ");
		boolean onAlkuluku = false;
		int kokonaisluku = scanner.nextInt();
		int index = 0;
		for (int i = 2; i <= kokonaisluku / 2; i++) {

			if (kokonaisluku % i == 0) {
				onAlkuluku = true;
				break;
			}
		}

		if (!onAlkuluku) {
			System.out.println("Luku " + kokonaisluku + " on alkuluku.");
		} else {
			System.out.println("Luku " + kokonaisluku + " ei ole alkuluku.");
		}
	}

}
