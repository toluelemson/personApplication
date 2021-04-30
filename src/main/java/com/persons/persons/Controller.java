package com.persons.persons;

import com.persons.persons.model.Person;
import com.persons.persons.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/persons")
public class Controller {

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
    public Person registerNewPerson(@RequestBody Person person) {
        return personService.addNewPerson(person);
    }

    @DeleteMapping(path = "{personId}")
    public void deletePerson(@PathVariable("personId") Long personId){
         personService.deletePerson(personId);
    }

    @PutMapping(path = "{personId}")
    public void updatePerson(
            @PathVariable("personId") Long personId,
            @RequestParam(required = false) String name) {
        personService.updatePerson(personId, name);
    }
}
