package com.epigraph.pojo;

public class Users {


    private String username;
    private Epigraph[] user;//用户符文信息数组

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return this.username;
    }

    public void setUser(Epigraph[] user) { this.user = user; }
    public Epigraph[] getUser() { return this.user; }
}
