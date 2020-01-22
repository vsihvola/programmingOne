package viikko1.perusteet.th;

import java.util.Scanner;

public class Puoluetuki {

	public static void main(String[] args) {
		System.out.print("Anna kansanedustajien lukumäärä:");
		Scanner scanner1 = new Scanner(System.in);
		int kansanedustajat = scanner1.nextInt();
		int puoluetuki = kansanedustajat * 148175;
		System.out.println("Puoluetuen määrä on " + puoluetuki + " euroa");

		scanner1.close();
	}
}
