package controleDeFluxos;

import java.util.concurrent.ThreadLocalRandom;

/* Structure of the loop control WHILE is as follows:

while (boolean expression for validation) { // this expression must be TRUE
    // commands that will be executed until the
    //validation expression turns out to be false
}

* */
public class ExampleWhile {
    public static void main(String[] args) {
        double stipend = 50.0;
        while(stipend > 0) {
            Double sweetsPrice = randomPrice();
            if (sweetsPrice > stipend)
                sweetsPrice = stipend;
            System.out.println("Sweets Price:" + sweetsPrice + " was added to Cart");
            stipend = stipend - sweetsPrice;
        }
        System.out.println("Stipend: " + stipend);
        System.out.println("Mary spent all her stipend in sweets.");
    }

    private static double randomPrice() {
        return ThreadLocalRandom.current().nextDouble(2, 8); // First number = minimum price, Second number = maximum price
    }

}
