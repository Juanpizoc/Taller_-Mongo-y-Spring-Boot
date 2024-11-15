
package com.example.accessingmongodbdatarest.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.accessingmongodbdatarest.document.Person;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepositoryImpl extends MongoRepository<Person, String> {

	
}
