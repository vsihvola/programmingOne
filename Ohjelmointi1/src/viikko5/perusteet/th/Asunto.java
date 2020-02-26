package viikko5.perusteet.th;

import java.text.DecimalFormat;

public class Asunto {

	private String type;
	private String address;
	private double area;
	private double price;
	private String desc;

	public Asunto(String type, String address, double area, double price, String desc) {
		this.setType(type);
		this.setAddress(address);
		this.setArea(area);
		this.setPrice(price);
		this.setDesc(desc);
	}

	public Asunto() {

	}

	public void setType(String type) {
		this.type = type;

	}

	public String getType() {
		return this.type;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("###.00");

		return System.lineSeparator() + "Tyyppi: " + this.type + "\nOsoite: " + this.address + "\nPinta-ala: "
				+ df.format(this.area) + "\nHinta: " + df.format(this.price) + " euroa" + "\nKuvaus: " + this.desc;
	}

}
