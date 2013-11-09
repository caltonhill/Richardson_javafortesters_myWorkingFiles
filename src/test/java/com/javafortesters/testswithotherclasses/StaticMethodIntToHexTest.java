package com.javafortesters.testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: JamesMacdonald
 * Date: 11/4/13
 * Time: 9:10 PM
 * To change this template use File | Settings | File Templates.
 */
 public class StaticMethodIntToHexTest {
    @Test
    public void canConvertIntToHex(){
      assertEquals("11 converts to b","b",Integer.toHexString(11));
      assertEquals("hex 10 is a","a",Integer.toHexString(10));
      assertEquals("hex 3 is 3","3",Integer.toHexString(3));
      assertEquals("hex 21 is 15","15",Integer.toHexString(21));
    }
}

