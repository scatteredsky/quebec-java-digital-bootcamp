package controleDeFluxos;

public class ExampleForArray {
    public static void main(String[] args) {
        String students [] = { "Felipe", "John", "Julia", "Mario", "Bob", "Anna" };
        for (int x=0; x < students.length; x++) {
            System.out.println("The student with index X = " + x + " is " +students[x]);
        }

        for(String student : students) { /* The : means that at each iteration of --students-- the current student will be updated */
            System.out.println("The student name is " + student);
        }
    }
}
