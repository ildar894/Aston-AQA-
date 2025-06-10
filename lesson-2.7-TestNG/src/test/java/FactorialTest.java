import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FactorialTest {

    private Factorial factorial;

    @BeforeClass
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(factorial.factorial(0), 1);
    }

    @Test
    public void testFactorialOfPositiveNumbers() {
        Assert.assertEquals(factorial.factorial(1), 1);
        Assert.assertEquals(factorial.factorial(2), 2);
        Assert.assertEquals(factorial.factorial(3), 6);
        Assert.assertEquals(factorial.factorial(4), 24);
        Assert.assertEquals(factorial.factorial(5), 120);
        Assert.assertEquals(factorial.factorial(10), 3628800);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        factorial.factorial(-1);
    }
}