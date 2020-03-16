package testikoe;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Veto {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna painosi: ");
		double currentWeight = scanner.nextInt();
		double goalWeight = currentWeight * 0.9;
		double erotus = currentWeight - goalWeight;
		double erotusPerViikko = erotus / 7;

		System.out.println("Tavoitepainosi on " + df.format(goalWeight));

		for (int i = 1; i <= 7; i++) {
			double painoViikonlopussa = currentWeight - erotusPerViikko * i;
			System.out.println(i + ". viikonlopussa painon pitäisi olla " + df.format(painoViikonlopussa));

		}

	}

}
