package viikko4.perusteet.th;

import java.time.LocalDate;
import java.util.Scanner;

public class Erapaiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Anna laskun päivämäärä (vvvv-kk-pp): ");
		String date = scanner.nextLine();
		LocalDate local = LocalDate.parse(date);

		System.out.println("Eräpäivä on " + local.plusDays(14));
	}

}
