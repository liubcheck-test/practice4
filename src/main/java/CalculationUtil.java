public class CalculationUtil {
    public static double sum(double a, double b) {
        return a + b;
    }

    public static double dec(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new ZeroException("Division on 0 is forbidden, try another number");
        }
        return a / b;
    }
}