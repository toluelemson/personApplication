package com.persons.persons.repository;

import com.persons.persons.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query(value = "select * from persons p where lower(p.person) like lower(concat('%', :search, '%'))", nativeQuery = true)
    List<Person> findByNameIgnoreCaseIn(@Param("search") String search);

}
