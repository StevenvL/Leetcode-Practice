import java.util.ArrayList;
import java.util.Arrays;

public class ReshapeMatrix {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int[][] result = new int[r][c];
		if (nums.length * nums[0].length != r * c)
			return nums;

		ArrayList<Integer> holder = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				holder.add(nums[i][j]);
			}
		}

		int index = 0;
		for (int k = 0; k < result.length; k++) {
			for (int l = 0; l < result[0].length; l++) {
				result[k][l] = holder.get(index);
				index++;
			}
		}
		return result;
	}
}