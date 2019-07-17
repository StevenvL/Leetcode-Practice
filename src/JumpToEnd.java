
public class JumpToEnd {
	// https://leetcode.com/problems/jump-game/
	//int[] a = {3, 2, 1, 0 , 4};
	/*
	 * CurMax = 3;
	 * math.max(curMax, i + 2) curMax !< i (i = 1)
	 * math.max(curMax, i + 1) curMax !< i (i = 2)
	 * math.max(curMax, i + 0) curMax !< i (i = 3)
	 * math.max(curMax, i + 4) curMax < i ( i =4)
	 * 			Thus return false;
	 */
	public static boolean canJump(int[] arr) {
		int curMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (curMax < i)
				return false;
			if (curMax >= arr.length)
				return true;

			curMax = Math.max(curMax, i + arr[i]); // Greedy
		}
		return true;
	}
}
