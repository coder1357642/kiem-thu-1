import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(6, calculator.add(6, 0), "6 + 0 should equal 6");
        assertEquals(-7, calculator.add(20, -27), "20 + (-27) should equal -7");
        assertEquals(0, calculator.add(0, 0), "0 + 0 should equal 0");
        assertEquals(-8, calculator.add(0, -8), "0 + (-8) should equal -8");
        assertEquals(-5, calculator.add(-2, -3), "-2 + (-3) should equal -5");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();

        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
        assertEquals(6, calculator.subtract(6, 0), "6 - 0 should equal 6");
        assertEquals(47, calculator.subtract(20, -27), "20 - (-27) should equal 47");
        assertEquals(0, calculator.subtract(0, 0), "0 - 0 should equal 0");
        assertEquals(16, calculator.subtract(0, -16), "0 - (-16) should equal 16");
        assertEquals(1, calculator.subtract(-2, -3), "-2 - (-3) should equal 1");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();

        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(0, calculator.multiply(6, 0), "6 * 0 should equal 0");
        assertEquals(-540, calculator.multiply(20, -27), "20 * (-27) should equal -540");
        assertEquals(0, calculator.multiply(0, 0), "0 * 0 should equal 0");
        assertEquals(0, Math.abs(calculator.multiply(0, -16)), "0 * (-16) should equal 0");
        assertEquals(6, calculator.multiply(-2, -3), "-2 * (-3) should equal 6");
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();

        assertEquals(2, calculator.divide(6, 3), "6 / 3 should equal 2");
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0), "Dividing by zero should throw IllegalArgumentException");
        assertEquals(-0.7407407, calculator.divide(20, -27), 1e-6, "20 / (-27) should equal -0.7407407");
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(0, 0), "Dividing by zero should throw IllegalArgumentException");
        assertEquals(0, Math.abs(calculator.divide(0, -16)), "0 / (-16) should equal 0");
        assertEquals(0.6666667, calculator.divide(-2, -3), 0.0001, "-2 / (-3) should equal 0.67");
    }


    @Test
    public void testAdditionAndMultiplicationIntegration() {
        Calculator calculator = new Calculator();
        double sum = calculator.add(2, 3); // 2 + 3 = 5
        double result = calculator.multiply(sum, 2); // 5 * 2 = 10
        assertEquals(10, result, "The result of adding and multiplying should be 10");
    }
}
