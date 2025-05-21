public class Javabasic {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int k = 3;
        int count=0;

        System.out.println("Subarrays with sum = " + k + ":");

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == k) {
                    // Print subarray from i to j
                    count++;
                    
                }
            }
        }
        System.out.print(count);
    }
}
