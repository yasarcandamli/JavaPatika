package Week2.Practices.Practice04_StudentGradeSystem;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Matematik", "MAT101", "MAT");
        Course physics = new Course("Fizik", "FIZ101", "FIZ");
        Course chemistry = new Course("Kimya", "KIM101", "KIM");

        Teacher teacher1 = new Teacher("Emine", "MAT", "111");
        Teacher teacher2 = new Teacher("İsmail", "FIZ", "222");
        Teacher teacher3 = new Teacher("İlknur", "KIM", "333");

        math.addTeacher(teacher1);
        physics.addTeacher(teacher2);
        chemistry.addTeacher(teacher3);

        Student student1 = new Student("Yaşar Can", "123", "4", math, physics, chemistry);
        student1.addBulkExamGrade(90, 60, 75, 80, 60, 75);
        student1.isPass();
        Student student2 = new Student("Mehmet Emin", "456", "4", math, physics, chemistry);
        student2.addBulkExamGrade(45, 50, 30, 60, 20, 35);
        student2.isPass();
        Student student3 = new Student("Mete Han", "789", "4", math, physics, chemistry);
        student3.addBulkExamGrade(80, 75, 70, 75, 70, 95);
        student3.isPass();

    }
}
