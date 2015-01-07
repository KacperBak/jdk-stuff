package de.kacperbak;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnumTypesPlaygroundTest {

    private final EnumTypesPlayground tester = new EnumTypesPlayground();

    @Test
    public void testMatchAbbreviation() throws Exception {
        assertEquals( CompassDirection.NORTH.getAbbreviation() , tester.matchAbbreviation(CompassDirection.NORTH) );
        assertEquals( CompassDirection.SOUTH.getAbbreviation() , tester.matchAbbreviation(CompassDirection.SOUTH) );
        assertEquals( CompassDirection.EAST.getAbbreviation() , tester.matchAbbreviation(CompassDirection.EAST) );
        assertEquals( CompassDirection.WEST.getAbbreviation() , tester.matchAbbreviation(CompassDirection.WEST) );
    }

    @Test
    public void testConcatAllCompassDirectionAbbrevations() throws Exception {
        assertEquals("NSEW", tester.concatAllCompassDirectionAbbrevations());
    }
}