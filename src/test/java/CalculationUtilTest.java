import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculationUtilTest {
    private final double errorNumber = 0.00000001;

    @Test
    public void sum_NotOk() {
        double a = 3.456;
        double b = 1.21598;
        assertNotEquals(a + b + errorNumber, CalculationUtil.sum(a, b));
    }

    @Test
    public void sum_Ok() {
        double a = 3.456;
        double b = 1.21598;
        assertEquals(a + b, CalculationUtil.sum(a, b));
    }

    @Test
    public void dec_NotOk() {
        double a = 3.456;
        double b = 1.21598;
        assertNotEquals(a - b - errorNumber, CalculationUtil.dec(a, b));
    }

    @Test
    public void dec_Ok() {
        double a = 3.456;
        double b = 1.21598;
        assertEquals(a - b, CalculationUtil.dec(a, b));
    }

    @Test
    public void mul_NotOk() {
        double a = 1.0;
        double b = 3;
        assertNotEquals(a * b + errorNumber, CalculationUtil.mul(a, b));
    }

    @Test
    public void mul_Ok() {
        double a = 1.0;
        double b = 3;
        assertEquals(a * b, CalculationUtil.mul(a, b));
    }

    @Test
    public void div_NotOk() {
        double a = 10;
        double b = 3;
        assertNotEquals(a / b - errorNumber, CalculationUtil.div(a, b));
    }

    @Test
    public void div_OnZero_NotOk() {
        double a = 2.34;
        double b = 0;
        assertThrows(ZeroException.class, () -> CalculationUtil.div(a, b));
    }

    @Test
    public void div_Ok() {
        double a = 10;
        double b = 3;
        assertEquals(a / b, CalculationUtil.div(a, b));
    }
}