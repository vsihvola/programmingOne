package viikko3.perusteet.th;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

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

		System.out.println(); // Tyhjä rivi tulosteeseen

		System.out.print("Mistä? ");
		int mista = lukija.nextInt();

		System.out.print("Mihin? ");
		int mihin = lukija.nextInt();

		lukija.close();

		// TODO: Täydennä koodia tehtävänannon mukaisesti

		while (mista <= mihin) {
			System.out.println(luvut.get(mista));
			++mista;
		}

	}
}