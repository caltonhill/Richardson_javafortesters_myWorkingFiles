package com.javafortesters.testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: JamesMacdonald
 * Date: 11/4/13
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntMaxAndMinTest {
    @Test
    public void intHasMaxAndMin(){
     assertEquals("confirm int max",2147483647,Integer.MAX_VALUE);
     assertEquals("confirm int min",-2147483648,Integer.MIN_VALUE);

    }
 }
