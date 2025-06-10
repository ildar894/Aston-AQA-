import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TriangleAreaTest {

    private TriangleArea triangleArea;

    @BeforeClass
    public void setUp() {
        triangleArea = new TriangleArea();
    }

    @Test
    public void testAreaWithPositiveValues() {
        Assert.assertEquals(triangleArea.area(4, 5), 10.0);
        Assert.assertEquals(triangleArea.area(10, 20), 100.0);
        Assert.assertEquals(triangleArea.area(3, 6), 9.0);
    }

    @Test
    public void testAreaWithZeroValues() {
        Assert.assertEquals(triangleArea.area(0, 5), 0.0);
        Assert.assertEquals(triangleArea.area(4, 0), 0.0);
        Assert.assertEquals(triangleArea.area(0, 0), 0.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithNegativeBase() {
        triangleArea.area(-1, 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithNegativeHeight() {
        triangleArea.area(5, -1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithNegativeBaseAndHeight() {
        triangleArea.area(-1, -1);
    }
}