package Tentti;

import java.util.Scanner;

public class LampotilaVertailu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna ensimmäinen lämpötila: ");
		int first = scanner.nextInt();
		System.out.print("Anna toinen lämpötila: ");
		int second = scanner.nextInt();

		if (first > second) {
			System.out.println("\r\n" + "Suurempi lämpötila on: " + first);
			System.out.println("Pienempi lämpötila on: " + second);
		}

		else {
			System.out.println("\r\n" + "Suurempi lämpötila on: " + second);
			System.out.println("Pienempi lämpötila on: " + first);
		}

	}

}
