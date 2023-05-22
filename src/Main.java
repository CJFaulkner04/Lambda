import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    //Task 2
    @FunctionalInterface
    interface SimpleFunction {
        int calculate(int a, int b);
    }
    public static void main(String[] args) {
        //Task 1
        SimpleFunction add = (a, b) -> {
            int result = a + b;
            return result;
        };
        SimpleFunction sub = (a, b) -> {
            int result = a - b;
            return result;
        };
        SimpleFunction mul = (a, b) -> {
            int result = a * b;
            return result;
        };
        SimpleFunction div = (a, b) -> {
            int result = a / b;
            return result;
        };

        System.out.println("----Add----");
        System.out.println(add.calculate(4,2));
        System.out.println("--Subtract--");
        System.out.println(sub.calculate(4,2));
        System.out.println("--Multiply--");
        System.out.println(mul.calculate(4,2));
        System.out.println("---Divide---");
        System.out.println(div.calculate(4,2));


        //Task 3
        Function<Integer, Integer> square = x -> x*x;
        System.out.println("---Square---");
        System.out.println(square.apply(3));
        Predicate<String> longStr = (str) -> str.length() > 10;
        System.out.println("--Predicate--");
        System.out.println(longStr.test("Hello, World!"));
        Consumer<String> printMessage = message -> System.out.println("Hello " + message);
        System.out.println("--Consumer--");
        printMessage.accept("Mr. Hector");
        Supplier<Double> randomDouble = () -> Math.random();
        System.out.println("--Supplier--");
        System.out.println("Random double: " + randomDouble.get());

    }
}