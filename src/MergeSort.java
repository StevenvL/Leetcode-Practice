import java.util.Arrays;

public class MergeSort {

	public static int[] mergeSort(int[] a) {
		if(a.length < 2) {
			return a;
		}
	
		int mid = a.length/2;
		int[] lArr = new int[mid];
		int[] rArr = new int[a.length-mid];

		System.arraycopy(a, 0, lArr, 0, lArr.length);
		System.arraycopy(a, mid, rArr, 0, rArr.length);
		
		lArr = mergeSort(lArr);
		rArr = mergeSort(rArr);
		
		return doMergeSort(lArr,rArr);
		
	}
	
	public static int[] doMergeSort(int[] lArr, int[] rArr) {
		int[] result = new int[lArr.length + rArr.length];
		int left = 0;
		int right = 0;
		int k = 0;
		
		
		while(left < lArr.length && right <rArr.length) {
			if(lArr[left] < rArr[right]) {
				result[k] = lArr[left];
				left++;
				k++;
			}
			else {
				result[k] = rArr[right];
				right++;
				k++;
			}
		}
		
		while(left < lArr.length) {
			result[k] = lArr[left];
			left++;
			k++;
		}
		
		while(right < rArr.length) {
			result[k] = rArr[right];
			right++;
			k++;
		}
		return result;
	}
	
	public static void main (String [] args) {
		int[] res = {6,5,1,2,3,4,7,8,9,10};
		System.out.println(Arrays.toString(mergeSort(res)));
	}
}
