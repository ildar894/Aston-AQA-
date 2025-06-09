import jdk.jfr.Description;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class Tests {

    @Test
    @Description("Факториал числа")
    public void testFactorial() {
        assertEquals(Factorial.factorial(5), 120);
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }

    @Test
    @Description("Площадь треугольника")
    public void testTriangleArea() {
        assertEquals(TriangleArea.area(4, 5), 10.0);
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.area(-1, 5));
    }

    @Test
    @Description("Арифметические действия")
    public void testArithmeticOperations() {
        assertEquals(ArithmeticOperations.add(2, 3), 5);
        assertEquals(ArithmeticOperations.subtract(2, 3), -1);
        assertEquals(ArithmeticOperations.divide(4, 2), 2.0);
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(4, 0));
        assertEquals(ArithmeticOperations.multiply(2, 3), 6);
    }

    @Test
    @Description("Сравнение двух целых чисел")
    public void testCompareNumbers() {
        assertEquals(CompareNumbers.compare(5, 3), "5 больше 3");
        assertEquals(CompareNumbers.compare(3, 5), "3 меньше 5");
        assertEquals(CompareNumbers.compare(5, 5), "5 равно 5");
    }
}