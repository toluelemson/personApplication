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
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name="person",
            columnDefinition = "TEXT")
    private String person;

    public Person() { }
    public Person(String person) {
        this.person = person;
    }

    public Person(Long id, String person) {
        this.id= id;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", person='" + person + '\'' +
                '}';
    }
}