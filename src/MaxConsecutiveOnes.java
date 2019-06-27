
public class MaxConsecutiveOnes {
	  public int findMaxConsecutiveOnes(int[] nums) {
	        int largest = 0;
	        int tempLargest = 0;
	        for(int i = 0; i < nums.length; i++) {
	            if(nums[i] == 1) {
	                tempLargest++;
	                largest = Math.max(largest, tempLargest);
	            }
	            else
	                tempLargest = 0;
	        }
	        return largest;
	    }
	}