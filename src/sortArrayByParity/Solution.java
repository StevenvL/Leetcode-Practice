package sortArrayByParity;

import java.util.Arrays;

class Solution {
	public int[] sortArrayByParity(int[] A) {
		int[] result = new int[A.length];
		int evenIndex = 0;
		int oddIndex = A.length-1;

		for(int current : A) {
			if(current%2 == 0) {
				result[evenIndex++] = current;
				//evenIndex++;
			}
			else {
				result[oddIndex--] = current;
				//oddIndex--;
			}
		}
		return result;
	}
	
	public static void main (String args[]) {
		Solution tester = new Solution();
		int[] data = {3,1,2,4};
		System.out.println(Arrays.toString(tester.sortArrayByParity(data)));
		
	}
}

/**
 * https://leetcode.com/problems/sort-array-by-parity/ 
 * Example 1:
 * 
 * Input: [3,1,2,4] 
 * Output: [2,4,3,1] The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * 
 * Runtime: 10 ms, faster than 44.99% of Java online submissions for Sort Array By Parity.
 * Memory Usage: 32.1 MB, less than 7.46% of Java online submissions for Sort Array By Parity.
 **/
