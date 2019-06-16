import java.util.Arrays;

/**
 * Given an array A of integers, for each integer A[i] we may choose any x with
 * -K <= x <= K, and add x to A[i].
 * 
 * After this process, we have some array B.
 * 
 * Return the smallest possible difference between the maximum value of B and
 * the minimum value of B.
 *
 * 
 * 
 */
public class SmallestRange {
	public int smallestRangeI(int[] A, int K) {
		  if(A.length == 1)
				return 0;
	        Arrays.sort(A);
			if(A[0] + K >= A[A.length-1]-K) {
				return 0;
			}
			else
				return Math.abs((A[0] + K) -(A[A.length-1] -K));
		}
	}