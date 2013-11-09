package com.javafortesters.selectionsanddecisions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Macdonald
 * Date: 09/11/13
 * Time: 21:02
 * To change this template use File | Settings | File Templates.
 */
public class ExampleSwitchStatement {
    @Test
    public void switchExample(){
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("M", likelyGenderIs("master"));
        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("lady"));
        assertEquals("F", likelyGenderIs("madam"));
    }

    public String likelyGenderIs(String title){
        String likelyGender;

        switch (title.toLowerCase()){
            case "sir";
                likelyGender = "M";
                break;
            case "mr";
                likelyGender = "M";
                break;
            case "master";
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }
        return likelyGender;
    }
    }
/**
 * The switch statement takes an expression to check
 * the switch block has a series of case statements
 * the break statement is important to end each case
 * the last case should be a default which is executed if no other case matches
 * default still requires a break
 * BE CAREFUL.  If you forget the break then the case will fall through to the next one
 */
