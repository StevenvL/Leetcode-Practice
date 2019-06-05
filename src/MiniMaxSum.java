import java.util.Arrays;

public class MiniMaxSum {
	public static void miniMaxSumProblem(int[] arr) {
		Arrays.sort(arr);
		int min = 0;
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i < 4)
				min += arr[i];
			if(i >= 1)
				max += arr[i];
		}
		System.out.print(min);
		System.out.print(max);
	}
	
	public static void main (String[] args) {
		int[] arr = {1,2,3,4,5};
		miniMaxSumProblem(arr);
	}
}
