package it.unibo.composition;

public class Professor implements User {
    private int id;
    private String name;
    private String surname;
    private String password;
    private String[] courses;

    public Professor(final int id, final String password) {
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

    public String getUsername() {
        return this.surname;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription() {
        return toString();
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
