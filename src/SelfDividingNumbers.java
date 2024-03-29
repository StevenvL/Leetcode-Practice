import java.util.ArrayList;
import java.util.List;

/**
 * A self-dividing number is a number that is divisible by every digit it
 * contains.
 * 
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 ==
 * 0, and 128 % 8 == 0.
 * 
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * 
 * Given a lower and upper number bound, output a list of every possible self
 * dividing number, including the bounds if possible.
 * 
 * Example 1: Input: left = 1, right = 22 Output: [1, 2, 3, 4, 5, 6, 7, 8, 9,
 * 11, 12, 15, 22]
 *
 */
public class SelfDividingNumbers {
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			if (isSelfDividing(i) == true)
				list.add(i);
		}

		return list;
	}

	public static boolean isSelfDividing(int number) {
		boolean result = true;
		int original = number;
		while(number > 0) {
			int currentNumber = number % 10;
			if (currentNumber == 0 || original % currentNumber != 0)
				result = false;
			number = number/10;
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> result = selfDividingNumbers(1, 22);
		System.out.println(result.toString());
	}
}
