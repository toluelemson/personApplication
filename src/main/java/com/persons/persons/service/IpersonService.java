package com.persons.persons.service;

import com.persons.persons.model.Person;

import java.util.List;

public interface IpersonService {
    List<Person> getPersons();
    Person addPerson(Person person);
    String updatePerson(Long id, String name);
    String deletePerson(Long id);
}
