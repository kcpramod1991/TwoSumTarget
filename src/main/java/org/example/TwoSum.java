package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Finds the indices of two numbers in an array that add up to a target sum.
     *
     * @param numbers an array of integers
     * @param target  the target sum to find
     * @return an array containing the indices of the two numbers
     * @throws IllegalArgumentException if no two numbers in the array add up to the target sum
     */
    public int[] searchIndicesForTargetSum(int[] numbers, int target) {
        // Map to store the index of each number
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            // Calculate the difference to reach the target
            int difference = target - numbers[i];

            // If the difference exists in the map then return the indices of the current number and the difference
            if (indexMap.containsKey(difference)) {
                return new int[]{indexMap.get(difference), i};
            }

            indexMap.put(numbers[i], i);
        }
        throw new IllegalArgumentException();
    }
}
