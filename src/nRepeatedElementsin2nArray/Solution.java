package nRepeatedElementsin2nArray;

import java.util.Arrays;
//Other solutions : https://leetcode.com/problems/n-repeated-element-in-size-2n-array/discuss/?currentPage=1&orderBy=most_votes&query=
public class Solution {
	 public int repeatedNTimes(int[] A) {
		 	Arrays.sort(A);
		 	System.out.println(Arrays.toString(A));
		 	int count = 1;
			int largestCount = count;
			int number = 0;
	        for(int i = 0; i < A.length-1; i++) {
	        	if(A[i] == A[i+1]) {
	        		count++;
	        		number = A[i];
	        	}
	        	else {
	        		largestCount = count;
	        		count = 1;
	        	}
	        }
	        return number;
	    }
	 
	 public static void main (String args[]) {
		 Solution tester = new Solution();
		 int[] data = {5,1,5,2,5,3,5,4};
		 System.out.println(tester.repeatedNTimes(data));
	 }
}
