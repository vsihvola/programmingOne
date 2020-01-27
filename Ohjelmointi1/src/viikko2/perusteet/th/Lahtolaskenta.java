package viikko2.perusteet.th;

public class Lahtolaskenta {

	public static void main(String[] args) {
		int lahtoNumero = 100;

		while (lahtoNumero > 0) {
			if (lahtoNumero % 3 == 0) {

				--lahtoNumero;
			} else {
				System.out.println(lahtoNumero);
				--lahtoNumero;
			}
		}

	}

}
