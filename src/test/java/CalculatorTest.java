import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    void testNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(-10, -2);
        assertEquals(5, result);
    }

//    @Test
//    void testDivideByZero() {
//        Calculator calculator = new Calculator();
//        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
//    }
}
