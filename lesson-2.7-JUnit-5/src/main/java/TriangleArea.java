public class TriangleArea {
    public static double area(double base, double height) {
        if (base < 0 || height < 0) throw new IllegalArgumentException("Основание и высота должны быть неотрицательными");
        return 0.5 * base * height;
    }
}