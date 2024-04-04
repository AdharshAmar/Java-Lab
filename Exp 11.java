import java.util.*;
import com.mycompany.math.Calculator;

public class exp11{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter The First Number:");
        int a=s.nextInt();
        System.out.print("Enter the Second Number:");
        int b =s.nextInt();
        System.out.println("Addition: " + Calculator.add(a, b));
        System.out.println("Subtraction: " + Calculator.subtract(a, b));
        System.out.println("Multiplication: " + Calculator.multiply(a, b));

        try {
            System.out.println("Division: " + Calculator.divide(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


package com.mycompany.math;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
