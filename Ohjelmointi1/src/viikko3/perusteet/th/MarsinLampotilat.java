package viikko3.perusteet.th;

import java.util.Scanner;

public class MarsinLampotilat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] measure = new int[10];
		int index = 0;
		int temp = 0;

		double average = 0;
		int min = 0;
		int max = 0;

		while (temp < measure.length) {
			System.out.print("Syötä mittaus " + Math.addExact(temp, 1) + "/10: ");
			index = scanner.nextInt();
			if (index > -140 && index < 21) {
				measure[temp] = index;
				average += index;
				++temp;

				if (min > index) {
					min = index;
				} else if (max < index) {
					max = index;
				}

			} else {
				System.out.println("Anna lämpötila väliltä -140 - +20!");
			}
		}

		System.out.println("\nMittausten keskiarvo: " + average / 10);
		System.out.println("Pienin mittaustulos: " + min);
		System.out.println("Suurin mittaustulos: " + max);

	}

}
