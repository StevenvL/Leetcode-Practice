import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hmap.containsKey(target - nums[i]))
				return new int[] { hmap.get(target - nums[i]), i };
			else
				hmap.put(nums[i], i);
		}
		System.out.println(hmap);
		return new int[] { -1, -1 };

	}

	public static void main(String[] args) {
		int[] nums = { 2,2 };
		int target = 4;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
}
