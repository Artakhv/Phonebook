public class ContactList {
	
	private static final java.util.Set contactList = new java.util.HashSet();
	private static final java.util.Map searchMap = new java.util.HashMap();

	public static void addContact(Contact contact) {
		contactList.add(contact);
		searchMap.put(contact.getFirstName() + " " + contact.getLastName(), contact);
	}

	public static java.util.Set getContacts() {
		return contactList;
	}

	public static Contact getByFullName(String fullName) {
		return (Contact) searchMap.get(fullName);
	}

}