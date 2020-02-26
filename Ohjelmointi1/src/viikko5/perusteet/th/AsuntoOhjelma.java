package viikko5.perusteet.th;

import java.util.Scanner;

public class AsuntoOhjelma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna asunnon tyyppi: ");
		String type = scanner.nextLine();
		System.out.print("Anna osoite: ");
		String address = scanner.nextLine();
		System.out.print("Anna pinta-ala: ");
		double area = scanner.nextDouble();
		System.out.print("Anna hinta: ");
		double price = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Anna kuvaus: ");
		String desc = scanner.nextLine();

		Asunto asunto = new Asunto(type, address, area, price, desc);

		System.out.println(asunto.toString());

	}

}
