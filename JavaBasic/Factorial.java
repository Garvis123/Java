package JavaBasic;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");  // Prompt for input
        int a = sc.nextInt();
        sc.close();  // Close scanner

        long fact = 1; // Changed from int to long

        for (int i = 1; i <= a; i++) {
            fact *= i; // Multiplying numbers from 1 to a
        }

        System.out.println("Factorial of " + a + " is: " + fact);
    }
}
