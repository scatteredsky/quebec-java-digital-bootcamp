package exceptionHandling;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExceptionExample extends Exception {
    public static void main(String[] args) {
        Number price;

        try {
            price = NumberFormat.getInstance().parse("a1.75");
            System.out.println(price);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("The value informed is not a number.");
        }
    }
}