package viikko2.perusteet.th;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tuotteet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Anna tuotenumero: ");
		int productNumber = scanner.nextInt();

		System.out.print("Anna tuotteen nimi: ");
		scanner.nextLine();
		String productName = scanner.nextLine();

		System.out.print("Anna tuotteen hinta: ");
		double productPrice = scanner.nextDouble();

		System.out.print("Anna tuotteen kuvaus: ");
		scanner.nextLine();
		String productDesc = scanner.nextLine();

		productName = productName.trim().toUpperCase();

		DecimalFormat df = new DecimalFormat("###,###.00");

		System.out.println("\nNumero: " + productNumber);
		System.out.println("Nimi: " + productName);
		System.out.println("Hinta: " + df.format(productPrice));

		if (productDesc.length() > 1) {
			productDesc = productDesc.trim();
			System.out.println("Kuvaus: " + productDesc);
		}

	}

}
