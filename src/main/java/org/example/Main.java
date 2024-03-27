package org.example;

public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] numbers = {2,7,11,15};
        int target = 6;

        try {
            int[] result = twoSum.searchIndicesForTargetSum(numbers, target);

            // 1 is added to get the index value as the problem suggest to start from index 1;
            int firstIndex = result[0] + 1;
            int secondIndex = result[1] + 1;

            System.out.println("Indices of the two numbers that add up to " + target + ": [" + firstIndex + ", " + secondIndex + "]");
        } catch (IllegalArgumentException e) {
            System.out.println("No valid indices found.");
        }
    }
}