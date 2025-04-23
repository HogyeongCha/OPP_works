package week7.LA2;

public class DistinguishTriangle {
    public static int distinguish(double a, double b, double c) {
        double max = Math.max(a, Math.max(b, c));
        double sumSquares = a * a + b * b + c * c - max * max;

        if (sumSquares - max * max == 0) {
            return 0;
        } else if (sumSquares < max * max) {
            return 1;
        } else {
            return 2;
        }
    }
}