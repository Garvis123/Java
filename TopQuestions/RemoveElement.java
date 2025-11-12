package TopQuestions;

public class RemoveElement {
    public static int remove(int[] nums, int val) {
        int k = 0; // pointer for placing next non-val number

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++; // move the placement pointer
            }
        }

        return k; // number of elements that are not equal to val
    }

    public static void main(String[] args) {
        int nums[] = {3, 2, 2, 3};
        int val = 3;
        int k = remove(nums, val);

        System.out.println("k = " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
