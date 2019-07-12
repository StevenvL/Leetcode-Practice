import java.util.Arrays;

public class moveZeros {
	public static void moveZerosToEnd(int[] nums) {
		int pointer = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				int temp = nums[pointer];
				nums[pointer] = nums[i];
				nums[i] = temp;
				pointer++;
			}
		}
	}
	
	
	public static void main (String[] args) {
		int[] a = {0,1,0,0,0,0,55,123,4,0,3,12};
		moveZerosToEnd(a);
		System.out.println(Arrays.toString(a));
	}
}
