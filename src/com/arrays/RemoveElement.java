package com.arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        // Initialize a pointer j to track the next position to place elements that are not equal to val
        int j = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Place the element at the current j position
                nums[j] = nums[i];
                // Move j to the next position
                j++;
            }
        }

        // Return the count of elements that are not equal to val
        return j;
    }

    public static void main(String[] args) {
        // Test the code with a sample array and value to remove
        int[] nums = {3, 2, 2, 3, 4, 3};
        int val = 3;

        // Call the removeElement function and store the result
        int count = removeElement(nums, val);

        // Print the modified array and the count of remaining elements
        System.out.println("Array after removing " + val + ":");
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println("\nNumber of elements remaining: " + count);
    }
}
