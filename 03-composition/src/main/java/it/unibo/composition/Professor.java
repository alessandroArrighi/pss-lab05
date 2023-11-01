package it.unibo.composition;

public class Professor implements User {
    private int id;
    private String name;
    private String surname;
    private String password;
    private String[] courses;

    public Professor(final int id, final String name, 
    final String surname, final String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Professor ["
        + "name=" + this.name
        + ", surname=" + this.surname
        + ", id=" + this.id
        + ", password=" + this.password
        + "]";
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getUsername() {
        return this.surname;
    }

    public String getPassword() {
        return this.password;
    }

    public String[] getCourses() {
        return this.courses;
    }

    public String getDescription() {
        return toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void replaceCourse(String course, int index) {
        if(this.courses.length > index) {
            this.courses[index] = course;
        }
    }

    public void replaceAllCourses(String[] courses) {
        this.courses = courses;
    }
}
