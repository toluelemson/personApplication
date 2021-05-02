package com.persons.persons.controller;

import com.persons.persons.model.Person;
import com.persons.persons.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping()
    public List<Person> getPersons(String search) {
        if (search != null) {
            return personService.findByName(search);
        } else {
           return personService.getPersons();
        }
    }

    @PostMapping()
    public List<Person> addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @DeleteMapping(path = "{personId}")
    public String deletePerson(@PathVariable("personId") Long personId){
         return personService.deletePerson(personId);
    }

    @PutMapping(path = "{personId}")
    public String updatePerson(
            @PathVariable("personId") Long personId,
            @RequestParam(required = false) String person) {
        return personService.updatePerson(personId, person);
    }
}
