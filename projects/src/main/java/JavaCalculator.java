import java.util.*;

public class JavaCalculator {

    public static void main(String[] args) {

        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name!\n");
        name = scanner.nextLine();
        System.out.println(name + " Would you like to add, subtract, divide, or multiply?");

        String Input = scanner.next();

       if (Input.equalsIgnoreCase("add")) {

            System.out.println("Enter first number to add ");

            int FirstNumber = scanner.nextInt();

            System.out.println(FirstNumber + " + ");
            System.out.println("Enter your second number ");

            int SecondNumber = scanner.nextInt();

            System.out.println(FirstNumber + " + " + SecondNumber + " = ");
            System.out.println(FirstNumber + SecondNumber);
            System.exit(0);

        } else if (Input.equalsIgnoreCase("subtract")) {
            System.out.println("Enter first number to subtract ");

            int FirstNumber = scanner.nextInt();

            System.out.println(FirstNumber + " - ");
            System.out.println("Enter your second number ");

            int SecondNumber = scanner.nextInt();

            System.out.println(FirstNumber + " - " + SecondNumber + " = ");
            System.out.println(FirstNumber - SecondNumber);
            System.exit(0);

        } else if (Input.equalsIgnoreCase("multiply")) {
            System.out.println("Enter first number to multiply ");

            int FirstNumber = scanner.nextInt();

            System.out.println(FirstNumber + " * ");
            System.out.println("Enter your second number ");

            int SecondNumber = scanner.nextInt();

            System.out.println(FirstNumber + " * " + SecondNumber + " = ");
            System.out.println(FirstNumber * SecondNumber);
            System.exit(0);

        } else if (Input.equalsIgnoreCase("divide")) {
            System.out.println("Enter first number to divide ");

            int FirstNumber = scanner.nextInt();

            System.out.println(FirstNumber + " / ");
            System.out.println("Enter your second number ");

            int SecondNumber = scanner.nextInt();

            System.out.println(FirstNumber + " / " + SecondNumber + " = ");
            System.out.println(FirstNumber / SecondNumber);
            System.exit(0);
        }

        if (!Input.equalsIgnoreCase("add") || !Input.equalsIgnoreCase("subtract") || !Input.equalsIgnoreCase("multiply") || !Input.equalsIgnoreCase("divide")) ;
        {
            System.out.println("Invalid input, please restart");
            System.exit(1);
        }
    }
}