package viikko3.perusteet.th;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBounds {

	public static void main(String[] args) {
		List<String> sanalista = new ArrayList<>();

		sanalista.add("Ensimmäinen");
		sanalista.add("Toinen");

		System.out.println(sanalista.get(2));
	}
}