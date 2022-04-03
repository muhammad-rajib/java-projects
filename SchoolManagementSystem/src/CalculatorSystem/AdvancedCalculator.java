package CalculatorSystem;

public class AdvancedCalculator extends SimpleCalculator {

    // override
    public static void add(int a, int b)
    {
        System.out.println("Result: " + (a+b));
    }

    // overloading
    public static void add(int a, int b, int c) {
        System.out.println("Result: " + (a+b+c));
    }

    public static void multiply(int a, int b)
    {
        System.out.println("Result: " + (a*b));
    }

    public static void div(double a, double b)
    {
        System.out.println("Result: " + (a / b));
    }
}
