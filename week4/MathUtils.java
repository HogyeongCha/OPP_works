package week4;

public class MathUtils {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return factorial(n-1) * n;
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, (a % b));
        }
    }

    public static int lcm(int a, int b) {
        return ((a * b) / gcd(a, b));
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Is 17 prime? " + isPrime(17));
        System.out.println("GCD of 48 and 18: " + gcd(48, 18));
        System.out.println("LCM of 12 and 18: " + lcm(12, 18));
    }
}
