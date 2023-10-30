package it.unibo.composition;

public class Professor implements User {
    public int id;
    public String name;
    public String username;
    public String password;
    public String[] courses;

    Professor(final int id, final String password) {
        this.id = id;
        this.password = password;
    }

    
}
