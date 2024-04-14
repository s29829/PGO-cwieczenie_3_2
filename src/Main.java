import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] ocenyUczniaPrzyklad1 = new double[]{3, 5, 4.34, 3, 2.23, 3, 5.2, 4, 3, 2.23, 3, 5, 4, 3, 2.23, 3, 5, 4, 3, 2.23};

        System.out.println("PGO - cwieczenie 3 2 ");
        System.out.println("");


        Student student01 = new Student("Andrzej", "Markowski", 78667, "amarkowski@stud.edu.pl", "Kopernika 7a");

// Brak oceny - blad IllegalArgumentException  - przy braku ocen
        tryCalculateGrades(student01);

// Dodajemy zestaw ocen
        student01.addGrades(ocenyUczniaPrzyklad1);
        System.out.println("Przykład 2: Uczeń bez ocen (try/catch) IllegalArgumentException ");
        System.out.println("Imię ucznia: " + student01.fname + " Nazwisko ucznia: " + student01.lname + " Numer indeksu: " + student01.indexNumber);
        System.out.println("Oceny: " + Arrays.toString(student01.grades));
        System.out.println("Średnia: " + student01.calculateAverage());
        System.out.println("");


// Drugi student bez podania danych ale z dodanymi ocenami
        System.out.println("Przykład 3: Drugi student bez podania imienia i nazwiska ");

        Student student02 = new Student();

        student02.addGrade(2.4);
        student02.addGrade(4.4);
        student02.addGrade(4.2);
        student02.addGrade(3.4);
        student02.addGrade(4.4);

        System.out.println("Imię ucznia: " + student02.fname + " Nazwisko ucznia: " + student02.lname + " Numer indeksu: " + student02.indexNumber);
        System.out.println("Oceny: " + Arrays.toString(student02.grades));
        System.out.println("Srednia: " + student02.calculateAverage());
        System.out.println("");


// Drugi student podajemy dane studenta
        System.out.println("Przykład 4: Drugi student z danymi oraz ocenami ");
        student02.fname = "Małgorzata";
        student02.lname = "Twardowska";
        student02.indexNumber = 43356;

        System.out.println("Imię ucznia: " + student02.fname + " Nazwisko ucznia: " + student02.lname + " Numer indeksu: " + student02.indexNumber);
        System.out.println("Oceny: " + Arrays.toString(student02.grades));
        System.out.println("Srednia: " + student02.calculateAverage());
        System.out.println("");


// Tworzymy grupę studentów i dodajemy noweg studenta
        System.out.println("Przykład 5: Tworzenie grupy studentów i dodanie studenta 1 oraz studenta 2 ");
        System.out.println("_______________________________________________________________ ");

        StudentGroup studentGroup01 = new StudentGroup("Klasa 3B");

        testAddNewStudenToGroup(studentGroup01, student01);
        testAddNewStudenToGroup(studentGroup01, student01);
        testAddNewStudenToGroup(studentGroup01, student02);

    }

    private static void tryCalculateGrades(Student student) {
        try {
            System.out.println("Przykład 1: Uczeń bez ocen (try/catch) IllegalArgumentException ");
            System.out.println("Imię ucznia: " + student.fname + " Nazwisko ucznia: " + student.lname + " Numer indeksu: " + student.indexNumber);
            System.out.println("Ilość ocen ucznia: " + student.numberGrades);
            System.out.println(student.calculateAverage());

        } catch (IllegalArgumentException e) {
            System.out.println("Uwaga: Brak ocen!!!!! Proszę wprowadzić oceny aby możliwe było wystawienie ocen. ");
            System.out.println("");
        }
    }

    private static void testAddNewStudenToGroup(StudentGroup studentGroup01, Student student) {
        try {
            studentGroup01.addStudent(student);
        } catch (IllegalStateException e) {
            System.out.println("\n--- Student: "+student.fname);
            System.out.println("    Numer indeksu: "+student.indexNumber);
            System.out.println("--- jest już wpisany do grupy \""+studentGroup01.nazwa+"\"");

        }
    }


}