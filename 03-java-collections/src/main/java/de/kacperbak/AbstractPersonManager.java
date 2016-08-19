package de.kacperbak;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bakka on 19.08.16.
 */
public abstract class AbstractPersonManager {

    protected List<Person> persons;

    public AbstractPersonManager() {
        this.persons = createPersons();
    }

    public List<Person> getPersons() {
        return persons;
    }

    protected List<Person> createPersons(){
        this.persons = new ArrayList<>();
        this.persons.add(new Person("Alex", 27));
        this.persons.add(new Person("Ben", 37));
        this.persons.add(new Person("Chris", 47));
        return this.persons;
    }
}
