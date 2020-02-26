package viikko5.perusteet.th;

import java.util.Scanner;

public class KirjaOhjelma {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna nimi: ");
		String name = scanner.nextLine();

		System.out.print("Anna isbn: ");
		String isbn = scanner.nextLine();
		System.out.print("Anna hinta: ");
		double price = scanner.nextDouble();
		System.out.print("Anna julkaisuvuosi: ");
		int yearOfPublish = scanner.nextInt();

		Kirja kirja = new Kirja();

		kirja.setName(name);
		kirja.setIsbn(isbn);
		kirja.setPrice(price);
		kirja.setYearOfPublish(yearOfPublish);

		System.out.println(kirja.toString());

		Kirja kirja2 = new Kirja(name, isbn, price, yearOfPublish);

	}

}
