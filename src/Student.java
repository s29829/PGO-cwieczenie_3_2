public class Student {

    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public double[] grades = new double[20];

    public Student(String fname, String lname, int indexNumber, String email, String address, double[] grades) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }

    public Student(String fname, String lname, int indexNumber, double[] grades) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.grades = grades;
    }

    public Student(String fname, String lname, int indexNumber) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
    }

    public Student() {
    }

    public boolean addGrade(double grade) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == 0) {
                continue;
            } else {
                grades[i] = grade;
//                return true;
            }
        }
        if (grades[grades.length - 1] != 0) {
            System.out.println("Student ma już maksymwalną liczbę ocen");
            return false;
        }
        return true;
    }

    public boolean addGrades(double grade[]) {
        this.grades = grade;
        return true;
    }


    public double obliczSrednia() {
        double sumGrades = 0;
        if (grades[0] == 0) {
            throw new IllegalArgumentException("Brak ocen");
        }
        for (int i = 0; i < grades.length; i++) {
            sumGrades = grades[i] + sumGrades;
        }
        return sumGrades / grades.length;
    }
}
