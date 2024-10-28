package com.tutorial.RahulShettyAcademy.com.tutorial.RahulShettyAcademy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class ContactService {
	private static int uniqueContactID = 100;
	//Creates a new HashMap for contacts
	private static Map< Integer, Contact> contactIndex = new
			HashMap<>();
	//Adds to the contactIndex new contact info
	public Map<Integer, Contact> addContact(Contact contact){
		uniqueContactID++;
		contactIndex.put(uniqueContactID, contact);
		return contactIndex;
	}
	//Deletes from the contactIndex
	public Map<Integer, Contact> deleteContact(String contactID){
		Iterator id = contactIndex.entrySet().iterator();
		while (id.hasNext()){
			Map.Entry<Integer, Contact> entry =
					(Map.Entry<Integer, Contact>) id.next();
			if (entry.getValue().getContactID().equals(contactID))
			{
				id.remove();
			}
		}
		return contactIndex;
	}
	//Updates contact info to the contact Index
	public Map<Integer, Contact> updateContact(String contactID,
			String firstName, String lastName, String phone, String address){
		Iterator id = contactIndex.entrySet().iterator();
		while (id.hasNext()) {
			Map.Entry<Integer, Contact> entry =
					(Map.Entry<Integer, Contact>) id.next();
			if (entry.getValue().getContactID().equals(contactID))
			{
				entry.getValue().setFirstName(firstName);
				entry.getValue().setLastName(lastName);
				entry.getValue().setPhone(phone);
				entry.getValue().setAddress(address);
			}
		}
		return contactIndex;
	}



}
