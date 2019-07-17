
public class MaximumSubArray {
	public static int maxSubArray(int[] arr) {
		// https://leetcode.com/problems/maximum-subarray/
		//Runtime: 1 ms, faster than 89.65% of Java online submissions for Maximum Subarray.
		//Memory Usage: 43.2 MB, less than 5.04% of Java online submissions for Maximum Subarray.
		int maxCur = arr[0];
		int maxReturn = arr[0];
		for (int i = 1; i < arr.length; i++) {
			maxCur = Math.max(arr[i], maxCur + arr[i]);
			maxReturn = Math.max(maxReturn, maxCur);
		}
		return maxReturn;
	}

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 }; // ans = 6;
		int[] arr2 = {-2, 1}; // ans = 1;
		System.out.println(maxSubArray(arr));
	}
}
