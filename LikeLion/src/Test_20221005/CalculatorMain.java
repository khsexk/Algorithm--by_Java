package Test_20221005;

public class CalculatorMain {
    public static void main(String[] args) {
        int a = 1, b = 2;

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(a, b));
        System.out.println(calculator.minus(a, b));
        System.out.println(calculator.multi(a, b));
        System.out.println(calculator.divide(a, b));
    }
}