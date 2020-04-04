package com.app;

public class HappyNumber {
		public static int sumSquare(int n){
	        int sq = 0; 
	        while (n != 0)  
	        { 
	            int digit = n % 10; 
	            sq += digit * digit; 
	            n = n / 10; 
	        } 
	        return sq; 
	    } 
	    public static boolean isHappy(int n) {
	        while (true){
	            if(n==1)
	                return true;
	            n=sumSquare(n);
	            if(n==4)
	                return false;
	        }
	    }
	    public static void main(String[] args) {
			int num=13;
			isHappy(num);
	  }
}
