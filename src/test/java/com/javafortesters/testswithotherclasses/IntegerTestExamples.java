package com.javafortesters.testswithotherclasses;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class IntegerTestExamples {
    @Test
    public void integerExploration() {
      Integer four = new Integer(4);
        assertEquals("intValue returns int 4",
                4, four.intValue());
      Integer other = new Integer("5");
        assertEquals("intValue returns string 5",
                5,other.intValue());
      Integer next = 6;
        assertEquals("autoboxing means needn't instantiate Integer class",
                6, next.intValue());
            }
}

