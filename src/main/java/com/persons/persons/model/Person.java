package com.persons.persons.model;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @SequenceGenerator(
            name = "persons_id_seq",
            sequenceName = "persons_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "persons_id_seq"
    )
    @Column(name="id")
    private Long id;

    @Column(name="person")
    private String person;

    public Person() {

    }

    public Person(String name) {
        this.person = name;
    }


    public String getName() {
        return person;
    }

    public void setName(String firstName) {
        this.person = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", person='" + person + '\'' +
                '}';
    }
}
