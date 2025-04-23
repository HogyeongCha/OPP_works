package week7.LA2;

public class ValidateTriangle {
    public static void isUnderZero(double a, double b, double c) throws UNDER_0_EXCEPTION {
        if (a < 0 || b < 0 || c < 0) {
            throw new UNDER_0_EXCEPTION("under 0 number");
        }
    }
    public static void isZero(double a, double b, double c) throws NUMBER_IS_0_EXCEPTION {
        if (a == 0 || b == 0 || c == 0) {
            throw new NUMBER_IS_0_EXCEPTION("0 value number");
        }
    }
    public static void canBeTriangle(double a, double b, double c) throws Exception {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new Exception("cannot create a triangle");
        }
    }
}