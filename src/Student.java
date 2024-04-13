public class Student {

    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public double[] grades = new double[20];
    public int numberGrades = 0;

    // Dodanie Studenta z pełnymi danymi
    public Student(String fname, String lname, int indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }

    // Dodanie Studenta: imie, nazwisko, numer indeksu
    public Student(String fname, String lname, int indexNumber) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
    }


    public Student() {
        System.out.println("Brak podanych danych studenta");
    }

    public void addGrade(double grade) {
        if (this.numberGrades <= this.grades.length) {
            if (grade >= 2 && grade <= 5) {
                this.grades[this.numberGrades] = grade;
                this.numberGrades++;
            }
        } else System.out.println("Została już wystawiona maksywamlna liczba ocen z tego przedmiotu");
    }

    public boolean addGrades(double grade[]) {
        if (grade.length == 20) {
            this.grades = grade;
            this.numberGrades = 20;
            return true;
        }
        return false;
    }


    public double calculateAverage() {
        double sumGrades = 0;
        if (grades[0] == 0) {
            throw new IllegalArgumentException("Brak ocen! ");
        }
        for (int i = 0; i < grades.length; i++) {
            sumGrades = grades[i] + sumGrades;
        }
//        System.out.println(sumGrades + "/" + numberGrades);
        return roundGrades(sumGrades / numberGrades);


    }

    public double roundGrades(double gradeMedium) {
        double result = 0;
        if (gradeMedium >= 2 && gradeMedium < 2.25) {
            return result = 2;
        }
        if (gradeMedium >= 2.25 && gradeMedium < 2.75) {
            return result = 2.5;
        }
        if (gradeMedium >= 2.75 && gradeMedium < 3.25) {
            return 3;
        }
        if (gradeMedium >= 3.25 && gradeMedium < 3.75) {
            return 3.5;
        }
        if (gradeMedium >= 3.75 && gradeMedium < 4.25) {
            return 4;
        }
        if (gradeMedium >= 4.25 && gradeMedium < 4.75) {
            return 4.5;
        }
        if (gradeMedium >= 4.75 && gradeMedium <= 5) {
            return 5;
        } return result;
    }
}

