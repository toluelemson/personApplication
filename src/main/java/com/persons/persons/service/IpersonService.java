package com.persons.persons.service;

import com.persons.persons.model.Person;

import java.util.List;

public interface IpersonService {
    List<Person> getPersons();
    List<Person> addPerson(Person person);
    String updatePerson(Long id, String person);
    String deletePerson(Long id);
}
