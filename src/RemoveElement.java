
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int returnLength = 0;		
		
		for(int i : nums) {
			if(i == val)
				returnLength++;
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == val) {
				for(int k = i+1; k < nums.length; k++) {
					if(nums[k] != val) {
						nums[i] = nums[k];
						nums[k] = val;
						break;
					}
				}
				returnLength++;
			}
		}
		return nums.length - returnLength;
	}
	
	
	public int removeElement2(int[] nums, int val) {
		int i = 0;
		int counter = 0;
		for(int j = 0; j < nums.length; j++) {
			if(nums[j] != val) {
				nums[i] = j;
				counter++;
			}
		}
		return counter;
	}
}