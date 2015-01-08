package de.kacperbak;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by bakka on 08.01.15.
 */
public class PersonManager {

    private List<Person> persons;

    public PersonManager() {
        this.persons = createPersons();
    }

    private List<Person> createPersons(){
        this.persons = new ArrayList<>();
        this.persons.add(new Person("Alex", 27));
        this.persons.add(new Person("Ben", 37));
        this.persons.add(new Person("Chris", 47));
        return this.persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    /**
     * Example to filter with an iterator
     * @param c
     */
    public static void filter(Collection<Person> c) {
        for (Iterator<Person> it = c.iterator(); it.hasNext(); ){
            if (!condition(it.next())){
                it.remove();
            }
        }
    }

    /**
     * This condition could be an lambda expression
     * @param person
     * @return
     */
    private static boolean condition(Person person) {
        return person.getAge() > 30;
    }

}
