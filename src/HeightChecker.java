import java.util.Arrays;

/**
 * Students are asked to stand in non-decreasing order of heights for an annual
 * photo.
 * 
 * Return the minimum number of students not standing in the right positions.
 * (This is the number of students that must move in order for all students to
 * be standing in non-decreasing order of height.)
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: [1,1,4,2,1,3] Output: 3 Explanation: Students with heights 4, 3 and
 * the last 1 are not standing in the right positions.
 * 
 *
 *
 * Runtime: 1 ms, faster than 97.81% of Java online submissions for Height
 * Checker. 
 * Memory Usage: 33.8 MB, less than 100.00% of Java online submissions
 * for Height Checker.
 * 
 */
public class HeightChecker {
	public int heightChecker(int[] heights) {
		int[] sortedArray = heights.clone();
		Arrays.sort(sortedArray);

		int difference = 0;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != sortedArray[i])
				difference++;
		}
		return difference;
	}
}