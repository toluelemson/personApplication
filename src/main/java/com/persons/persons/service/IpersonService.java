package com.persons.persons.service;

import com.persons.persons.model.Person;

import java.util.List;

public interface IpersonService {
    List<Person> getPersons();
    Person addPerson(Person person);
    void updatePerson(Long id, String name);
    void deletePerson(Long id);
}
