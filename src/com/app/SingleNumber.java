package com.app;

public class SingleNumber {
	public static void main(String[] args) {
		int[] n= {2,2,1,1,3,4,3,4,5,4,3};
		singleNumber(n);
		
		
	}
	public static void singleNumber(int[] nums) {
        int x=0;
        for(int z: nums){
            x^=z;
        }
        //return x;
        System.out.println("Element appear only once in array is: " + x);
    }
}
