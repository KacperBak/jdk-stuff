package de.kacperbak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by bakka on 07.01.15.
 */
public class NestedClassesPlayground {

    List<Person> persons;

    public NestedClassesPlayground() {
        this.persons = createPersons();
    }

    private List<Person> createPersons(){
        this.persons = new ArrayList<>();
        this.persons.add(new Person("Alex", 27));
        this.persons.add(new Person("Ben", 37));
        this.persons.add(new Person("Chris", 47));
        return this.persons;
    }

    public static void main(String[] args) {

    }

    private class PersonIterator implements Iterator<Person>{
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Person next() {
            return null;
        }
    }

}
