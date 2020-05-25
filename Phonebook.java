import java.util.Scanner;
import java.util.List;

public class Phonebook {

	private static final Scanner scanner = new Scanner(System.in);
	private static boolean running = true;

	public static void main(String[] args) {
		for(int i = 0; i < 50000000; i++) {
			String firstName = Randomizer.getFirstName();
			String lastName = Randomizer.getLastName();
			String phoneNumber = Randomizer.getPhoneNumber();

			Contact contact = new Contact(firstName, lastName, phoneNumber);
			ContactList.addContact(contact);
		}

		int size = ContactList.getContacts().size();
		System.out.println("Total: " +  size);

		System.out.println("Welcome to phonebook");

		String command;

		while(running) {
			System.out.println("(s) Search");
			System.out.println("(a) Add contact");
			System.out.println("(l) List contacts");
			System.out.println("(e) Edit contact");
			System.out.println("(d) Delete contact");
			System.out.println("(q) Quit the application");

			command = scanner.nextLine();
			switch(command.toLowerCase()) {
				case "s":
					searchContact();
					break;
				case "a":
					addContact();
					break;
				case "l":
					listContacts();
					break;
				case "e":
					editContact();
					break;
				case "d":
					deleteContact();
					break;
				case "q":
					running = false;
					break;
				default:
					System.out.println("Unknown command");
			}
		}
	}

	private static void searchContact() {
		System.out.print("Name: ");
		String fullName = scanner.nextLine();
		
		long start = System.nanoTime();
		Contact contact = ContactList.getByFullName(fullName);
		long end = System.nanoTime();

		if(contact == null) {
			System.out.println("404 Not found (" + "Time elapsed: " + (end - start) + ")");
		}else {
			System.out.println(contact + " (" + "Time elapsed: " + (end - start) + ")");
		}
	}

	private static void addContact() {
		System.out.print("First name: ");
		String firstName = scanner.nextLine();
		
		System.out.print("Last name: ");
		String lastName = scanner.nextLine();

		System.out.print("Phone number: ");
		String phoneNumber = scanner.nextLine();

		Contact contact = new Contact(firstName, lastName, phoneNumber);
		ContactList.addContact(contact);
	}

	private static void listContacts() {
		// List list = ContactList.getContacts();
		// System.out.println(list.get(list.size() - 1));
		// for(int i = list.size() - 1; i >= list.size() - 11; i--) {
			// System.out.println(list.get(i));
		// }
	}

	private static void editContact() {
		//TODO
	}

	private static void deleteContact() {
		//TODO
	}
}