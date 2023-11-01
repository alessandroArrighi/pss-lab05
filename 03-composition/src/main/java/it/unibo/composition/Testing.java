package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere
        User marioRossi = new Student(0, "Mario", "Rossi", "000", 2021);
        User lucaVerdi = new Student(1, "Luca", "Verdi", "111", 2018);
        User marcoBianchi = new Student(2, "Marco", "Bianchi", "222", 2022);

        // 2)Creare 2 docenti a piacere
        User annaNeri = new Professor(0, "Anna", "Neri", "000");
        User albertoColombo = new Professor(1, "Alberto", "Colombo", "111");

        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom room0 = new ExamRoom(100, "descrizione", 
        true, false);
        ExamRoom room1 = new ExamRoom(80, "Descrizione", 
        false, true);

        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2
        Exam exam0 = new Exam(0, 10, "Analisi 1", (Professor) annaNeri, room0);
        Exam exam1 = new Exam(1, 2, "Programmazione 1", (Professor) albertoColombo, room1);

        // 5) Iscrivere tutti e 3 gli studenti agli esami
        exam0.registerStudent((Student) marioRossi);
        exam0.registerStudent((Student) lucaVerdi);
        exam0.registerStudent((Student) marcoBianchi);

        exam1.registerStudent((Student) marioRossi);
        exam1.registerStudent((Student) lucaVerdi);
        exam1.registerStudent((Student) marcoBianchi);

        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(exam0.toString());
        System.out.println(exam1.toString());
    }
}
