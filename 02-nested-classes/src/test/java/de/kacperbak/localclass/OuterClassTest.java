package de.kacperbak.localclass;

import junit.framework.Assert;
import org.junit.Test;

public class OuterClassTest {

    @Test
    public void testValidatePhoneNumber() throws Exception {
        String phoneNumber1 = "123-456-7890";
        String phoneNumber2 = "456-7890";
        OuterClass oc = new OuterClass();
        Assert.assertTrue(oc.validatePhoneNumber(phoneNumber1));
        Assert.assertFalse(oc.validatePhoneNumber(phoneNumber2));
    }
}