package de.kacperbak;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by bakka on 08.01.15.
 */
public class PersonManagerIterator extends AbstractPersonManager{

    public PersonManagerIterator() {
        super();
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
