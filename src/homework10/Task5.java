package homework10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Task5 {
    public static void main(String[] args) {
        UnaryOperator<List<Integer>> removeNegatives = list -> {
            list.removeIf(n -> n < 0);
            return list;
        };

        BinaryOperator<Integer> maxOp = Math::max;

        List<Integer> nums = new ArrayList<>(Arrays.asList(3, -1, 7, -5, 10, 0));
        System.out.println("Original list: " + nums);
        removeNegatives.apply(nums);
        System.out.println("After removing: " + nums);

        int maxNumber = nums.getFirst();
        for (Integer num : nums) {
            maxNumber = maxOp.apply(maxNumber, num);
        }
        System.out.println("Max number: " + maxNumber);
    }
}
