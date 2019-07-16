
public class SearchInsertPosition {
	//https://leetcode.com/problems/search-insert-position/
	public static int searchInsert(int[] nums, int target) {
		if(target <= nums[0])
			return 0;
		if(target > nums[nums.length-1])
				return nums.length;
		int index = binarySearch(nums, target, 0, nums.length);
		return index;
	}
	
	public static int binarySearch(int[] arr, int target, int start, int end) {
		int mid = (start + end)/2;
		System.out.println("target: " + target + " current start,end:" + start + "," + end);
		if(end-start == 1)
			return end;
		
		if(arr[mid] == target) {
			System.out.println("target found: " + target);
			return mid;
		}
		else if(arr[mid] > target) {
			return binarySearch(arr,target,0, mid);
		}
		else
			return binarySearch(arr,target, mid, end);
	}
	
	public static void main (String[] args) {
		int[]nums = {1};
		int target = 1;
		System.out.println(searchInsert(nums,target));
	}
}