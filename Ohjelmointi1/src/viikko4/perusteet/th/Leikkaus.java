package viikko4.perusteet.th;

import java.util.ArrayList;
import java.util.List;

public class Leikkaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> aList = new ArrayList<>();
		List<Integer> bList = new ArrayList<>();

		System.out.println(laskeLeikkaus(aList, bList));

	}

	public static List<Integer> laskeLeikkaus(List<Integer> aList, List<Integer> bList) {

		List<Integer> tempList1 = new ArrayList<>(aList);
		List<Integer> tempList2 = new ArrayList<>(bList);

		tempList1.retainAll(tempList2);

		return tempList1;
	}

}
