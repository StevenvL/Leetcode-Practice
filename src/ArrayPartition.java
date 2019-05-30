/**
 * Given an array of 2n integers, your task is to group these integers into n
 * pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of
 * min(ai, bi) for all i from 1 to n as large as possible.
 * 
 * Example 1: Input: [1,4,3,2]
 * 
 * Output: 4 Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2)
 * + min(3, 4).
 * 
 *
 *make the sum of min(a pair of int) as high as possible.
 *
 *you want the differnece between two numbers in a pair to be closest to 1.
 */
public class ArrayPartition {
	public int arrayPairSum(int[] nums) {
		for(int i = 0; i < nums.length/2; i++) {
			int difference = Integer.MAX_VALUE;
			int minPair = 0;
			for(int j = i+1; j < nums.length-1;j++) {
				int tempDifference = Math.abs(nums[j] - nums[i]);
				if(tempDifference == 1 || tempDifference < difference) {
					difference = tempDifference;
					minPairIndex = j;
					nums[j] = 0;
				}
			
			}
		}
	}
}
