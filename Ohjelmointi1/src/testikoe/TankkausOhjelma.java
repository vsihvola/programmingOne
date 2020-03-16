package testikoe;

import java.util.Scanner;

public class TankkausOhjelma {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna päivämäärä: ");
		String date = scanner.nextLine();
		System.out.print("Anna tankattu määrä: ");
		double amount = scanner.nextDouble();
		System.out.print("Anna litrahinta: ");
		double price = scanner.nextDouble();

		Tankkaus tankkaus1 = new Tankkaus(date, amount, price);

		System.out.println(tankkaus1);

	}

}
