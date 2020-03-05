package viikko6.perusteet.th;

import java.util.Scanner;

public class AddressBookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("This is an address book application. Available commands: ");
		System.out.println(" list");
		System.out.println(" help");
		System.out.println(" add <name>, <email>, <phone>");
		System.out.println(" search <name>");
		System.out.println(" exit");

		AddressBook addr = new AddressBook();

		boolean running = true;
		while (running) {
			System.out.print("> ");
			String command = input.next();
			String theRest = input.nextLine().trim();
			String[] parts = theRest.split(",");

			// ... toimintalogiikka

			switch (command) {
			case "help":
				// tulosta ohje
				System.out.println("This is an address book application. Available commands: ");
				System.out.println(" list");
				System.out.println(" help");
				System.out.println(" add <name>, <email>, <phone>");
				System.out.println(" search <name>");
				System.out.println(" exit");
				break;
			case "list":
				// tulosta osoitekirjan koko sisältö
				addr.toString();
				break;
			case "add":
				// käytä annettua nimeä, emailia ja puhelinnumeroa luodaksesi uuden yhteystiedon

				String name = parts[0].trim();
				String email = parts[1].trim();
				String phone = parts[2].trim();
				Contact contact = new Contact(name, email, phone);
				boolean check = addr.add(contact);

				if (check == false) {
					System.out.println("That contact already exists.");
					break;
				} else {
					System.out.println("Added " + contact.toString());
					break;
				}

			case "search":
				// etsi yhteystietoa ja tulosta se

				boolean onko = addr.search(theRest) != null;

				if (onko == true) {
					System.out.println(addr.search(theRest));
				} else {
					System.out.println(theRest + " does not match any contact.");
				}

				break;
			case "exit":
				// poistu ohjelmasta
				running = false;
				System.out.println("Bye!");
				break;
			default:
				// tunnistamaton komento:
				System.out.println("Unknown command");
				break;
			}
		}

	}

}
