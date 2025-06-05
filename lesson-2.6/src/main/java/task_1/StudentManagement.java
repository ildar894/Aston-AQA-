package task_1;

import java.util.HashSet;
import java.util.Set;

public class StudentManagement {
    private Set<Student> students; // Набор студентов

    public StudentManagement() {
        this.students = new HashSet<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentsWithLowAverageGrade() {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }

    public void promoteStudents() {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.promote();
            }
        }
    }

    public void printStudents(int course) {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}