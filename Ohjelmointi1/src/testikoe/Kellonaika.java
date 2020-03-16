package testikoe;

import java.util.Scanner;

public class Kellonaika {

	public static void main(String[] args) {
		String kellonaika = kysyKellonaika();
		boolean check = tarkastaKellonaika(kellonaika);

		if (check == false) {
			System.out.println("Kellonaika on väärin");
		} else {
			System.out.println("Kellonaika on oikein");
		}

	}

	static boolean tarkastaKellonaika(String kellonaika) {

		if (kellonaika.matches("([00-23]{2}):([00-59]{2})")) {
			return true;
		} else {
			return false;
		}

	}

	static String kysyKellonaika() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna kellonaika muodossa tt:mm: ");
		String input = scanner.nextLine();
		return input;

	}

}
