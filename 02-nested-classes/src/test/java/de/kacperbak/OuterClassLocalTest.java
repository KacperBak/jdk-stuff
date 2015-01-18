package de.kacperbak;

import junit.framework.Assert;
import org.junit.Test;

public class OuterClassLocalTest {

    private String phoneNumber1 = "456-7890";
    private String phoneNumber2 = "123-456-7890";
    private OuterClassLocal oc = new OuterClassLocal();


    @Test
    public void testValidatePhoneNumber() throws Exception {
        Assert.assertFalse(oc.validatePhoneNumber(phoneNumber1));
        Assert.assertTrue(oc.validatePhoneNumber(phoneNumber2));
    }
}