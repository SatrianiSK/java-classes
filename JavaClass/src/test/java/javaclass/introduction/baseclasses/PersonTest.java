package javaclass.introduction.baseclasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testAddPhone() {
		Person person = new Person("Juana", 30);
		String phone = "5555";
		
		person.addPhone(phone);
		
		assertEquals(1, person.getPhones().size());
		assertEquals(phone, person.getPhones().get(0));
	}

}
