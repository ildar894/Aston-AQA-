import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TriangleAreaTest {

    private TriangleArea triangleArea;

    @BeforeEach
    public void setUp() {
        triangleArea = new TriangleArea();
    }

    @Test
    public void testAreaWithValidInputs() {
        Assertions.assertEquals(0.0, triangleArea.area(0, 5), 0.001);
        Assertions.assertEquals(10.0, triangleArea.area(4, 5), 0.001);
        Assertions.assertEquals(15.0, triangleArea.area(6, 5), 0.001);
        Assertions.assertEquals(25.0, triangleArea.area(10, 5), 0.001);
    }

    @Test
    public void testAreaWithNegativeBase() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> triangleArea.area(-1, 5));
    }

    @Test
    public void testAreaWithNegativeHeight() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> triangleArea.area(5, -1));
    }
}