import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    @DisplayName("Факториал числа")
    public void testFactorial() {
        assertEquals(120, Factorial.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }

    @Test
    @DisplayName("Площадь треугольника")
    public void testTriangleArea() {
        assertEquals(10.0, TriangleArea.area(4, 5));
        assertThrows(IllegalArgumentException.class, () -> TriangleArea.area(-1, 5));
    }

    @Test
    @DisplayName("Арифметические действия")
    public void testArithmeticOperations() {
        assertEquals(5, ArithmeticOperations.add(2, 3));
        assertEquals(-1, ArithmeticOperations.subtract(2, 3));
        assertEquals(2.0, ArithmeticOperations.divide(4, 2));
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(4, 0));
        assertEquals(6, ArithmeticOperations.multiply(2, 3));
    }

    @Test
    @DisplayName("Сравнение двух целых цисел")
    public void testCompareNumbers() {
        assertEquals("5 больше 3", CompareNumbers.compare(5, 3));
        assertEquals("3 меньше 5", CompareNumbers.compare(3, 5));
        assertEquals("5 равно 5", CompareNumbers.compare(5, 5));
    }
}