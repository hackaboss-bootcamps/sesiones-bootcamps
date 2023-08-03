package io.davorpatech.apps.springbootdemo.model;

import io.davorpatech.fwk.model.BaseValueObject;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person extends BaseValueObject
{
    private String fullname;

    private LocalDate birthdate;

    public Person(String fullname, LocalDate birthdate) {
        setFullname(fullname);
        setBirthdate(birthdate);
    }

    public String getFullname() {
        return fullname;
    }

    public String extractSurname() {
        if (fullname == null) return null;
        String name = getFullname().trim();
        int index = name.indexOf(" ");
        return index < 0 ? name : name.substring(index);
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public long getAge() {
        LocalDate date = getBirthdate();
        if (date == null) return -1;
        return ChronoUnit.YEARS.between(date, LocalDate.now());
    }

    @Override
    protected String defineObjAttrs() {
        return String.format("fullname='%s', birthdate=%s, age=%s",
                getFullname(), getBirthdate(), getAge());
    }
}
