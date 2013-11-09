package com.javafortesters.domainentities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: JamesMacdonald
 * Date: 11/8/13
 * Time: 9:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserTest {
    @Test
    public void canConstructANewUser(){
        User user = new User();
    }
    @Test
    public void userHasDefaultUsernameAndPassword (){
        User user = new User();
        assertEquals ("default username expected","username",
                user.getUsername());
        assertEquals ("default password expected","password",
                user.getPassword());
            }
    @Test
    public void canConstructWithUsernameAndPassword (){
        User user = new User("admin", "passw0rd");
        assertEquals ("given username expected", "admin",
                user.getUsername());
        assertEquals ("given password expected", "passw0rd",
                user.getPassword());
                    }
    @Test
    public void canSetUsernameAfterConstructed (){
        User user = new User();
            user.setUsername("jamestest2@freeolamail.com");
            assertEquals ("setter username expected","jamestest2@freeolamail.com", user.getUsername());
}
    @Test
    public void canSetPasswordAfterConstructed (){
        User user = new User();
            user.setPassword("password2");
            assertEquals("setter password expected","password2", user.getPassword());
                    }
}
