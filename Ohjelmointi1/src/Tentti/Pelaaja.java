package Tentti;

public class Pelaaja {

	private String nimi;
	private String email;

	public Pelaaja(String nimi, String email) {
		this.nimi = nimi;
		this.email = email;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return this.nimi + " (" + this.email + ")";
	}

}
