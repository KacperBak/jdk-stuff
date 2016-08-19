package de.kacperbak;

import java.util.Collection;

/**
 * Created by bakka on 19.08.16.
 */
public class PersonManagerSimple extends AbstractPersonManager {

    public PersonManagerSimple() {
        super();
    }

    public static void filter(Collection<Person> collection) {
        Person personToRemove = null;
        for(Person person : collection){
            if(!condition(person)){
                personToRemove = person;
            }
        }
        collection.remove(personToRemove);
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
