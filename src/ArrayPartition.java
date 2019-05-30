import java.util.Arrays;

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
 * make the sum of min(a pair of int) as high as possible.
 *
 * you want the differnece between two numbers in a pair to be closest to 1.
 * 
 * Runtime: 15 ms, faster than 68.22% of Java online submissions for Array
 * Partition I. 
 * Memory Usage: 38.6 MB, less than 99.83% of Java online
 * submissions for Array Partition I.
 */
public class ArrayPartition {
	public static int arrayPairSum(int[] nums) {
		int total = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i = i + 2) {
			total += Math.min(nums[i], nums[i + 1]);
		}
		return total;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(arrayPairSum(nums));
	}
}
