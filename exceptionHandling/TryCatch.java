package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
            // First message
            System.out.println("================================================");
            System.out.println("Input your data below!");
            System.out.println("================================================");

            // creating the object scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("What's  your name? ");
            String name = scanner.next();

            System.out.println("What's your surname? ");
            String surname = scanner.next();

            System.out.println("What's your age? ");
            int age = scanner.nextInt();

            System.out.println("What's your height? (in cm)");
            double height = scanner.nextDouble();

            // Printing the input data
            System.out.println("Hi! My name is " + name.toUpperCase() + " " + surname.toUpperCase());
            System.out.println("I am " + age + " years old.");
            System.out.println("My height is " + height + "cm.");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("The fields AGE and HEIGHT must be numeric.");
        }

    }
}
