package testikoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LintuOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<Lintu> linnut = new ArrayList<>();

		while (true) {
			System.out.println("1 = Lisää uusi merkintä\r\n" + "2 = Näytä kaikki merkinnät\r\n" + "0 = Lopeta");
			System.out.print("Anna valintasi: ");
			int choose = Integer.parseInt(scanner.nextLine());

			if (choose == 0) {
				break;
			} else if (choose == 1) {
				System.out.print("Anna laji: ");
				String laji = scanner.nextLine();

				boolean check = false;

				// Tarkastetaan löytyykö kyseinen laji listalta
				for (Lintu lintu : linnut) {
					if (laji.equals(lintu.getLaji())) {

						lintu.increaseAmount();
						check = true;
					}
				}

				if (check == false) {
					Lintu havainto = new Lintu(laji);
					linnut.add(havainto);
				}

				// kysy laji
				// kasvata havaintoja tai lisää uusi tieto

			} else if (choose == 2) {
				// TUlosta kaikki
				// Laji: Talitintti
				// Maara: 3
				for (Lintu lintu : linnut) {
					System.out.println("Laji: " + lintu.getLaji());
					System.out.println("Maara: " + lintu.getMaara());
					System.out.println();
				}

			}
			System.out.println();
		}

	}

}

class Lintu {
	private String laji;
	private int amount;

	public Lintu(String laji) {
		this.laji = laji;
		this.amount = 1;

	}

	public void increaseAmount() {
		this.amount += 1;
	}

	public int getMaara() {
		return this.amount;
	}

	@Override
	public String toString() {
		return this.laji + "(" + this.amount + ")";
	}

	public String getLaji() {
		return this.laji;
	}
}
