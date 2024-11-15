package com.example.accessingmongodbdatarest.service;

import java.util.List;

import com.example.accessingmongodbdatarest.document.Person;

public interface PersonService {

    public List<Person> findAll();
	
	public List<Person> findAllConNombreUpperCase();
	
	public List<Person> findAllConNombreUpperCaseRepeat();
	
	public Person findById(String id);
	
	public Person save(Person person);
	
	public boolean delete(Person person);
	
	public Person updateCellNumber(Person person);

	public Person updateAddress(Person person);
	
	public Person updateEmailAddress(Person person);
	
	
}
