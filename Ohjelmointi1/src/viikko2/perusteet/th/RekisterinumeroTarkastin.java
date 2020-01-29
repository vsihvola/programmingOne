package viikko2.perusteet.th;

import java.util.Scanner;

public class RekisterinumeroTarkastin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean end = false;

		String[] splitted;
		String rekisteriNro = "";
		String letters = "";
		int numbers;

		while (end == false) {
			System.out.print("Syötä rekisterinumero (q-kirjain lopettaa): ");
			rekisteriNro = scanner.nextLine();
			splitted = rekisteriNro.split("-");
			letters = splitted[0].toUpperCase();

			if (letters.matches("[A-Z|Ä|Ö|Å]{2,3}") && splitted[1].matches("[0-9]{1,3}")) {
				System.out.println(rekisteriNro + " on kelvollinen rekisterinumero.\n");
			} else if (rekisteriNro.equalsIgnoreCase("q")) {
				end = true;
				break;
			} else {
				System.out.println(rekisteriNro + " ei ole kelvollinen rekisterinumero.\n");
			}

		}

	}

}