import java.util.function.Predicate;

public class DecimalImpl {
    static void main() {
        Predicate<Integer> isOdd = (number) -> number % 2 != 0;
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        Predicate<Integer> isPrime = (number) -> isOdd.test(number);
        Predicate<Integer> isNotPrime = (number) -> !isPrime.test(number);
        System.out.println(isNotPrime.test(3));
        System.out.println(isPrime.test(7));
        System.out.println(isEven.test(2));
        System.out.println(isEven.test(6));
    }
}
