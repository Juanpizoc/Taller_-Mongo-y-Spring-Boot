package com.example.accessingmongodbdatarest.controller;

import java.net.URI;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accessingmongodbdatarest.document.Person;
import com.example.accessingmongodbdatarest.service.PersonService;

@RestController
@RequestMapping ("/api/person")
public class PersonControler {

	@Autowired
	PersonService service;
	
	@PostMapping
	public ResponseEntity<Person> crear(@RequestBody Person person){
		
		if(person.getCreateAt()==null) {
			person.setCreateAt(new Date());
		}
		Person personBd = service.save(person);
		
		
		return ResponseEntity.ok(personBd);
		
	}

	@PutMapping
	public ResponseEntity<Person> updateCellNUmber(@RequestBody Person person){
			
		return ResponseEntity.ok(service.updateCellNumber(person));
		
	}
	
	@GetMapping("/all")
    public ResponseEntity<List<Person>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/all-uppercase")
    public ResponseEntity<List<Person>> getAllUpperCase() {
        return ResponseEntity.ok(service.findAllConNombreUpperCase());
    }

    @GetMapping("/all-uppercase-repeat")
    public ResponseEntity<List<Person>> getAllUpperCaseRepeat() {
        return ResponseEntity.ok(service.findAllConNombreUpperCaseRepeat());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getById(@PathVariable String id) {
        Person person = service.findById(id);
        if (person != null) {
            return ResponseEntity.ok(person);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody Person person) {
        boolean isDeleted = service.delete(person);
        if (isDeleted) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/update-address")
    public ResponseEntity<Person> updateAddress(@RequestBody Person person) {
        Person updatedPerson = service.updateAddress(person);
        if (updatedPerson != null) {
            return ResponseEntity.ok(updatedPerson);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/update-email")
    public ResponseEntity<Person> updateEmailAddress(@RequestBody Person person) {
        Person updatedPerson = service.updateEmailAddress(person);
        if (updatedPerson != null) {
            return ResponseEntity.ok(updatedPerson);
        }
        return ResponseEntity.notFound().build();
    }
}

