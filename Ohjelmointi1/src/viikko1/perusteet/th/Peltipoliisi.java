package viikko1.perusteet.th;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Peltipoliisi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.00");
		int peltipoliisiRajoitus = 80;
		System.out.print("Anna nopeutesi: ");
		int nopeus = scanner.nextInt();
		int ylinopeus = nopeus - peltipoliisiRajoitus;

		if (ylinopeus > 20) {
			System.out.println("Päiväsakko");
			System.out.print("Anna nettokuukausitulosi: ");
			double tulot = scanner.nextDouble();

			double paivaSakko = (tulot - 255) / 60;
			if (paivaSakko < 6) {
				paivaSakko = 6;
			}
			System.out.println("Päiväsakon määrä on " + df.format(paivaSakko) + " euroa");
			scanner.close();
		} else if (ylinopeus < 20 && ylinopeus > 0) {
			System.out.print("Rikesakko");
		} else {
			System.out.print("Ei sakkoa");
		}

	}
}
