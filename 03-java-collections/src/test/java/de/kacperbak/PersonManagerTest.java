package de.kacperbak;

import junit.framework.Assert;
import org.junit.Test;

public class PersonManagerTest {

    private PersonManager personManager = new PersonManager();

    @Test
    public void testFilterPersons() throws Exception {
        Assert.assertEquals(personManager.getPersons().size(), 3);
        PersonManager.filter(personManager.getPersons());
        Assert.assertEquals(personManager.getPersons().size(), 2);
        Assert.assertEquals(personManager.getPersons().get(0).getAge(), 37);
        Assert.assertEquals(personManager.getPersons().get(1).getAge(), 47);
    }
}