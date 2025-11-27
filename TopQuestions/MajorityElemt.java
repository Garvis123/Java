package TopQuestions;
import java.util.*;

public class MajorityElemt {

    public List<Integer> majority(int nums[]) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            // FIX 1: check the value, not the index
            if (result.contains(nums[i])) continue;

            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > n / 3) {
                result.add(nums[i]);
            }
        }

        return result;
    }

    public static void main(String args[]) {
        int nums[] = {3, 2, 3};

        // FIX 2: create object
        MajorityElemt obj = new MajorityElemt();
        System.out.println(obj.majority(nums));
    }
}
