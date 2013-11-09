package com.javafortesters.testwithourownclasses.domainobject;

import com.javafortesters.domainobjects.environment.TestAppEnv;
import org.junit.Test;

import static com.javafortesters.domainobjects.environment.TestAppEnv.PORT;
import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Macdonald
 * Date: 06/11/13
 * Time: 21:20
 * To change this template use File | Settings | File Templates.
 */
public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically(){
        assertEquals("Returns Hard Coded URL","http://192.123.0.3:67", TestAppEnv.getUrl());
    }
    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Just the domain", "192.123.0.3", TestAppEnv.DOMAIN);
        assertEquals("Just the port","67", TestAppEnv.PORT);
    }
}
