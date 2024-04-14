public class StudentGroup {
    public String nazwa;
    int countStudents = 0;
    public Student[] studentsInGroup = new Student[15];

    public StudentGroup(String nazwa) {
        this.nazwa = nazwa;
    }

    public void addStudent(Student student) {
        if (countStudents < 15) {
            for (int i = 0; i < countStudents; i++) {
                if (studentsInGroup[i].fname.equals(student.fname) && studentsInGroup[i].indexNumber == student.indexNumber) {
                    throw new IllegalStateException("Student\\ka " + student.fname + " jest już wpisany do tej grupy");
                }
            }
            studentsInGroup[countStudents] = student;
            countStudents++;

            System.out.println("\n+++ Student\\ka " + student.fname );
            System.out.println("   został\\a dodany do grupy: \"" + nazwa+"\"");
            System.out.println("++++  Łączna ilość studentów w grupie: " + countStudents);


        } else {
            System.out.println("Maksymalna ilość studentów. Nie można dodać kolejnego " + student.fname + " is already in the group");
        }
    }


}


