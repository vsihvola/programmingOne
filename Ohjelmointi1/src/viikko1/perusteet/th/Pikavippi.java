package viikko1.perusteet.th;

import java.util.Scanner;

public class Pikavippi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna pikavipin määrä euroissa: ");
		int pikavippiMäärä = scanner.nextInt();
		System.out.print("Moneksiko vuodeksi raha halutaan (1 tai 2): ");
		int vuosiMäärä = scanner.nextInt();

		System.out.print("Lainakorko kahdesta yleisestä (41% tai 37%): ");
		int lainaKorko = scanner.nextInt();
		double maksu = pikavippiMäärä * vuosiMäärä / 100 * lainaKorko;

		System.out.print("Lainatut rahat maksavat eli korko " + maksu);
		scanner.close();

	}

}
