package com.persons.persons;

import com.persons.persons.model.Person;
import com.persons.persons.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PersonsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonsApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository) {
        return args -> {
            Person siim = new Person(
                    (long) 1,
                    "Siim Toomingas"
            );

            personRepository.save(siim);

        };
    }
}
