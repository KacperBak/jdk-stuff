package de.kacperbak;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonManagerIteratorTest {


    @Test
    public void filterWithIterator() throws Exception {
        PersonManagerIterator personManagerIterator = new PersonManagerIterator();
        Assert.assertEquals(personManagerIterator.getPersons().size(), 3);
        PersonManagerIterator.filter(personManagerIterator.getPersons());
        Assert.assertEquals(personManagerIterator.getPersons().size(), 2);
        Assert.assertEquals(personManagerIterator.getPersons().get(0).getAge(), 37);
        Assert.assertEquals(personManagerIterator.getPersons().get(1).getAge(), 47);
    }

    @Test
    public void filterWithForEachLoop() throws Exception {
        PersonManagerSimple personManagerSimple = new PersonManagerSimple();
        Assert.assertEquals(personManagerSimple.getPersons().size(), 3);
        PersonManagerSimple.filter(personManagerSimple.getPersons());
        Assert.assertEquals(personManagerSimple.getPersons().size(), 2);
        Assert.assertEquals(personManagerSimple.getPersons().get(0).getAge(), 37);
        Assert.assertEquals(personManagerSimple.getPersons().get(1).getAge(), 47);
    }

    @Test
    public void filterWithStream() throws Exception {
        PersonManagerStream personManagerStream = new PersonManagerStream();
        Assert.assertEquals(3, personManagerStream.getPersons().size());
        List<Person> result = new ArrayList<>(personManagerStream.filter(personManagerStream.getPersons()));
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(37, result.get(0).getAge());
        Assert.assertEquals(47, result.get(1).getAge());
    }
}