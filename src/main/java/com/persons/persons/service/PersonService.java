package com.persons.persons.service;
import com.persons.persons.model.Person;
import com.persons.persons.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping
    public List<Person> findByName(String search) {
        var persons = (List<Person>) personrepository.findByName(search);
        return persons;
    }

    @PostMapping
    public Person addNewPerson(Person person){
        return personrepository.save(person);
    }

    public void deletePerson(Long personId) {
        boolean exists = personrepository.existsById(personId);
        if (!exists) {
            throw new IllegalStateException(
                    "person with id" + personId + " does not exists");
        }
       personrepository.deleteById(personId);
    }


    @Transactional
    public void updatePerson(Long personId, String name) {

        Person person = personrepository.findById(personId)
                .orElseThrow(() -> new IllegalStateException(
                        "person with id" + personId + "does not exists"
                ));
        if (name != null && name.length() > 0 && !Objects.equals(person.getName(), name)) {
            person.setName(name);
        }

    }
}
