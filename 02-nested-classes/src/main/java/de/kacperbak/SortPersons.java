package de.kacperbak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by bakka on 22.01.15.
 */
public class SortPersons {

    public static void sortByAnonymousClass(ArrayList<Person> persons){
        // Java 7
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
    }

    public static void sortByLambda(ArrayList<Person> persons){
        // Java 8
        Collections.sort(persons, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
    }

}
