package viikko2.perusteet.th;

import java.util.Scanner;

public class Lento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna lennon numero: ");
		String flightNumber = scanner.nextLine();
		int number = Integer.parseInt(flightNumber.substring(2, 3));
		if (flightNumber.contains("AY")) {
			if (number == 1) {
				System.out.println("Kaukolento");

			} else if (number > 1 && number < 7) {
				System.out.println("Kotimaan lento");
			} else {
				System.out.println("Venäjän lento");
			}
		} else {
			System.out.println("Ei ole Finnairin lento");
		}

	}

}
