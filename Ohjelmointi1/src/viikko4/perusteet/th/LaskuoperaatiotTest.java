package viikko4.perusteet.th;

public class LaskuoperaatiotTest extends Laskuoperaatiot {
	public static void main(String[] args) {
		double eka = 9.0;
		double toka = 3.0;

		System.out.println("Suoritetaan testi arvoilla " + eka + " ja " + toka + ":\n");

		double summa = Laskuoperaatiot.summa(eka, toka);
		System.out.println(eka + " + " + toka + " = " + summa);

		double erotus = Laskuoperaatiot.erotus(eka, toka);
		System.out.println(eka + " - " + toka + " = " + erotus);

	}

}
