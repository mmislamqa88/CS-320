package com.tutorial.RahulShettyAcademy.com.tutorial.RahulShettyAcademy;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

public class ContactServiceTest {
	
	@Test
	public void testAdd(){
	ContactService cs = new ContactService();
	Contact t1 = new Contact("T1", "John", "Segura","123456", "321 Main Street");
	assertEquals(true, cs.addContact(t1));
	}
	@Test
	public void testDelete(){
	ContactService cs = new ContactService();
	Contact t1 = new Contact("T1", "John", "Segura", "123456", "321 MainStreet 12345");
	Contact t2 = new Contact("T2", "Jennifer", "Smith", "1234567", "321 Main Street 12345");
	Contact t3 = new Contact("T3", "James", "Chase", "12345678", "321 Main Street 12345");
	cs.addContact(t1);
	cs.addContact(t2);
	cs.addContact(t3);
	assertEquals(false, cs.deleteContact("T002"));
	assertEquals(false, cs.deleteContact("T000"));
	assertEquals(false, cs.deleteContact("T002"));
	}
	@Test
	public void testUpdate() {
	ContactService cs = new ContactService();
	Contact t1 = new Contact("T1", "John", "Segura", "123456", "321 Main Street 123456");
	Contact t2 = new Contact("T2", "Jennifer", "Smith", "1234567", "321 Main Street 1234567");
	Contact t3 = new Contact("T3", "James", "Chase", "12345678", "321 Main Street 12345678");
	cs.addContact(t1);
	cs.addContact(t2);
	cs.addContact(t3);
	assertEquals(true, cs.updateContact("T2", "Jennifer", "Smith",
	"1234567", "321 Main Street 1234567"));
	assertEquals(true, cs.updateContact("T3", "James", "Chase", "12345678", "321 Main Street 12345678"));
	}
	

}
