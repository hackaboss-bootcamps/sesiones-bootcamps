package io.davorpatech.apps.springbootdemo.service.impl;

import io.davorpatech.apps.springbootdemo.model.Person;
import io.davorpatech.apps.springbootdemo.persistence.PeopleDAO;
import io.davorpatech.apps.springbootdemo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class PeopleServiceImpl implements PeopleService
{
    PeopleDAO peopleDAO;

    public PeopleServiceImpl(
            final @Autowired PeopleDAO peopleDAO) {
        this.peopleDAO = Objects.requireNonNull(
                peopleDAO, "peopleDAO must not be null!");
    }

    @Override
    public List<Person> findAll() {
        return peopleDAO.findAll();
    }

    @Override
    public List<Person> findBySurnameInitialAndAge(
            final @Nullable String initial,
            final @Nullable Long age) {
        Predicate<Person> predicate = p -> true;
        if (initial != null) {
            predicate = predicate.and(p -> {
                final String surname = p.extractSurname();
                if (initial.isBlank())
                    return surname == null || surname.isBlank();
                return  surname != null &&
                        surname.trim().toLowerCase().startsWith(initial.trim().toLowerCase());
            });
        }
        if (age != null) {
            predicate = predicate.and(p -> Long.compare(age, p.getAge()) == 0);
        }
        return peopleDAO.findAll()
                .stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    @Override
    public Person create(
            final Person person) {
        return peopleDAO.persist(person);
    }
}
