import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CompareNumbersTest {

    private CompareNumbers compareNumbers;

    @BeforeClass
    public void setUp() {
        compareNumbers = new CompareNumbers();
    }

    @Test
    public void testCompareGreater() {
        Assert.assertEquals(compareNumbers.compare(5, 3), "5 больше 3");
        Assert.assertEquals(compareNumbers.compare(10, 7), "10 больше 7");
    }

    @Test
    public void testCompareSmaller() {
        Assert.assertEquals(compareNumbers.compare(2, 4), "2 меньше 4");
        Assert.assertEquals(compareNumbers.compare(-1, 0), "-1 меньше 0");
    }

    @Test
    public void testCompareEqual() {
        Assert.assertEquals(compareNumbers.compare(3, 3), "3 равно 3");
        Assert.assertEquals(compareNumbers.compare(-5, -5), "-5 равно -5");
    }
}