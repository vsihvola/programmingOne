package Tentti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HakuListalta {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<String> list = new ArrayList<>();
		List<String> osumat = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			System.out.print("Kirjoita sana " + i + "/5: ");
			list.add(scanner.nextLine());
		}

		System.out.println();
		System.out.print("Anna etsittävä termi: ");

		String searchFor = scanner.nextLine();

		System.out.println();

		for (String temp : list) {
			if (temp.contains(searchFor)) {
				osumat.add(temp);
			}
		}

		System.out.println("Löytyi " + osumat.size() + " osumaa:");

		for (String sysout : osumat) {
			System.out.println(sysout);
		}

		scanner.close();

	}

}
