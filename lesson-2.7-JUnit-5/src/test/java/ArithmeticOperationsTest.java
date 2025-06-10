import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArithmeticOperationsTest {

    private ArithmeticOperations arithmeticOperations;

    @BeforeEach
    public void setUp() {
        arithmeticOperations = new ArithmeticOperations();
    }

    @Test
    public void testAdd() {
        Assertions.assertEquals(5, arithmeticOperations.add(2, 3));
        Assertions.assertEquals(0, arithmeticOperations.add(-2, 2));
        Assertions.assertEquals(-5, arithmeticOperations.add(-2, -3));
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(-1, arithmeticOperations.subtract(2, 3));
        Assertions.assertEquals(-4, arithmeticOperations.subtract(-2, 2));
        Assertions.assertEquals(1, arithmeticOperations.subtract(-2, -3));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(6, arithmeticOperations.multiply(2, 3));
        Assertions.assertEquals(-4, arithmeticOperations.multiply(-2, 2));
        Assertions.assertEquals(6, arithmeticOperations.multiply(-2, -3));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(2.0, arithmeticOperations.divide(6, 3));
        Assertions.assertEquals(-1.0, arithmeticOperations.divide(-2, 2));
        Assertions.assertEquals(1.0, arithmeticOperations.divide(-3, -3));
    }

    @Test
    public void testDivideByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> arithmeticOperations.divide(1, 0));
    }
}