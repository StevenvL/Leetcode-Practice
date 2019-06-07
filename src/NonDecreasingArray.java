import java.util.ArrayList;
import java.util.Arrays;

public class NonDecreasingArray {
	public static boolean checkPossibility(int[] nums) {
		
		if(nums.length == 1)
			return true;
		
		ArrayList<int[]> perm =  new ArrayList<int[]>();
		for(int i = 1; i < nums.length; i++) {
			int[] alt1 = nums.clone();
			int[] alt2 = nums.clone();
			if(nums[i-1] > nums[i]) {
				alt1[i-1] = alt1[i] - 1;
				alt2[i] = alt2[i-1] + 1;
			}
			perm.add(alt1);
			perm.add(alt2);
		}
		boolean isInc = false;
		for(int[] current : perm) {
			boolean currentArray = true;
			for(int i = 0; i < current.length-1; i++) {
				if(current[i] > current[i+1])
					currentArray = false;
			}
			if(currentArray == true)
				isInc = true;
		}
		return isInc;
	}
	
	/** Correct Way
	 *  public static boolean checkPossibility(int[] nums) {
        boolean replaced = false;
        for (int i = 1; i < nums.length - 1; i++) {
            if (!replaced && nums[i - 1] > nums[i]) {
                if (nums[i + 1] < nums[i - 1]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
                replaced = true;
                i = 1;
            }
            if (replaced && (nums[i - 1] > nums[i] || nums[i + 1] < nums[i])) {
                return false;
            }
        }
        return true;
    }

	 */
	public static void main (String[] args) {
		int[] nums = {3,4,2,3}; // should return false;
		int[] nums2  = {2,3,3,2,4}; //should return true;
		int[] nums3 = {4,2,3}; // should return true;
		System.out.println(Arrays.toString(nums));
	//	System.out.println(checkPossibility(nums));
	//	System.out.println(checkPossibility(nums2));
	//	System.out.println(checkPossibility(nums3));
	}
}
