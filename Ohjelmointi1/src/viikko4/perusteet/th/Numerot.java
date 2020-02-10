package viikko4.perusteet.th;

import java.util.ArrayList;
import java.util.List;

public class Numerot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arvot = new ArrayList<>();
		arvot.add(2);
		arvot.add(4);
		arvot.add(6);
		arvot.add(0);
		arvot.add(15);
		arvot.add(-2);

		System.out.println(pienin(arvot));
		System.out.println(suurin(arvot));
		System.out.println(summa(arvot));
	}

	public static int pienin(List<Integer> arvot) {
		int temp = arvot.get(0);
		for (int i : arvot) {
			if (i < temp) {
				temp = i;
			}
		}
		return temp;

	}

	public static int suurin(List<Integer> arvot) {
		int temp = arvot.get(0);
		for (int i : arvot) {
			if (i > temp) {
				temp = i;
			}
		}
		return temp;

	}

	public static int summa(List<Integer> arvot) {
		int temp = 0;
		for (int i : arvot) {
			temp += i;
		}
		return temp;

	}
}
