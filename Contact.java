package com.tutorial.RahulShettyAcademy.com.tutorial.RahulShettyAcademy;

public class Contact {

	// class Contact variables
	String contactID;
	String firstName;
	String lastName;
	String phone;
	String address;
	// Constructor
	public Contact(String contactID, String firstName, String lastName, String phone, String string ){
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	//Gets and sets for ContactID
	public String getContactID() {
		return contactID;
	}
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	//Verify contactID requirements
	public boolean validateContactID(String contactID) {
		if (contactID.length() <= 10 && contactID != null )
			return true;
		return false;
	}
	//Gets and Sets for FirstName
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}
	//Verify firstName requirements
	public boolean validateFirstName(String firstName) {
		if (firstName.length()<= 10 && firstName != null)
			return true;
		return false;
	}
	//Gets and sets for LastName
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//Verify lastName requirements
	public boolean validateLastName(String lastName) {
		if (lastName.length()<= 10 && lastName != null )
			return true;
		return false;
	}
	//Gets and Sets for Phone
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//Verify phone requirements
	public boolean validatePhone(String phone) {
		if(phone.length()==10 && phone !=null)
			return true;
		return false;
	}
	//Gets and Sets for Address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//Verify address requirements
	public boolean validateAddress(String address) {
		if(address.length()<=30 && address != null)
			return true;
		return false;
	}

}
