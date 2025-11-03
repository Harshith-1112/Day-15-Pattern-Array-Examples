package com.codegnan.patternexamples;

public class SumFirstTwo {

    public static int SumFirstTwoNumbers(int[] arr) {
    	if(arr==null || arr.length==0) {
    		return 0;
    	}else if(arr.length==1) {
    		return arr[0];
    	}else {
    		return arr[0]+arr[1];
    	}
    }
    public static void main(String[] args) {
    	int[] arr1= {1,2,3};
    	System.out.println("	Sum:"+SumFirstTwoNumbers(arr1));
    	int[] arr2= {1};
    	System.out.println("	Sum:"+SumFirstTwoNumbers(arr2));
    	int[] arr3= {5,5};
    	System.out.println("	Sum:"+SumFirstTwoNumbers(arr3));
    	int[] arr4= {};
    	System.out.println("	Sum:"+SumFirstTwoNumbers(arr4));
    	
    	/*
        if (arr.length == 0)
            return 0;
        else if (arr.length == 1)
            return arr[0];
        else
            return arr[0] + arr[1];
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {5, 5};
        int[] arr3 = {8, 2, 1, 4};
        int[] arr4 = {};

        public static void main(String[] args) { // 3
        System.out.println(SumFirstTwoNumbers(arr2)); // 10
        System.out.println(SumFirstTwoNumbers(arr3)); // 10
        System.out.println(SumFirstTwoNumbers(arr4)); // 0   */
    	
    }
}