package com.tutorial.RahulShettyAcademy.com.tutorial.RahulShettyAcademy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
public class ContactTest {

	//test ContactID
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890000","Chance O Pants","OPants",
					"7145551234","678 Fake St Springfield");
		});
	}
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact(null,"Chance O Pants","OPants", "7145551234","678 Fake St Springfield");
		});
	}
	//test firstName
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Chance O Pants","OPants",
					"7145551234","678 Fake St Springfield");
		});
	}
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890",null,"OPants", "7145551234","678 Fake St Springfield");
		});
	}
	//test lastName
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Chance","OPantssssss",
					"7145551234","678 Fake St Springfield");
		});
	}
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Chance",null, "7145551234","678 Fake St Springfield");
		});
	}
	//test phoneNumber
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Chance","OPants",
					"7145551234888","678 Fake St Springfield");
		});
	}
	@Test
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Chance","OPants",
					null,"678 Fake St Springfield");
		});
	}
	//test address
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Chance","OPants",
					"7145551234","678 Fake St Springfield CA 9062145667");
		});
	}
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class,() ->{
			new Contact("1234567890","Chance","OPants",
					"7145551234",null);
		});
	}
}


