package de.kacperbak;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SortPersonsTest {

    private ArrayList<Person> actual;
    private ArrayList<Person> expected = createExpected();

    @Before
    public void setUp() throws Exception {
        this.actual = createActual();
    }

    @Test
    public void testSortByAnonymousClass() throws Exception {
        SortPersons.sortByAnonymousClass(actual);
        assertPersons(expected, actual);
    }

    @Test
    public void testSortbyLambda() throws Exception {
        SortPersons.sortByLambda(actual);
        assertPersons(expected, actual);
    }

    private void assertPersons(ArrayList<Person> expectedPersons, ArrayList<Person> actualPersons){
        Assert.assertEquals("expected size != actual size", expectedPersons.size(), actualPersons.size());
        for(int i = 0; i < expectedPersons.size(); i++){
            Assert.assertEquals(expectedPersons.get(i).getAge(), actualPersons.get(i).getAge());
        }
    }

    private ArrayList<Person> createActual(){
        return new ArrayList<>(Arrays.asList(new Person("Ryu", 35), new Person("Chun Li", 30), new Person("Ken", 33)));
    }

    private ArrayList<Person> createExpected(){
        return new ArrayList<>(Arrays.asList(new Person("Chun Li", 30), new Person("Ken", 33), new Person("Ryu", 35)));
    }
}