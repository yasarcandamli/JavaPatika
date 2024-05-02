package Week2.Practices.Practice04_StudentGradeSystem;

public class Course {
    Teacher courseTeacher;
    String courseName;
    String courseCode;
    String coursePrefix;
    int courseGrade;
    int oralGrade;

    Course(String courseName, String courseCode, String coursePrefix) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.coursePrefix = coursePrefix;
        this.courseGrade = 0;
        this.oralGrade = 0;
    }

    void addTeacher(Teacher teacher) {
        if (this.coursePrefix.equals(teacher.teacherBranch)) {
            this.courseTeacher = teacher;
            System.out.println("İşlem Başarılı!");
        } else {
            System.out.println(teacher.teacherName + "Akademisyeni Bu Dersi Veremez!");
        }
    }

    void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.courseName + " Dersinin Akademisyeni: " + courseTeacher.teacherName);
        } else {
            System.out.println(this.courseName + " Dersine Akademisyen Atanmamıştır!");
        }
    }
}
