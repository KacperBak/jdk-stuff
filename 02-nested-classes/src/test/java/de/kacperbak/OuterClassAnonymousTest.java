package de.kacperbak;

import junit.framework.Assert;
import org.junit.Test;


public class OuterClassAnonymousTest {

    private String phoneNumber1 = "456-7890";
    private String phoneNumber2 = "123-456-7890";
    private OuterClassAnonymous oc = new OuterClassAnonymous();

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