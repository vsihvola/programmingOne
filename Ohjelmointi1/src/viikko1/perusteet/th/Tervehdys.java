package viikko1.perusteet.th;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Tervehdys {

	public static void main(String[] args) {
		LocalTime nykyhetki = LocalTime.now();
		int tunnit = nykyhetki.getHour();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");

		if (tunnit > 6 && tunnit < 10) {
			System.out.println("Suoritetaan koodi kello " + nykyhetki.format(myFormatObj) + "...");
			System.out.println("Hyvää huomenta!");
		} else if (tunnit > 9 && tunnit < 17) {
			System.out.println("Suoritetaan koodi kello " + nykyhetki.format(myFormatObj) + "...");
			System.out.println("Hyvää päivää!");
		} else if (tunnit > 16 && tunnit < 22) {
			System.out.println("Suoritetaan koodi kello " + nykyhetki.format(myFormatObj) + "...");
			System.out.println("Hyvää iltaa!");
		} else {
			System.out.println("Suoritetaan koodi kello " + nykyhetki.format(myFormatObj) + "...");
			System.out.println("Hyvää yötä!");
		}
	}

}
