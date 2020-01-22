package viikko1.perusteet.th;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Juhlat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna juhliin tulevien aikuisten määrä: ");
		double aikuistenMäärä = scanner.nextDouble();
		double pullo = 7;
		double kappaleMäärä = Math.ceil(aikuistenMäärä / pullo);
		DecimalFormat df = new DecimalFormat("0");
		System.out.println("Pulloja tarvitaan " + df.format(kappaleMäärä) + " kappaletta");
		double ylimääräinen = pullo - Math.ceil(aikuistenMäärä % pullo);
		System.out.println("Viimeisestä pullosta jää " + df.format(ylimääräinen) + " lasia");
		scanner.close();
	}

}