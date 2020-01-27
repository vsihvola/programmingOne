package viikko2.perusteet.th;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrikorvaus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int index = 1;
		int kilometres = 0;
		int temp;

		while (index > 0) {
			System.out.print("Anna ajetut kilometrit (0 lopettaa):");
			temp = scanner.nextInt();
			index = temp;
			kilometres = kilometres + temp;

		}
		DecimalFormat df = new DecimalFormat("##.00");

		double korvaus = kilometres * 0.43;
		System.out.println("Yhteensä " + kilometres + " kilometriä");
		System.out.println("Korvaus on " + df.format(korvaus) + " euroa");

	}

}