package de.kacperbak;

import junit.framework.Assert;
import org.junit.Test;

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
    public void filterSimple() throws Exception {
        PersonManagerSimple personManagerSimple = new PersonManagerSimple();
        Assert.assertEquals(personManagerSimple.getPersons().size(), 3);
        PersonManagerSimple.filter(personManagerSimple.getPersons());
        Assert.assertEquals(personManagerSimple.getPersons().size(), 2);
        Assert.assertEquals(personManagerSimple.getPersons().get(0).getAge(), 37);
        Assert.assertEquals(personManagerSimple.getPersons().get(1).getAge(), 47);
    }
}