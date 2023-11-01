package it.unibo.composition;

public class Exam {
    private int id;
    private int maxStudents;
    private int registeredStudents;
    private String courseName;
    private Professor professor;
    private ExamRoom room;
    private Student[] students;

    public Exam(final int id, final int maxStudents, final String courseName, 
    final Professor professor, final ExamRoom room) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = new Student[maxStudents];
    }

    public int getId() {
        return this.id;
    }

    public int getMaxStudent() {
        return this.maxStudents;
    }

    public int getNumRegistredStudents() {
        return this.registeredStudents;
    }

    private void changeNumRegistredStudent(final int registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

    
}
