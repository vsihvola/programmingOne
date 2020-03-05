package viikko6.perusteet.th;

public class Kello {

	private int tunnit;
	private int minuutit;

	public Kello(int tunnit, int minuutit) {

		if (tunnit >= 0 && tunnit <= 23) {
			this.tunnit = tunnit;
		} else {
			throw new IllegalArgumentException("Virheellinen kellonaika");
		}

		if (minuutit >= 0 && minuutit <= 59) {
			this.minuutit = minuutit;
		} else {
			throw new IllegalArgumentException("Virheellinen kellonaika");
		}

	}

	public void lisaaMinuutit(int mins) {
		int temp = this.minuutit + mins;

		if (temp >= 60) {
			int overTemp = temp - 60;
			this.minuutit = overTemp;
			if (this.tunnit > 22) {
				this.tunnit = 0;
			} else {
				this.tunnit += 1;
			}
		} else {
			this.minuutit += mins;
		}

	}

	public String toString() {
		String formatted = String.format("%02d", this.minuutit);
		return this.tunnit + ":" + formatted;

	}

	public int getTunnit() {
		return tunnit;
	}

	public void setTunnit(int tunnit) {
		if (tunnit >= 0 && tunnit <= 23) {
			this.tunnit = tunnit;
		} else {
			throw new IllegalArgumentException("Virheellinen kellonaika");
		}
	}

	public int getMinuutit() {
		return minuutit;
	}

	public void setMinuutit(int minuutit) {
		if (minuutit >= 0 && minuutit <= 59) {
			this.minuutit = minuutit;
		} else {
			throw new IllegalArgumentException("Virheellinen kellonaika");
		}
	}

}
