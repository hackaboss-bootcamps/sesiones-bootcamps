package io.davorpatech.apps.springbootdemo.service;

import io.davorpatech.apps.springbootdemo.model.Person;

import java.util.List;

public interface PeopleService
{
    List<Person> findAll();

    List<Person> findBySurnameInitialAndAge(String initial, Long age);

    Person create(Person person);
}
