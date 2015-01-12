package de.kacperbak.anonymousclass;

import junit.framework.Assert;
import org.junit.Test;


public class OuterClassTest {

    private String phoneNumber1 = "456-7890";
    private String phoneNumber2 = "123-456-7890";
    private OuterClass oc = new OuterClass();

    @Test
    public void testValidatePhoneNumberCaptured() throws Exception {
        Assert.assertTrue(oc.validatePhoneNumberCaptured(phoneNumber1));
        Assert.assertFalse(oc.validatePhoneNumberCaptured(phoneNumber2));
    }

    @Test
    public void testValidatePhoneNumberShadowed() throws Exception {
        Assert.assertFalse(oc.validatePhoneNumberShadowed(phoneNumber1));
        Assert.assertTrue(oc.validatePhoneNumberShadowed(phoneNumber2));

    }
}