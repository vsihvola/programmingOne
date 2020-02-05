package viikko3.perusteet.th;

import java.util.Scanner;

public class MerkkijononPalat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kirjoita lause: ");
		String input = scanner.nextLine();
		String[] splitted = input.split(" ");
		for (int i = 0; i < splitted.length; i++) {
			System.out.println(splitted[i]);
		}

	}

}
