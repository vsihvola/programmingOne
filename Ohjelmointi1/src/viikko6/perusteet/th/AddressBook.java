package viikko6.perusteet.th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AddressBook {

	private List<Contact> contacts;

	public AddressBook() {
		this.contacts = new ArrayList<>();
	}

	public boolean add(Contact newContact) {

		if (contacts.contains(newContact)) {
			return false;
		} else {
			this.contacts.add(newContact);
			return true;
		}

	}

	public Contact search(String keyword) {

		for (Contact current : this.contacts) {

			String name = current.getName();
			if (name != null && name.toLowerCase().contains(keyword.toLowerCase())) {

				return current; // palautetaan löytynyt arvo heti

			}
		}
		return null; // palautetaan null, jos ei löytynyt
	}

	@Override
	public String toString() {
		// TODO: toteuta tämä metodi. Metodin tulee muodostaa merkkijono,
		// joka sisältää kaikki yhteystiedot omilla riveillään.

		Comparator<Contact> contactComparator = Comparator.comparing(Contact::getName);

		Collections.sort(contacts, contactComparator);
		for (Contact contact : contacts) {

			System.out.println(contact);
		}

		return null;

	}
}