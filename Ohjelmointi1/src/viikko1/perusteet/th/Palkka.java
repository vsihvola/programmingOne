package viikko1.perusteet.th;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Anna palkka: ");
		int palkka = scanner.nextInt();
		System.out.print("Anna veroprosentti: ");
		int veroprosentti = scanner.nextInt();
		System.out.print("Anna ikä: ");
		int ika = scanner.nextInt();

		double veroOsuus = palkka * veroprosentti / 100.0;
		double elakeMaksu = 0;

		if (ika > 52 && ika < 63) {
			elakeMaksu = palkka * 0.0825;
		} else {
			elakeMaksu = palkka * 0.0675;
		}

		double vakuutusMaksu = palkka * 0.015;
		double nettopalkka = palkka - elakeMaksu - vakuutusMaksu - veroOsuus;
		DecimalFormat df = new DecimalFormat("###,###.00");

		System.out.println("\nBruttopalkka " + palkka);
		System.out.println("Veron osuus " + df.format(veroOsuus));
		System.out.println("Työeläkevakuutusmaksun osuus " + df.format(elakeMaksu));
		System.out.println("Työttömyysvakuutuksen osuus " + df.format(vakuutusMaksu));
		System.out.println("Käteen jää " + df.format(nettopalkka));
		scanner.close();
	}

}
