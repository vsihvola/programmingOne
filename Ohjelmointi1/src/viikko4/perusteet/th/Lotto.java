package viikko4.perusteet.th;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lotto extends Leikkaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> input = new ArrayList<>();
		List<Integer> lineCheck = new ArrayList<>();
		int temp = 0;
		
		System.out.print("Anna oikea rivi (7 numeroa + lisänumero): ");
		while(input.size()<8) {
			
				input.add(scanner.nextInt());
			
		}
		
		System.out.print("Anna tarkastettava rivi (7 numeroa): ");
		while(lineCheck.size()<7) {
			lineCheck.add(scanner.nextInt());
		}
		
		scanner.close();
		int extra = input.get(input.size()-1);
		input.remove(input.size()-1);
		
		List<Integer> rightOnes = Leikkaus.laskeLeikkaus(input, lineCheck);
		
		
		boolean checkExtra = lineCheck.contains(extra);
		
		
		
		
		if (checkExtra == true) {
			System.out.println(System.lineSeparator() + rightOnes.size() + " oikein ja lisänumero.");
		} else {
			System.out.println(System.lineSeparator() + rightOnes.size() + " oikein.") ;
		}

		
		
	
		

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
