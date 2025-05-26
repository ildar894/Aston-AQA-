package Shapes;

interface Shape {
    double area(); // Метод для расчета площади
    double perimeter(); // Метод для расчета периметра

    default double defaultPerimeter() {
        return perimeter();
    }

    String getFillColor(); // Метод для получения цвета заливки
    String getBorderColor(); // Метод для получения цвета границы
}