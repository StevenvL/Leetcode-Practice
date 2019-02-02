package squaresOfASortedArray;

import java.util.*;

public class Solution {
	public int[] sortedSquares(int[] A) {
		for (int i = 0; i < A.length; i++) {
			A[i] = A[i] *A[i];
		}
		Arrays.sort(A);
		return A;
	}

	public static void main(String args[]) {
		Solution tester = new Solution();
		int[] data = { -4, -1, 0, 3, 10 };
		data = tester.sortedSquares(data);
		System.out.println(Arrays.toString(data));
	}
}