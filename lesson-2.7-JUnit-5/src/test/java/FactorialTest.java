import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    private Factorial factorial;

    @BeforeEach
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void testFactorialOfZero() {
        Assertions.assertEquals(1, factorial.factorial(0));
    }

    @Test
    public void testFactorialOfPositiveNumbers() {
        Assertions.assertEquals(1, factorial.factorial(1));
        Assertions.assertEquals(2, factorial.factorial(2));
        Assertions.assertEquals(6, factorial.factorial(3));
        Assertions.assertEquals(24, factorial.factorial(4));
        Assertions.assertEquals(120, factorial.factorial(5));
        Assertions.assertEquals(720, factorial.factorial(6));
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.factorial(-1));
    }
}