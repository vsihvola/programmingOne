package viikko2.perusteet.th;

import java.util.Scanner;

public class AlkuTulostin {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Kirjoita sana: ");
		String theWord = scanner.nextLine();
		String output = "";
		for (int i = 0; i < theWord.length(); i++) {
			output += theWord.charAt(i);
			System.out.println(output);

		}

	}

}
