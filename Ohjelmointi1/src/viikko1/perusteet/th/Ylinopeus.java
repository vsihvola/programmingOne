package viikko1.perusteet.th;

import java.util.Scanner;

public class Ylinopeus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kerro nopeus: ");
		int nopeus = scanner.nextInt();

		if (nopeus > 120) {
			System.out.println("Ylinopeussakko!");

		} else {

		}

		scanner.close();

	}

}