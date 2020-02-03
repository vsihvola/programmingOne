package viikko3.perusteet.th;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListanLukujenSumma {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		List<Integer> luvut = new ArrayList<Integer>();

		System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa):");

		while (true) {
			int syote = lukija.nextInt();

			if (syote == -1) {
				break;
			} else {
				luvut.add(syote);
			}
		}
		lukija.close();

		System.out.println(); // Tyhjä rivi tulosteeseen

		// TODO: Täydennä koodia tehtävänannon mukaisesti
		int summaIndex = 0;

		for (int luku : luvut) {
			summaIndex += luku;
		}

		System.out.println("Summa: " + summaIndex);
	}
}