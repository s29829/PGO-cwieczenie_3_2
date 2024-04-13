public class StudentGroup {
    public String nazwa;
    int countStudents = 0;
    public Student[] studentsInGroup = new Student[15];

    public StudentGroup(String nazwa) {
        this.nazwa = nazwa;
    }

    public void addStudent(Student student) {
        if (countStudents < 15) {
            System.out.println("OK "+countStudents);
            studentsInGroup[countStudents] = student;
            countStudents++;
            System.out.println("OK++ "+countStudents);
            System.out.println(student);
            System.out.println(studentsInGroup[countStudents-1].fname);


        }
        System.out.println(studentsInGroup[countStudents-1].fname);
    }


//    public void addNewStudentToGroup(Student newStudentInGroup) {
//        System.out.println(this.studentsInGroup[0].fname +" / "+this.studentsInGroup[0].indexNumber);
//
//        if (countStudents > 15) {
//            throw new IllegalStateException("Grupa: " + nazwa + " zawiera już maksymalną ");
//        } else {
//            System.out.println(this.studentsInGroup[0].fname +" / "+this.studentsInGroup[0].indexNumber);
//            for (int i = 0; i < this.studentsInGroup.length; i++) {
//                System.out.println("A:" +this.studentsInGroup[i].indexNumber+ " == "+ newStudentInGroup.indexNumber);
////                for (int j = i; j < this.studentsInGroup.length; j++) {
//                    if (this.studentsInGroup[i].indexNumber == newStudentInGroup.indexNumber) {
//                        System.out.println("A:" +this.studentsInGroup[i].indexNumber+ " == "+ newStudentInGroup.indexNumber);
//                        throw new IllegalStateException("Student o numerze: " + this.studentsInGroup[i].indexNumber + " już jest przypisany do tej grupy");
//                    }
////                }
//            }
//            this.studentsInGroup[countStudents] = newStudentInGroup;
//
//        }
//    }
}


