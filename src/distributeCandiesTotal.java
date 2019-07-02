import java.util.Arrays;

public class distributeCandiesTotal {
	public static int[] distributeCandies(int candies, int num_people) {
		int[] result = new int[num_people];
		int rowComplete = 0;

		while (candies > 0) {
			for (int i = 0; i < result.length; i++) {
				if (1 + rowComplete <= candies) {
					result[i] = result[i] + 1 + rowComplete;
					candies = candies - rowComplete - 1;
					rowComplete++;
				} else {
					result[i] = result[i] + candies;
					candies = 0;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int candies = 10;

		int numPeople = 3;
		System.out.println(Arrays.toString(distributeCandies(candies, numPeople)));
	}
}
