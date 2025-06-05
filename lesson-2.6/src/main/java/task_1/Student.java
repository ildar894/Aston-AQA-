package task_1;

import java.util.List;

public class Student {
    private String name;      // Имя студента
    private String group;     // Группа студента
    private int course;       // Курс студента
    private List<Double> grades; // Оценки студента

    public Student(String name, String group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageGrade() {
        return grades.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public void promote() {
        this.course++;
    }
}