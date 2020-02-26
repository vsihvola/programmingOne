package viikko5.perusteet.th;

import java.text.DecimalFormat;

public class Kirja {

	private String name;
	private String isbn;
	private double price;
	private int yearOfPublish;

	public Kirja(String name, String isbn, double price, int yearOfPublish) {

		DecimalFormat df = new DecimalFormat("###,###.00");
		this.name = name;
		this.isbn = isbn;
		this.price = price;
		this.yearOfPublish = yearOfPublish;

		System.out.println("Nimi: " + name + "\nIsbn: " + isbn + "\nHinta: " + df.format(price) + "\nJulkaisuvuosi: "
				+ yearOfPublish);
	}

	public Kirja() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}

	public int getYearOfPublish() {
		return this.yearOfPublish;
	}

	public String toString() {
		return System.lineSeparator() + "Kirja [nimi=" + Kirja.this.getName() + ", isbn=" + Kirja.this.getIsbn()
				+ ", hinta=" + Kirja.this.getPrice() + ", vuosi=" + Kirja.this.getYearOfPublish() + "]"
				+ System.lineSeparator();
	}

}
