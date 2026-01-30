import java.util.*;
import javax.lang.model.SourceVersion;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public static PerformOperation isOdd() {
        return (a) -> a % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return (a) -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return (a) -> {
            int original = a;
            int reverse = 0;

            while (a > 0) {
                reverse = reverse * 10 + a % 10;
                a = a / 10;
            }
            return original == reverse;
        };
    }
}

public class PerformOperations {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();

            while (T-- > 0) {
                int type = sc.nextInt();
                int number = sc.nextInt();

                PerformOperation op;
                boolean result;

                switch (type) {
                    case 1 -> {
                        op = MyMath.isOdd();
                        result = op.check(number);
                        System.out.println(result ? "ODD" : "EVEN");
                    }
                    case 2 -> {
                        op = MyMath.isPrime();
                        result = op.check(number);
                        System.out.println(result ? "PRIME" : "COMPOSITE");
                    }
                    case 3 -> {
                        op = MyMath.isPalindrome();
                        result = op.check(number);
                        System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
                    }
                    default -> {
                    }
                }
            }
        }
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}
