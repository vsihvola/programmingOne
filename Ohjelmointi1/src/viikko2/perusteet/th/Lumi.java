package viikko2.perusteet.th;

import java.util.Scanner;

public class Lumi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amountOfNames = 0;
		int amountOfLumi = 0;
		boolean loppu = false;
		String temp = "";

		while (loppu == false) {
			System.out.print("Anna nimi: ");
			temp = scanner.nextLine();
			if (temp.equalsIgnoreCase("lumi")) {
				++amountOfLumi;
			} else if (temp.equals("LOPPU")) {
				loppu = true;
				break;
			}
			++amountOfNames;
		}

		System.out.println("Nimiä oli " + amountOfNames + " kappaletta.");
		System.out.println("Nimi Lumi esiintyi " + amountOfLumi + " kertaa.");

	}

}
