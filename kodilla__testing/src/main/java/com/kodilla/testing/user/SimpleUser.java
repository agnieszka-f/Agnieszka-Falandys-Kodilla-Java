package com.kodilla.testing.user;

public class SimpleUser {

    private String username;
    private String realusername;

    public SimpleUser(String username, String realusername) {
        this.username = username;
        this.realusername = realusername;
    }

    public String getUsername() {
        return username;
    }
    public String getRealUsername(){
        return this.realusername;
    }
}
