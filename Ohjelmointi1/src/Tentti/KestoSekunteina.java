package Tentti;

import java.util.Scanner;

public class KestoSekunteina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Anna tunnit: ");
		int tunnit = scanner.nextInt();
		System.out.print("Anna minuutit: ");
		int minuutit = scanner.nextInt();
		System.out.print("Anna sekunnit: ");
		int sekunnit = scanner.nextInt();

		System.out.println("Yhteensä " + kestoSekunteina(tunnit, minuutit, sekunnit) + " sekuntia.");

	}

	private static int kestoSekunteina(int tunnit, int minuutit, int sekunnit) {
		return (tunnit * 60 * 60) + (minuutit * 60) + sekunnit;

	}

}
