package viikko5.perusteet.th;

import java.time.LocalDate;

public class Remontti {

	private int year;
	private String desc;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getYear() {
		return year;
	}

	public boolean setYear(int year) {
		LocalDate ld = LocalDate.now();

		if (year > ld.getYear()) {
			return false;
		} else {
			this.year = year;
			return true;
		}

	}

	public Remontti() {

	}

	public String toString() {
		return "Vuonna " + getYear() + " tehtiin remontti " + getDesc();
	}

}
