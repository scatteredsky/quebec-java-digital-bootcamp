package controleDeFluxos;

import java.util.Random;

/*

–Do While– executes the code first (at least once) and only then tests the conditions

 */
public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Calling…");
        do {
            // running the code until the condition is met
            System.out.println("The phone is ringing!");
        } while(ringing());

        System.out.println("Hello!");
    }

    private static boolean ringing() {
        boolean pickedUp = new Random().nextInt(3)==1;
        System.out.println("Picked up? " + pickedUp);
        // Not ringing:
        return !pickedUp;
    }

}
