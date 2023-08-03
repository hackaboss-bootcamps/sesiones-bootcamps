package io.davorpatech.apps.springbootdemo.persistence.impl;

import io.davorpatech.apps.springbootdemo.model.Person;
import io.davorpatech.apps.springbootdemo.persistence.PeopleDAO;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@Repository
public class InMemoryPeopleDAO implements PeopleDAO
{
    private final List<Person> people = new LinkedList<>();

    public InMemoryPeopleDAO() {
        people.add(new Person("            ", LocalDate.of(1983, 7, 18)));
        people.add(new Person("David Lawson", LocalDate.of(1983, 5, 24)));
        people.add(new Person("Lola Farrel", LocalDate.of(1950, 4, 30)));
        people.add(new Person("Isabel Alonso", LocalDate.of(1972, 6, 6)));
        people.add(new Person("Facundo Loureiro", LocalDate.of(1992, 7, 5)));
        people.add(new Person("Israel Alonso", LocalDate.of(1980, 3, 10)));
        people.add(new Person("Leonardo", LocalDate.of(1985, 5, 13)));
    }

    @Override
    public List<Person> findAll() {
        return List.copyOf(people);
    }

    @Override
    public Person persist(
            final Person person) {
        people.add(person);
        return person;
    }
}
