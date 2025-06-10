import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArithmeticOperationsTest {

    private ArithmeticOperations arithmeticOperations;

    @BeforeClass
    public void setUp() {
        arithmeticOperations = new ArithmeticOperations();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(arithmeticOperations.add(2, 3), 5);
        Assert.assertEquals(arithmeticOperations.add(-1, 1), 0);
        Assert.assertEquals(arithmeticOperations.add(-1, -1), -2);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(arithmeticOperations.subtract(5, 3), 2);
        Assert.assertEquals(arithmeticOperations.subtract(3, 5), -2);
        Assert.assertEquals(arithmeticOperations.subtract(-1, -1), 0);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(arithmeticOperations.multiply(2, 3), 6);
        Assert.assertEquals(arithmeticOperations.multiply(-1, 1), -1);
        Assert.assertEquals(arithmeticOperations.multiply(-1, -1), 1);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(arithmeticOperations.divide(6, 3), 2.0);
        Assert.assertEquals(arithmeticOperations.divide(-6, 3), -2.0);
        Assert.assertEquals(arithmeticOperations.divide(5, 2), 2.5);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        arithmeticOperations.divide(1, 0);
    }
}