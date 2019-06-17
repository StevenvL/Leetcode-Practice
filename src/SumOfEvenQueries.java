
public class SumOfEvenQueries {
	public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int[] result = new int[A.length];

		for (int i = 0; i < queries.length; i++) {
			int toAdd = queries[i][0];
			int indexToAddTo = queries[i][1];

			A[indexToAddTo] = A[indexToAddTo] + toAdd;
			addToResult(A, result, i);
		}
		return result;
	}

	public static void addToResult(int[] A, int[] result, int index) {
		int total = 0;
		for(int currentInt : A) {
			if(currentInt%2 == 0)
				total += currentInt;
		}
		result[index] = total;
	}
}
