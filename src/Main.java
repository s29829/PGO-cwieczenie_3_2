import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] ocenyUczniaPrzyklad1 = new double[]{3, 5, 4.34, 3, 2.23, 3, 5.2, 4, 3, 2.23, 3, 5, 4, 3, 2.23, 3, 5, 4, 3, 2.23};

        System.out.println("PGO - cwieczenie 3 2 ");
        System.out.println("");


        Student student01 = new Student("Andrzej", "Markowski", 78667, "amarkowski@stud.edu.pl", "Kopernika 7a");

// Brak oceny - blad IllegalArgumentException  - przy braku ocen
        try {
            System.out.println("Przykład 1: Uczeń bez ocen (try/catch) IllegalArgumentException ");
            System.out.println("Imię ucznia: " + student01.fname + " Nazwisko ucznia: " + student01.lname + " Numer indeksu: " + student01.indexNumber);
            System.out.println("Ilość ocen ucznia: " + student01.numberGrades);
            System.out.println(student01.calculateAverage());

        } catch (IllegalArgumentException e) {
            System.out.println("Brak ocen!!!!! Proszę wprowadzić oceny aby możliwe było wystawienie ocen. ");
            System.out.println("");
        }

// Dodajemy zestaw ocen
        student01.addGrades(ocenyUczniaPrzyklad1);
        System.out.println("Przykład 2: Uczeń bez ocen (try/catch) IllegalArgumentException ");
        System.out.println("Imię ucznia: " + student01.fname + " Nazwisko ucznia: " + student01.lname + " Numer indeksu: " + student01.indexNumber);
        System.out.println("Oceny: " + Arrays.toString(student01.grades));
        System.out.println("Srednia: " + student01.calculateAverage());
        System.out.println("");


// Drugi student bez podania danych ale z dodanymi ocenami
        System.out.println("Przykład 3: Drugi student bez podania imienia i nazwiska ");

        Student student02 = new Student();

        student02.addGrade(2.4);
        student02.addGrade(7.4);
        student02.addGrade(4.);
        student02.addGrade(7.4);
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
        System.out.println(studentGroup01.nazwa);
        System.out.println(Arrays.toString(studentGroup01.studentsInGroup));
        studentGroup01.addStudent(student01);
        studentGroup01.addStudent(student01);
        studentGroup01.addStudent(student01);

//        studentGroup01.addNewStudentToGroup(student01);
//        System.out.println(Arrays.toString(studentGroup01.studentsInGroup));
//
//        System.out.println(studentGroup01.studentsInGroup[0].fname);
//        System.out.println(studentGroup01.nazwa + " / " + studentGroup01.countStudents);
//
//        System.out.println("Grupa studencka: " + studentGroup01.nazwa);
//        System.out.println("Przypisani uczniowie: " + Arrays.toString(studentGroup01.studentsInGroup));
//        System.out.println("Srednia: " + student02.calculateAverage());
//        System.out.println("");


    }


}