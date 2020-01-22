package viikko1.perusteet.th;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Maalaus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
		double leveys = scanner.nextDouble();
		double pituus = scanner.nextDouble();
		double korkeus = scanner.nextDouble();

		System.out.print("Paljonko litralla saadaan maalattua neliöitä: ");
		int neliöLitra = scanner.nextInt();

		double tarve = (leveys + leveys + pituus + pituus) * korkeus / neliöLitra;

		DecimalFormat df = new DecimalFormat("0.00");
		System.out.print("Maalin tarve on " + df.format(tarve) + " litraa");
		scanner.close();

	}
}
