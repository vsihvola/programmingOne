package viikko6.perusteet.th;

import java.util.Scanner;

public class KysyUudestaan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int number;
		boolean check = false;

		while (check == false) {
			try {
				System.out.println("Syötä kokonaisluku: ");
				number = Integer.parseInt(scanner.nextLine());
				System.out.println("Syötit luvun " + number + ".");
				check = true;
			} catch (NumberFormatException e) {
				System.out.println("Virheellinen luku!\n");
				check = false;
			}
		}

	}

}
