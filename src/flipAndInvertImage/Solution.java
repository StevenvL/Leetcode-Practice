package flipAndInvertImage;

import java.util.Arrays;

public class Solution {
	public int[][] flipAndInvertImage(int[][] A) {
		flipImage(A);
		invertImage(A);
		return A;
	}

	public void flipImage(int[][] A) { // flip = reverse [0,1,1] => [1,0,0]
		for (int row = 0; row < A.length; row++) {
			int end = A[row].length - 1;
			for (int column = 0; column < A[row].length / 2; column++) {
				int temp = A[row][column];
				A[row][column] = A[row][end];
				A[row][end] = temp;
				end--;
			}
		}
	}

	public void invertImage(int[][] A) {
		for (int row = 0; row < A.length; row++) {
			for (int column = 0; column < A[row].length; column++) {
				if (A[row][column] == 1)
					A[row][column] = 0;
				else
					A[row][column] = 1;
			}
		}
	}

	public static void main(String args[]) {
		int data[][] = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };
		Solution tester = new Solution();
		System.out.println(Arrays.deepToString(tester.flipAndInvertImage(data)));
	}

}
/**
 * Given a binary matrix A, we want to flip the image horizontally, then invert
 * it, and return the resulting image.
 * 
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * 
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced
 * by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 * 
 * Example 1:
 * 
 * Input: [[1,1,0],[1,0,1],[0,0,0]] Output: [[1,0,0],[0,1,0],[1,1,1]]
 * 
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]]. Then, invert
 * the image: [[1,0,0],[0,1,0],[1,1,1]]
 * 
 * Example 2:
 * 
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]] Output:
 * [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 
 * Explanation: First reverse each row:
 * [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]. Then invert the
 * image:[[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 
 **/