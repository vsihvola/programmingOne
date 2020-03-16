package testikoe;

import java.text.DecimalFormat;

public class Tankkaus {

	private String date;
	private double amount;
	private double litraPrice;

	public Tankkaus() {

	}

	public Tankkaus(String date, double amount, double litraPrice) {
		this.date = date;
		this.amount = amount;
		this.litraPrice = litraPrice;
	}

	public double laskeTankkaus() {
		return this.amount * this.litraPrice;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("00.00");
		return "Päivä: " + this.date + "\n" + "Maksettu: " + df.format(this.laskeTankkaus());

	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getLitraPrice() {
		return litraPrice;
	}

	public void setLitraPrice(double litraPrice) {
		this.litraPrice = litraPrice;
	}
}
