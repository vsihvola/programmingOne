package viikko5.perusteet.th;

import java.util.Scanner;

public class RemonttiOhjelma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Remontti remontti = new Remontti();

		System.out.print("Anna vuosi: ");
		int year = scanner.nextInt();
		remontti.setYear(year);
		if (remontti.setYear(year) == true) {
			scanner.nextLine();
			System.out.print("Anna kuvaus: ");
			String desc = scanner.nextLine();
			remontti.setDesc(desc);
			System.out.println(remontti.toString());

		} else {
			System.out.println("Vuosi ei voi olla tulevaisuudessa");
		}

	}

}
