import java.util.Arrays;

/**
 * Given an array A of non-negative integers, half of the integers in A are odd,
 * and half of the integers are even.
 * 
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is
 * even, i is even.
 * 
 * You may return any answer array that satisfies this condition.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: [4,2,5,7] Output: [4,5,2,7] Explanation: [4,7,2,5], [2,5,4,7],
 * [2,7,4,5] would also have been accepted.
 * 
 * 
 * Note:
 * 
 * 2 <= A.length <= 20000 A.length % 2 == 0 0 <= A[i] <= 1000
 * 
 * INDEX 
 * 0 is even
 *  1 is odd 
 *  2 is even 
 *  3 is odd
 *  
 *  Runtime: 3 ms, faster than 64.42% of Java online submissions for Sort Array By Parity II.
 *  Memory Usage: 39.8 MB, less than 99.57% of Java online submissions for Sort Array By Parity II.
 */
public class SortArrayByParity2 {
	public static int[] sortArrayByParityII(int[] A) {
		int[] result = new int[A.length];
		int evenIndex = 0;
		int oddIndex = 1;
		for (int number : A) {
			if (number % 2 == 0) {
				result[evenIndex] = number;
				evenIndex += 2;
			} else if(number % 2 == 1) {
				result[oddIndex] = number;
				oddIndex += 2;
			}
		}
		return result;
	}
	
	public static void main (String[] args) {
		int[] A = {4,2,5,7};
		System.out.println(Arrays.toString(sortArrayByParityII(A)));
	}
}