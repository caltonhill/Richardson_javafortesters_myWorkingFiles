package com.javafortesters.domainobjects.environment;

/**
 * Created with IntelliJ IDEA.
 * User: Macdonald
 * Date: 06/11/13
 * Time: 21:25
 * To change this template use File | Settings | File Templates.
 */
public class TestAppEnv {
    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String getUrl() {
        return "http://" + DOMAIN + ":" + PORT;
    }
}
