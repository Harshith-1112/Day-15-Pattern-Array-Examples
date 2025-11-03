package com.codegnan.patternexamples;

public class FirstLast6Checker {
	public static boolean FirstLast6(int[] arr) {
		if(arr==null||arr.length==0) {
			return false;
		}else {
			if(arr[0]==6||arr[arr.length-1]==6){
				return true;
			}else {
				return false;
			}
		}
	}

	
	public static void main(String[] args) {
		int[] arr1= {4,2,5,5,6};
		System.out.println(FirstLast6(arr1));

	}

}
