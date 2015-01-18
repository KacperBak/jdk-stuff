package de.kacperbak;

import junit.framework.Assert;
import org.junit.Test;

public class OuterClassNestedTest {

    private OuterClassNested oc = new OuterClassNested("myOuterField");

    private OuterClassNested.InnerClass ic = oc.new InnerClass("myInnerField");

    private OuterClassNested.StaticNestedClass sc = new OuterClassNested.StaticNestedClass("myStaticNestedField");

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
        Assert.assertEquals(OuterClassNested.getOuterFieldStatic(), OuterClassNested.StaticNestedClass.getOuterField());
    }

    @Test
    public void onlyConstantsAreAllowedAsStaticMembersInInnerClasses() throws Exception {
        Assert.assertEquals("abc", OuterClassNested.InnerClass.CONST);
    }

    @Test
    public void useStaticMember() throws Exception {
        String expectedString = "myStaticNestedFieldStatic";
        OuterClassNested.StaticNestedClass.setStaticNestedFieldStatic(expectedString);
        Assert.assertEquals(expectedString, OuterClassNested.StaticNestedClass.getStaticNestedFieldStatic());
    }

}