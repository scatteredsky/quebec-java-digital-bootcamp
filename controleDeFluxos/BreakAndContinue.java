package controleDeFluxos;

// Break interrupts the process/loop and
// Continue continues interrupts only the current process/loop
public class BreakAndContinue {
    public static void main(String[] args) {
        for(int number = 1; number <= 8; number++) { // even though the condition specifies that the number should be <= 8,
            if(number == 5) // when the number detected is 5
                break; // and the --break-- is detected, the code will stop here, when reaching the number 5 (counts up to 4)
            System.out.print(number + " ");
        }

        for (int number = -1; number <= 18; number++) {
            if(number == 12)
                continue; // this will make the counter skip the number expressed on the prior line (12)
            System.out.println(number);
        }

    }

}
