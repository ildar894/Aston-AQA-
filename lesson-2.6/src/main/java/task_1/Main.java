package task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();

        sm.addStudent(new Student("Иван", "Группа A", 1, Arrays.asList(4.0, 3.5, 2.5)));
        sm.addStudent(new Student("Анна", "Группа B", 1, Arrays.asList(3.0, 4.0, 3.0)));
        sm.addStudent(new Student("Петр", "Группа C", 2, Arrays.asList(4.5, 5.0, 4.0)));
        sm.addStudent(new Student("Светлана", "Группа D", 2, Arrays.asList(2.0, 2.5, 3.0)));

        // Удаление студентов со средним баллом < 3
        sm.removeStudentsWithLowAverageGrade();

        // Перевод студентов на следующий курс
        sm.promoteStudents();

        // Печать студентов на 2 курсе
        sm.printStudents(2);
    }
}