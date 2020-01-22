package viikko1.perusteet.th;
import java.util.Scanner;

public class Katsastus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Onko 1=katsastus, 2=jälkitarkastus: ");
		int toiminto = scanner.nextInt();

		int kokonaisSumma = 0;
		if (toiminto == 1) {
			kokonaisSumma = kokonaisSumma + 50;
			System.out.print("Mitataanko päästöt 0=ei, 1=kyllä: ");
			int paastot = scanner.nextInt();
			if (paastot == 1) {
				System.out.print("Onko auto 0=bensa, 1=diesel: ");
				int polttoAine = scanner.nextInt();
				if (polttoAine == 0) {
					kokonaisSumma = kokonaisSumma + 22;
				} else if (polttoAine == 1) {
					kokonaisSumma = kokonaisSumma + 31;
				}
			}
		} else if (toiminto == 2) {
			kokonaisSumma = kokonaisSumma + 30;
		}

		System.out.println("Hinta on " + kokonaisSumma);
		scanner.close();

	}

}
