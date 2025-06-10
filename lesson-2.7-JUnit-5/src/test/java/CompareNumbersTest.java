import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompareNumbersTest {

    private CompareNumbers compareNumbers;

    @BeforeEach
    public void setUp() {
        compareNumbers = new CompareNumbers();
    }

    @Test
    public void testCompareGreater() {
        Assertions.assertEquals("5 больше 3", compareNumbers.compare(5, 3));
        Assertions.assertEquals("10 больше 7", compareNumbers.compare(10, 7));
    }

    @Test
    public void testCompareSmaller() {
        Assertions.assertEquals("2 меньше 4", compareNumbers.compare(2, 4));
        Assertions.assertEquals("-1 меньше 0", compareNumbers.compare(-1, 0));
    }

    @Test
    public void testCompareEqual() {
        Assertions.assertEquals("3 равно 3", compareNumbers.compare(3, 3));
        Assertions.assertEquals("-5 равно -5", compareNumbers.compare(-5, -5));
    }
}