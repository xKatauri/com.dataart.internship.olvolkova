import org.junit.jupiter.api.Test;
public class Task1 {
    @Test
    public void test() {
        final int UPPER_BOUND = 14;
        long factorial = factorial(UPPER_BOUND);
        System.out.println(factorial);
        int sum = 0;
        System.out.println(sum);
        final int LOWER_BOUND = 1;

        double avg;

        for (int i = LOWER_BOUND; i < UPPER_BOUND; i++ ) {
            sum += i;
        }
        avg = sum/UPPER_BOUND;
        System.out.println(sum);
        System.out.println("The sum is " + sum);
    }

    public long factorial(long upperBound) {
        if (upperBound <= 1) {
            return 1;
        }
        else {
            return upperBound * factorial(upperBound - 1);
        }
    }

    public class Add2Integers {
        public static void task2 () {
            int num1 = 2;
            int num2 = 9;
            int sum = num1+num2;

            System.out.println("First number is " + num1);
            System.out.println("Second number is " + num2);
            System.out.println("task1.Summary is " + sum);

        }

    }
}
