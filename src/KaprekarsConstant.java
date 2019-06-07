import java.util.Arrays;

public class KaprekarsConstant {
	public static int aKaprekarsConstant(int num) {
		int counter = 0;
		int result = num;
		
		while(result != 6174) {
			int[] arr = getArrayOfInt(result);
			int ascending = sortIntAscending(arr);
			int descending = sortIntDescinding(arr);
			result = Math.abs(ascending-descending);
			counter++;
		}
		return counter;
	}

	public static int[] getArrayOfInt(int num) {
		int thisNum = num;
		int[] r = new int[4];
		for (int i = 0; i < r.length; i++) {
			if (thisNum < 10)
				r[i] = thisNum;
			else
				r[i] = thisNum % 10;
			thisNum = thisNum / 10;
		}
		return r;
	}

	public static int sortIntAscending(int[] arr) {
		Arrays.sort(arr);
		String r = "";
		for(int c : arr) {
			r += c;
		}
		return Integer.valueOf(r);
	}

	public static int sortIntDescinding(int[] arr) {
		Arrays.sort(arr);
		int[] result = new int[4];
		int index = 3;
		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[index];
			index--;
		}
		String r = "";
		for(int c : result) {
			r += c;
		}
		return Integer.valueOf(r);
	}

	public static void main(String[] args) {
		System.out.println(aKaprekarsConstant(7847));
	}
}
