import java.util.Stack;

public class DailyTemps {
	public int[] dailyTemperatures(int[] T) {
		int[] result = new int[T.length];
		result[T.length - 1] = 0;

		for (int i = 0; i < T.length - 1; i++) {
			int count = 1;
			for (int j = i + 1; j < T.length; j++) {
				if (T[i] < T[j]) {
					result[i] = count;
					break;
				} else
					count++;
			}
		}
		return result;
	}

	// Online Answer
	public static int[] dailyTempss(int[] T) {
		Stack<Integer> stack = new Stack<>();
		int[] ret = new int[T.length];
		for (int i = 0; i < T.length; i++) {
			while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
				int idx = stack.pop();
				System.out.println(idx);
				ret[idx] = i - idx;
			}
			stack.push(i);
		}
		return ret;
	}
	
	public static void main (String[] args) {
		int[]T = {73,74,75,71,69,72,76,73};
		dailyTempss(T);
	}
}
