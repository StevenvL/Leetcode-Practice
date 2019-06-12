import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * We have a collection of rocks, each rock has a positive integer weight.
 * 
 * Each turn, we choose the two heaviest rocks and smash them together. Suppose
 * the stones have weights x and y with x <= y. The result of this smash is:
 * 
 * If x == y, both stones are totally destroyed; If x != y, the stone of weight
 * x is totally destroyed, and the stone of weight y has new weight y-x. At the
 * end, there is at most 1 stone left. Return the weight of this stone (or 0 if
 * there are no stones left.)
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: [2,7,4,1,8,1] Output: 1 Explanation: We combine 7 and 8 to get 1 so
 * the array converts to [2,4,1,1,1] then, we combine 2 and 4 to get 2 so the
 * array converts to [2,1,1,1] then, we combine 2 and 1 to get 1 so the array
 * converts to [1,1,1] then, we combine 1 and 1 to get 0 so the array converts
 * to [1] then that's the value of last stone.
 *
 */
public class SmashingStones {
	public static int lastStoneWeight(int[] stones) {
		List<Integer> result = new ArrayList<>();
		for (int i : stones) {
			result.add(i);
		}

		while (result.size() > 1) {
			Collections.sort(result);
			int lastIndex = result.size() - 1;
			int beforeLastIndex = lastIndex - 1;

			if (result.get(lastIndex) == result.get(beforeLastIndex)) {
				if (result.size() == 2) {
					result.remove(lastIndex);
					result.set(0, 0);
				} else {
					result.remove(result.size() - 1);
					result.remove(result.size() - 1);
				}
			} else {
				int temp = Math.abs(result.get(lastIndex) - result.get(beforeLastIndex));
				result.remove(result.size() - 1);
				result.set(result.size() - 1, temp);
			}
			System.out.println(result);
		}

		return result.get(0);
	}

	public static void main(String[] args) {
		int[] stones = { 7,6,7,6,9 };
		System.out.println(lastStoneWeight(stones));
	}
}
