package de.kacperbak.localclass;

import junit.framework.Assert;
import org.junit.Test;

public class OuterClassTest {

    private String phoneNumber1 = "456-7890";
    private String phoneNumber2 = "123-456-7890";
    private OuterClass oc = new OuterClass();


    @Test
    public void testValidatePhoneNumber() throws Exception {
        Assert.assertFalse(oc.validatePhoneNumber(phoneNumber1));
        Assert.assertTrue(oc.validatePhoneNumber(phoneNumber2));
    }
}