package JavaBasic;

import java.util.Scanner;

public class Prime {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean isPrime = true;
        
        for (int i = 2; i * i <= a; i++) { // Optimized: Check only up to √a
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not a prime number");
        }
        
        
    }
}
