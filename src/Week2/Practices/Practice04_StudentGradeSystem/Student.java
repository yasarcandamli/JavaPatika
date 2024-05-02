package Week2.Practices.Practice04_StudentGradeSystem;

public class Student {
    Course math;
    Course physics;
    Course chemistry;
    String studentName;
    String studentNumber;
    String classes;
    double averageGrade;
    boolean isPass;

    Student(String studentName, String studentNumber, String classes, Course math, Course physics, Course chemistry){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.classes = classes;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calculateAverage();
        this.isPass = false;
    }

    void addBulkExamGrade (int mathCourseGrade, int mathOralGrade, int physicsCourseGrade, int physicsOralGrade, int chemistryCourseGrade, int chemistryOralGrade) {
        if (mathCourseGrade >= 0 && mathCourseGrade <= 100) {
            this.math.courseGrade = mathCourseGrade;
        }
        if (mathOralGrade >= 0 && mathOralGrade <= 100) {
            this.math.oralGrade = mathOralGrade;
        }
        if (physicsCourseGrade >= 0 && physicsCourseGrade <= 100) {
            this.physics.courseGrade = physicsCourseGrade;
        }
        if (physicsOralGrade >= 0 && physicsOralGrade <= 100) {
            this.physics.oralGrade = physicsOralGrade;
        }
        if (chemistryCourseGrade >= 0 && chemistryCourseGrade <= 100) {
            this.chemistry.courseGrade = chemistryCourseGrade;
        }
        if (chemistryOralGrade >= 0 && chemistryOralGrade <= 100) {
            this.chemistry.oralGrade = chemistryOralGrade;
        }
    }

    void isPass() {
        if (this.math.courseGrade == 0 || this.math.oralGrade == 0 || this.physics.courseGrade == 0 || this. physics.oralGrade == 0 || this.chemistry.courseGrade == 0 || this.chemistry.oralGrade == 0) {
            System.out.println("Notların Tamamı Girilmemiştir!");
        } else {
            this.isPass = isCheckPass();
            printGrade();
            System.out.println("Ortalama: " + this. averageGrade);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti!");
            } else {
                System.out.println("Sınıfta Kaldı!");
            }
        }
    }

    void calculateAverage() {
        this.averageGrade = ((math.courseGrade * 0.8 + math.oralGrade * 0.2) + (physics.courseGrade * 0.8 + physics.oralGrade * 0.2) + (chemistry.courseGrade * 0.8 + chemistry.oralGrade * 0.2)) / 3;
    }

    boolean isCheckPass() {
        calculateAverage();
        return this.averageGrade > 55;
    }

    void printGrade() {
        System.out.println("=====================");
        System.out.println("Öğrenci: " + this.studentName);
        System.out.println("Matematik Notu: " + (math.courseGrade * 0.8 + math.oralGrade * 0.2));
        System.out.println("Fizik Notu: " + (physics.courseGrade * 0.8 + physics.oralGrade * 0.2));
        System.out.println("Kimya Notu: " + (chemistry.courseGrade * 0.8 + chemistry.oralGrade * 0.2));
    }
}
