package viikko4.perusteet.th;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		List<Integer> input = new ArrayList<>();
		List<Integer> lineCheck = new ArrayList<>();
		int temp;

		System.out.print("Anna oikea rivi (7 numeroa + lisänumero): ");
		while (input.size() < 7) {
			input.add(scanner.nextInt());

		}

		System.out.println("Anna tarkastettava rivi (7 numeroa): ");
		while (lineCheck.size() < 6) {
			lineCheck.add(scanner.nextInt());
		}

		scanner.close();

		System.out.println(laskeLeikkaus(input, lineCheck));

	}

	public static List<Integer> laskeLeikkaus(List<Integer> aList, List<Integer> bList) {

		List<Integer> tempList1 = new ArrayList<>(aList);
		List<Integer> tempList2 = new ArrayList<>(bList);

		List<Integer> extra = tempList1.subList(tempList1.size() - 2, tempList1.size() - 1);

		boolean check = tempList2.contains(extra.get(0));

		tempList1.retainAll(tempList2);

		if (check = true) {
			System.out.println(tempList1.size() + " oikein ja lisänumero.");
		} else {
			System.out.println(tempList1.size() + " oikein.");
		}

		return tempList1;
	}

}
