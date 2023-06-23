package moduleThreeMilestoneTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import moduleThreeMilestone.Contact;
import moduleThreeMilestone.ContactService;

class ContactServiceTest {
	
	/* Test to add Contacts, true assertions */
	 @Test
	    public void testMethodAddPass() {
		 ContactService cs = new ContactService();
		 Contact c1 = new Contact("Test1", "Steve", "Young", "0987654321","8Victory Pl,");
		 Contact c2 = new Contact("Test2", "Ronnie", "Lott", "1234509876", "49Niner Way");
		 Contact c3 = new Contact("Test3", "Jerry", "Rice", "4567890123", "1GOAT Dr.");
		 
		 assertEquals(true, cs.add(c1));
		 assertEquals(true, cs.add(c2));
		 assertEquals(true, cs.add(c3));
			 
	 }
	 
	 /* Test to add Contacts, with false assertions */
	 @Test
	 public void testMethodAddFail() {
		 ContactService cs = new ContactService();
		 Contact c1 = new Contact("Test1", "Steve", "Young", "0987654321","8Victory Pl,");
		 Contact c2 = new Contact("Test2", "Ronnie", "Lott", "1234509876", "49Niner Way");
		 Contact c3 = new Contact("Test3", "Jerry", "Rice", "4567890123", "1GOAT Dr.");
		 
		 assertEquals(true, cs.add(c1));
		 assertEquals(false, cs.add(c1));
		 assertEquals(true, cs.add(c3));
		 assertEquals(true, cs.add(c2));
	 }
	 
	 /* Test to delete Contacts */
	 @Test
	 public void testMethodDeletePass() {
		 ContactService cs = new ContactService();
		 Contact c1 = new Contact("Test1", "Steve", "Young", "0987654321","8Victory Pl,");
		 Contact c2 = new Contact("Test2", "Ronnie", "Lott", "1234509876", "49Niner Way");
		 Contact c3 = new Contact("Test3", "Jerry", "Rice", "4567890123", "1GOAT Dr.");
		 
		 assertEquals(true, cs.add(c1));
		 assertEquals(true, cs.add(c2));
		 assertEquals(true, cs.add(c3));
		 assertEquals(true, cs.remove("Test1"));
		 assertEquals(true, cs.remove("Test2"));
		 
		 
	 }
	 /* Test to delete Contacts, with false parameters */
	 @Test
	 public void testMethodDeleteFail() {
		 ContactService cs = new ContactService();
		 Contact c1 = new Contact("Test1", "Steve", "Young", "0987654321","8Victory Pl,");
		 Contact c2 = new Contact("Test2", "Ronnie", "Lott", "1234509876", "49Niner Way");
		 Contact c3 = new Contact("Test3", "Jerry", "Rice", "4567890123", "1GOAT Dr.");
		 
		 assertEquals(true, cs.add(c1));
		 assertEquals(true, cs.add(c3));
		 assertEquals(true, cs.add(c2));
		 assertEquals(false, cs.remove("Test4"));
		 assertEquals(true, cs.remove("Test2"));
	 }
	 
	 /* Test the update Contacts */
	 @Test
	 public void testUpdatePass() {
		 ContactService cs = new ContactService();
		 Contact c1 = new Contact("Test1", "Steve", "Young", "0987654321","8Victory Pl,");
		 Contact c2 = new Contact("Test2", "Ronnie", "Lott", "1234509876", "49Niner Way");
		 Contact c3 = new Contact("Test3", "Jerry", "Rice", "4567890123", "1GOAT Dr.");
		 
		 assertEquals(true, cs.add(c1));
		 assertEquals(true, cs.add(c3));
		 assertEquals(true, cs.add(c2));
		 assertEquals(true, cs.update("Test2", "Ronnie", "Lott", "4242424242","1 GOAT Dr."));
		 assertEquals(true, cs.update("Test3", "Jerry", "Rice", "8080808080","49 Niner Way"));
	 }
	 
	 /* Test to update Contacts, with false parameters */
	 @Test
	 public void testUpdateFail() {
		 ContactService cs = new ContactService();
		 Contact c1 = new Contact("Test1", "Steve", "Young", "0987654321","8Victory Pl,");
		 Contact c2 = new Contact("Test2", "Ronnie", "Lott", "1234509876", "49Niner Way");
		 Contact c3 = new Contact("Test3", "Jerry", "Rice", "4567890123", "1GOAT Dr.");
		 
		 assertEquals(true, cs.add(c1));
		 assertEquals(true, cs.add(c3));
		 assertEquals(true, cs.add(c2));
		 assertEquals(false, cs.update("Test4", "Fred", "Warner", "1111100000","123 Any St."));
		 assertEquals(true, cs.update("Test2", "Joe", "Montana", "1616161616","4 Superbowl Ln."));
		 

	 }
	 
}