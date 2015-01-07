package de.kacperbak;

import junit.framework.Assert;
import org.junit.Test;

public class NestedClassesPlaygroundTest {

    private OuterClass oc = new OuterClass("myOuterField");

    private OuterClass.InnerClass ic = oc.new InnerClass("myInnerField");

    private OuterClass.StaticNestedClass sc = new OuterClass.StaticNestedClass("myStaticNestedField");

    @Test
    public void useTheNestedClass() throws Exception {
        //InnerClass
        Assert.assertEquals("useInnerInstance", oc.useInnerInstance());

        //StaticNestedClass
        Assert.assertEquals("useStaticNestedInstance", oc.useStaticNestedInstance());
    }

    @Test
    public void accessPrivateMember() throws Exception {
        //InnerClass
        Assert.assertEquals(oc.getOuterField(), ic.fetchOuterField());

        //StaticNestedClass
        Assert.assertEquals(OuterClass.getOuterFieldStatic(), OuterClass.StaticNestedClass.getOuterField());
    }

    @Test
    public void onlyConstantsAreAllowedAsStaticMembersInInnerClasses() throws Exception {
        Assert.assertEquals("abc", OuterClass.InnerClass.CONST);
    }

    @Test
    public void useStaticMember() throws Exception {
        String expectedString = "myStaticNestedFieldStatic";
        OuterClass.StaticNestedClass.setStaticNestedFieldStatic(expectedString);
        Assert.assertEquals(expectedString, OuterClass.StaticNestedClass.getStaticNestedFieldStatic());
    }

}