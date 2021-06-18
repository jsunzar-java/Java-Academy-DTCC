package assignment_2.basic_arithmetic;

public class BasicArithmetic {
    public static void main (String args[]) {
        System.out.println(String.format("Addition Asserts Correctly: %b", add(1 , 1) == 2));
        System.out.println(String.format("Subtraction Asserts Correctly: %b", subtract(3 , 2 ) == 1));
        System.out.println(String.format("Multiplication Asserts Correctly: %b", multiply(5, 5) == 25));
        System.out.println(String.format("Division Asserts Correctly: %b", divide(3, 10) == 3));
        System.out.println(String.format("Remainder Asserts Correctly: %b",remainder(3, 10) == 1));
        System.out.println(String.format("Special Asserts Correctly: %b", (10 * 10 + (1 + 3 * ( 5 - 2 ) / 3) + 1 * 2 - 1 * 3) == 103));
    }

    public static int add(int x , int y) {
        return x+y;
    }

    public static int subtract(int x, int y) {return x-y;}

    public static int multiply(int x, int y) {return x*y;}

    public static int divide(int x, int y) {return (y/x);}

    public static int remainder(int x, int y) {return  (y%x);}

    public static int special(int x, int y, int z, int a, int b) {
        return (x*x+(y+z*(a - b) /z) + y * b - y * z);
    }
}
