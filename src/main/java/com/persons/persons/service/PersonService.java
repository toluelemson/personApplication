package com.persons.persons.service;
import com.persons.persons.model.Person;
import com.persons.persons.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class PersonService implements IpersonService {

    @Autowired
    private PersonRepository personrepository;


	public List<Person> getPersons() {
        var persons = (List<Person>) personrepository.findAll();
        return persons;
    }

    public List<Person> findByName(String search) {
        var persons = (List<Person>) personrepository.findByNameIgnoreCaseIn(search);
        return persons;
    }

    public List<Person> addPerson(Person person){
        personrepository.save(person);
        var persons = (List<Person>) personrepository.findAll();
        return persons;
    }

    public String deletePerson(Long personId) {
        boolean exists = personrepository.existsById(personId);
        if (!exists) {
            throw new IllegalStateException(
                    "person with id" + personId + " does not exists");
        }
        personrepository.deleteById(personId);
        return "person with id " + personId + " has been deleted";
    }

    @Transactional
    public String updatePerson(Long personId, String name) {

        Person person = personrepository.findById(personId)
                .orElseThrow(() -> new IllegalStateException(
                        "person with id" + personId + "does not exists"
                ));
        if (name != null && name.length() > 0 && !Objects.equals(person.getPerson(), name)) {
            person.setPerson(name);
        }
        return name + " has been updated";
    }
}