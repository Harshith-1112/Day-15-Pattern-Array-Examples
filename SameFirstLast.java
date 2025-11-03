package com.codegnan.patternexamples;

public class SameFirstLast {
	public static boolean sameFirstLast(int[] nums) {
        if (nums.length >= 0 && nums[0] == nums[nums.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1};
        int[] arr2 = {7, 2, 7};
        int[] arr3 = {5};
        int[] arr4 = {1, 2, 3};

        System.out.println(sameFirstLast(arr1)); 
        System.out.println(sameFirstLast(arr2));
        System.out.println(sameFirstLast(arr3));
        System.out.println(sameFirstLast(arr4));
    }
}
