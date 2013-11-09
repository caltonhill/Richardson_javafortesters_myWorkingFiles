package com.javafortesters.domainentities;

/**
 * Created with IntelliJ IDEA.
 * User: JamesMacdonald
 * Date: 11/8/13
 * Time: 9:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class User {

private String username;
private String password;
    public User(){
        this("username", "password");
    }

    public String getUsername() {
        return username;
                          }
        public String getPassword() {
        return password;
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}