package de.kacperbak;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by bakka on 19.08.16.
 */
public class PersonManagerStream extends AbstractPersonManager {

    public PersonManagerStream() {
        super();
    }

    public static Collection<Person> filter(Collection<Person> collection) {
        return collection.stream().filter( person -> (person.getAge() > 30) ).collect(Collectors.toList());
    }
}
