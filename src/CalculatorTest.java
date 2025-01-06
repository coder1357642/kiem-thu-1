import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should equal 2");
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0), "Dividing by zero should throw IllegalArgumentException");
    }

    @Test
    public void testAddWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.add(-2, 1), "-2 + 1 should equal -1");
    }

    @Test
    public void testSubtractWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(-2, -1), "-2 - (-1) should equal -1");
    }

    @Test
    public void testMultiplyWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(0, 5), "0 * 5 should equal 0");
    }

    @Test
    public void testDivideWithZeroNumerator() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.divide(0, 5), "0 / 5 should equal 0");
    }

    @Test
    public void testAddWithLargeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2000000000, calculator.add(1000000000, 1000000000), "1000000000 + 1000000000 should equal 2000000000");
    }

    @Test
    public void testAdditionAndMultiplicationIntegration() {
        Calculator calculator = new Calculator();
        int sum = calculator.add(2, 3); // 2 + 3 = 5
        int result = calculator.multiply(sum, 2); // 5 * 2 = 10
        assertEquals(10, result, "The result of adding and multiplying should be 10");
    }

    @Test
    public void testBoundaryAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MIN_VALUE, result, "Overflow occurred with large integer addition");
    }
}
