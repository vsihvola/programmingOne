package viikko2.perusteet.th;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double index = 1;
		double korvausMaara = 0;
		double temp;

		while (index > 0) {
			System.out.print("Anna työkorvauksen määrä (0 lopettaa):");
			temp = scanner.nextDouble();
			index = temp;
			korvausMaara = korvausMaara + temp;

		}
		DecimalFormat df = new DecimalFormat("0.00");

		int omavastuu = 100;
		double korvaus = korvausMaara * 50 / 100.0 - omavastuu;
		if (korvaus > 2400) {
			korvaus = 2400.0;
			System.out.println("Kotitalousvähennyksen määrä on " + df.format(korvaus) + " euroa");

		} else if (korvaus < 0) {
			korvaus = 0;
			System.out.println("Kotitalousvähennyksen määrä on " + df.format(korvaus) + " euroa");

		} else {
			System.out.println("Kotitalousvähennyksen määrä on " + df.format(korvaus) + " euroa");
		}

	}

}
