package moduleThreeMilestone;

public class Contact {
	public class java {

	}
	/* Variables */
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	/* Constructors with parameters */
	public Contact(String contactID, String firstName,
			String lastName,String phoneNum, String address) {
		// Contact ID less than 10 characters
		if(contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		// First name less than 10 characters
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		// Last name less than 10 characters
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		// Phone Number exactly 10 characters
		if(phoneNum == null || phoneNum.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		// Address less than 30 characters
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	// Access and Mutators for variables
	public String getContactID() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}