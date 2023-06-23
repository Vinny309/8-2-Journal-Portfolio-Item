package moduleThreeMilestone;

import java.util.ArrayList;

public class ContactService {
	/* Container for a list of contacts */
	private ArrayList<Contact> contacts;
	
	/* Default constructor */
	public ContactService() {
		contacts = new ArrayList<>();
	}
	/*Method to adds contacts to the list if the contact does not exist */
	public boolean add(Contact contact) {
		boolean existingContact = false;
		for (Contact c : contacts) {
			if (c.equals(contact)) {
				existingContact = true;
			}
		}
		if (!existingContact) {
			contacts.add(contact);
			System.out.println("Contact Added");
			return true;
		} else {
			System.out.println("Contact already listed");
			return false;
		}
		
	}
	/* Method to remove a contact on the Contact List if the contact exists */
	public boolean remove(String contactID) {
		for (Contact c : contacts) {
			if (c.getContactID().equals(contactID)) {
				contacts.remove(c);
				System.out.println("Contact Removed");
				return true;
			}
		}
		// Statement for a non existing contact
		System.out.println("Contact not listed");
		return false;
	}
	/* Method to update a contact on the Contact List */
	public boolean update(String contactID, String firstName, String lastName,
			String phoneNum, String Address) {
		for (Contact c : contacts) {
			if (c.getContactID().equals(contactID)) {
				if (!firstName.equals(""))
					c.setFirstName(firstName);
				if (!lastName.equals(""))
					c.setLastName(lastName);
				if (!phoneNum.equals(""))
					c.setAddress(phoneNum);
				if (!Address.equals(""))
					c.setAddress(Address);
				System.out.println("Contact Updated");
				return true;
			}
		}
		// Statement for a non existing contact
		System.out.println("Contact not listed");
		return false;
	}
}