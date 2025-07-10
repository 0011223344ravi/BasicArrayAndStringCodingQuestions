package org.example.basicarrayandstringcodingquestions.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetsBacktracking {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); // ✅ Add current subset

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);                        // choose
            backtrack(i + 1, nums, current, result);     // explore
            current.remove(current.size() - 1);          // backtrack
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> allSubsets = subsets(nums);
        System.out.println(allSubsets);
    }
}

