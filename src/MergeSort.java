import java.util.Arrays;

public class MergeSort {

	public static int[] mergeSort(int[] a) {
		if (a.length < 2)
			return a;
		int mid = a.length / 2;
		int[] left = new int[a.length/2];
		int[] right = new int[a.length - mid];
		System.arraycopy(a, 0, left, 0, left.length);
		System.arraycopy(a, mid, right, 0, right.length);
		
		
		left = mergeSort(left);
		right = mergeSort(right);
		return merge(left, right);
	}

	public static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		
		int lIndex = 0;
		int rIndex = 0;
		int k = 0;
		
		while(lIndex < left.length && rIndex < right.length) {
			if(left[lIndex] < right[rIndex]) {
				result[k] = left[lIndex];
				k++;
				lIndex++;
			}
			else {
				result[k] = right[rIndex];
				k++;
				rIndex++;
			}
		}
		
		while(lIndex < left.length) {
			result[k] = left[lIndex];
			k++;
			lIndex++;
		}
		while(rIndex < right.length) {
			result[k] = right[rIndex];
			k++;
			rIndex++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] res = { 6, 5, 1, 2, 3, 4, 7, 8, 9, 10 };
		System.out.println(Arrays.toString(mergeSort(res)));
	}
}
