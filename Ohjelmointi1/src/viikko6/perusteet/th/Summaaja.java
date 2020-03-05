package viikko6.perusteet.th;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Summaaja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int num;
		boolean check = true;

		while (check = true) {
			System.out.print("Syötä seuraava luku (0 lopettaa): ");
			try {

				num = scanner.nextInt();
				if (num != 0) {
					sum += num;
				} else {
					break;

				}

			} catch (InputMismatchException e) {
				System.out.println("Virheellinen syöte!");
				scanner.nextLine();

			}
		}

		System.out.println("Lukujen summa on " + sum + ".");

	}

}
