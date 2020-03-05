package viikko6.perusteet.th;

public class Contact {

	private String name;
	private String email;
	private String phone;

	public Contact(String name, String email, String phone) {

		this.name = name;
		this.email = email;
		this.phone = phone;

	}

	@Override
	public boolean equals(Object toinen) {
		return this.toString().equals(toinen.toString());

	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		// Haluttu muoto: "Maija Meikäläinen (email: foo@bar.fi, phone: 5555)"
		return this.name + " (email: " + this.email + ", phone: " + this.phone + ")";
	}
}