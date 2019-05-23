package com.my.pojo;

import java.time.LocalDate;

public class Person {
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private Address address;

	public String getFirstName() {
		return firstName;
	}

	public Person() {
		super();
		
	}

	public Person(String firstName, String lastName, LocalDate dob, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\nPerson [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", address=" + address
				+ "]";
	}

}
