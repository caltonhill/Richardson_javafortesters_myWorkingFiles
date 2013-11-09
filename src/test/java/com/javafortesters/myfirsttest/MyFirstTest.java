/**
 * Created with IntelliJ IDEA.
 * User: Macdonald
 * Date: 30/10/13
 * Time: 23:14
 * To change this template use File | Settings | File Templates.
 */
package com.javafortesters.myfirsttest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {
    @Test
    public void canAddTwoPlusTwo/*this is a method*/ (){
        int answer = 2+2;               /*setting a variable*/
           assertEquals("2+2=4", 4, answer);    /*an assert with message, expected result, actual result (as variable)*/
    }
    @Test
    public void canSubtractTwoFromTwo/*this is a method*/ (){
        int solution = 2-2;               /*setting a variable*/
        assertEquals("2-2=0", 0, solution);    /*an assert with message, expected result, actual result (as variable)*/
    }
    @Test
    public void canDivideFourByTwo/*this is a method*/ (){
        int result = 4/2;               /*setting a variable*/
        assertEquals("4/2=2", 2, result);    /*an assert with message, expected result, actual result (as variable)*/
    }
    @Test
    public void canMultiplyTwoByTwo/*this is a method*/ (){
        int the_answer = 2*2;               /*setting a variable*/
        assertEquals("2*2=4", 4, the_answer);    /*an assert with message, expected result, actual result (as variable)*/
    }
}
