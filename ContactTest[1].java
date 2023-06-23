package moduleThreeMilestoneTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import moduleThreeMilestone.Contact;

class ContactTest {
	/* Test Contact */
	@Test
	void testContact() {
		Contact contact = new Contact ("12345", "Deebo", "Samuel","1234567890","123 Main St.");
		
		assertTrue(contact.getContactID().equals("12345"));
		assertTrue(contact.getFirstName().equals("Deebo"));
		assertTrue(contact.getLastName().equals("Samuel"));
		assertTrue(contact.getPhoneNum().equals("1234567890"));
		assertTrue(contact.getAddress().equals("123 Main St."));
		
	}
	    /* Test Contact ID length, too long */
	    @Test
	void testContactIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345111111", "Deebo", "Samuel","1234567890", "123Main St.");
		});    }
		/* Test Contact First Name, too long */
		@Test
		void testContactFirstNameToLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("12345", "Tyshun Deebo", "Samuel","1234567890", "123Main St.");
		});    }
			/* Test Contact Last Name, too long */
		@Test
			void testContactLastNameToLong() {
				Assertions.assertThrows(IllegalArgumentException.class, () -> {
					new Contact("12345", "Deebo", "Beast Samuel","1234567890", "123Main St.");
		});    }
			/* Test Contact Phone Number, too long */
		@Test
		     void testContactPhoneNumberToLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("12345", "Deebo", "Samuel","12345678900", "123 MainSt.");
				
		});    }
		    /* Test Contact Phone Number, too short */
		@Test
		void testContactPhoneNumberToShort() {
			Assertions.assertThrows(IllegalArgumentException.class, () ->{
				new Contact ("12345", "Deebo", "Samuel", "123455", "123 MainSt.");
				
		});    }
		/* Test Contact Address, too long */
		@Test
		void testContactAddressToLong() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("12345", "Deebo", "Samuel","1234567890","11111111111222222223333333 Main St.");
				
		});    }
		
		/* Testing for Contact ID null value */
		@Test
		void testContactIDIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact(null, "Deebo", "Samuel","1234567890", "123 MainSt.");
				
		});    }
		
		/* Testing for First Name null value */
		@Test
		void testContactFirstNameIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("12345", null, "Samuel","1234567890", "123 MainSt.");
				
		});    }
		
		/* Testing for Last Name null value */
		@Test
		void testContactLastNameIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("12345", "Deebo", null,"1234567890", "123 Main St.");
				
		});    }
		
		/* Testing for Phone Number null value */
		@Test
		void testContactPhoneNumberIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("12345", "Deebo", "Samuel", null, "123 Main St.");
				
		});    }
		
		/* Testing for Address null value */
		@Test
		void testContactAddressIsNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Contact("12345", "Deebo", "Samuel", "1234567890", null);
				
		});    }
					
					
	
	}