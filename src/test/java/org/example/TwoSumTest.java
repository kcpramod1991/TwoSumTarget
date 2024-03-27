package org.example;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;


public class TwoSumTest {
    @Test
    public void testBasicCase() {
        TwoSum twoSum = new TwoSum();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.searchIndicesForTargetSum(numbers, target));
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        TwoSum twoSum = new TwoSum();
        int[] numbers = {-3, 4, 3, 90};
        int target = 0;
        int[] expected = {0, 2};
        assertArrayEquals(expected, twoSum.searchIndicesForTargetSum(numbers, target));
    }

    @Test
    public void testArrayWithDuplicates() {
        TwoSum twoSum = new TwoSum();
        int[] numbers = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.searchIndicesForTargetSum(numbers, target));
    }

    @Test
    public void testTargetSumNotPossible() {
        TwoSum twoSum = new TwoSum();
        int[] numbers = {1, 2, 3, 4};
        int target = 8;
        assertThrows(IllegalArgumentException.class, () -> twoSum.searchIndicesForTargetSum(numbers, target));
    }

    @Test
    public void testEmptyArray() {
        TwoSum twoSum = new TwoSum();
        int[] numbers = {};
        int target = 10;
        assertThrows(IllegalArgumentException.class, () -> twoSum.searchIndicesForTargetSum(numbers, target));
    }

    @Test
    public void testSingleElementArray() {
        TwoSum twoSum = new TwoSum();
        int[] numbers = {5};
        int target = 5;
        assertThrows(IllegalArgumentException.class, () -> twoSum.searchIndicesForTargetSum(numbers, target));
    }
}