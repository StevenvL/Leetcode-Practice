/**
 * Given a sorted array consisting of only integers where every element appears
 * exactly twice except for one element which appears exactly once. Find this
 * single element that appears only once.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: [1,1,2,3,3,4,4,8,8] Output: 2 Example 2:
 * 
 * Input: [3,3,7,7,10,11,11] Output: 10 O(N) run time and O(1) space
 * 
 * Still need to figure out how to get O(log n) runtime
 *
 */
public class FindNonDupe {
	public int singleNonDuplicate(int[] nums) {
		int total = 0;
		for (int c : nums) {
			total = total ^ c;
		}
		return total;
	}
}
