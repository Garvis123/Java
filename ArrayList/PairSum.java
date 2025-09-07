package ArrayList;

import java.util.Arrays;

public class PairSum {
    public static void Paired(int arr[]) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        int target = 9;
        boolean found = false;  // flag to check if pair is found

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                System.out.println("Pair found at indices: " + i + " and " + j);
                found = true;
                break;  // stop after finding one pair
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 11, 15, 7};
        Paired(arr);
    }
}
