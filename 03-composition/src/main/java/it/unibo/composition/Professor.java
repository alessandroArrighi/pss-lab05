package it.unibo.composition;

public class Professor implements User {
    private int id;
    private String name;
    private String username;
    private String password;
    private String[] courses;

    public Professor(final int id, final String password) {
        this.id = id;
        this.password = password;
    }

    public void replaceCourse(String course, int index) {
        if(this.courses.length > index) {
            this.courses[index] = course;
        }
    }
}
