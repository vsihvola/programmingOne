package viikko1.perusteet.th;

import java.util.Scanner;

public class HeiEtunimi {

	public static void main(String[] args) {
        System.out.print("Syötä etunimi:");
        Scanner scanner1 = new Scanner(System.in);
        String nimi = scanner1.next();
        System.out.println("Hei "+ nimi + "!");
    }

}
