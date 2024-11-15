package com.example.accessingmongodbdatarest.document;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "Person")
public class Person {

	@Id 
	private String id;
	private String dni;
	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private String emailAddress;
	private String cellNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createAt;
	
	
	public Person(String id, String dni, String firstName, String lastName, String age, String address,
			String emailAddress, String cellNumber, Date createAt) {
		
		this.id = id;
		this.dni = dni;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.emailAddress = emailAddress;
		this.cellNumber = cellNumber;
		this.createAt = createAt;
	}
	

	public Person() {
		
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

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	

	public String getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", dni=" + dni + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", address=" + address + ", emailAddress=" + emailAddress + ", cellNumber=" + cellNumber
				+ ", createAt=" + createAt + "]";
	}

	
	
	
	
}
