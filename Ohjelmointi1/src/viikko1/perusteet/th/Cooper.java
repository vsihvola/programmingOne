package viikko1.perusteet.th;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cooper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Anna juostu matka: ");
		int matka = scanner.nextInt();
		DecimalFormat df = new DecimalFormat("0");

		System.out.print("Kokonaisia 400 metrin kierroksia oli " + df.format(matka / 400));
		scanner.close();
	}

}
