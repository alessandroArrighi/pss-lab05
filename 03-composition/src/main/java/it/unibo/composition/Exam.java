package it.unibo.composition;

import java.util.Arrays;

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

    @Override
    public String toString() {
        return "Exam [" +
        "id: " + this.id +
        "registred students: " + this.registeredStudents +
        "course name: " + this.courseName +
        "professor: " + this.professor +
        "exam room: " + this.room +
        "students: " + Arrays.toString(this.students) + 
        "]";
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

    public String getCourseName() {
        return this.courseName;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public ExamRoom getRoom() {
        return this.room;
    }

    public String getStudents() {
        return Arrays.toString(this.students);
    }

    public void registerStudent(Student student) {
        if(this.registeredStudents < this.maxStudents) {
            this.students[this.registeredStudents] = student;
            this.registeredStudents++;
        }
    }
}
