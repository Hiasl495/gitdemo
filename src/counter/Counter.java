package counter;

import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {

        System.out.println("This is a basic counter.");

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the first digit: ");

        while (in.hasNextLine()) {

            int s1 = in.nextInt();

            System.out.println("Now enter the operator: ");

            String op = in.next();

            System.out.println("Enter the second digit: ");

            int s2 = in.nextInt();

            int result = 0;

            switch (op) {
                case "+":
                    result = s1 + s2;
                    System.out.println("The result is: " + result);
                    break;
                case "-":
                    result = s1 - s2;
                    System.out.println("The result is: " + result);
                    break;
                case "*":
                    result = s1 * s2;
                    System.out.println("The result is: " + result);
                    break;
                case "/":
                    result = s1 / s2;
                    System.out.println("The result is: " + result);
                    break;
                default:
                    throw new IllegalArgumentException("The operator " + op  + "is not a valid input.");
            }
        }
    }
}
