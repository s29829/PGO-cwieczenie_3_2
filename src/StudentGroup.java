public class StudentGroup {
    public String nazwa;
    public Student[] students = new Student[15];

    public StudentGroup(String nazwa) {

    }

    public boolean addNewStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i; j < students.length; j++) {
                if (students[i].indexNumber == students[j].indexNumber) {
//                    return false;
                    throw new IllegalStateException("Student number " + students[i].indexNumber + " already exists");
                }

            }
        } return true;

    }
}
