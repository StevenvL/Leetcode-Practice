import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class RelativeSortArray {
	// https://leetcode.com/problems/relative-sort-array/
	// Given two arrays. Arr2 contains unique values which is a subset from arr1.
	// Resulting array should have "x" amount of values in arr1 and those that are
	// not in arr2 are inserted at the end.
	// resulting int[] will be the same size as arr1;
	// Runtime: 3 ms, faster than 45.72% of Java online submissions for Relative
	// Sort Array.
	// Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for
	// Relative Sort Array.

	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
		LinkedHashMap<Integer, Integer> hmap2 = new LinkedHashMap<>();
		TreeMap<Integer, Integer> treemap = new TreeMap<>();
		int[] res = new int[arr1.length];

		// Put arr2 into LinkedHashMap first to ensure order.
		for (int a : arr2) {
			if (hmap2.containsKey(a))
				hmap2.put(a, hmap2.get(a) + 1);
			else
				hmap2.put(a, 1);
		}

		// Adds all of arr1, updating count if inside, otherwise it will be added to the
		// end.
		// int length : resulting int[] will be the same size as arr1;

		for (int a : arr1) {
			if (hmap2.containsKey(a))
				hmap2.put(a, hmap2.get(a) + 1);
			else {
				if (treemap.containsKey(a)) {
					treemap.put(a, treemap.get(a) + 1);
				} else
					treemap.put(a, 1);
			}
		}

		int index = 0;
		for (Integer val : hmap2.keySet()) {
			int upto = hmap2.get(val);
			if (upto > 1)
				upto--;
			for (int i = 0; i < upto; i++) {
				res[index] = val;
				index++;
			}
		}
		for (Integer val : treemap.keySet()) {
			for (int i = 0; i < treemap.get(val); i++) {
				res[index] = val;
				index++;
			}
		}

		return res;

	}

	public static int[] relativeSorting(int[] A, int[] B) {
		/**
		 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Relative
		 * Sort Array. 
		 * Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Relative Sort Array.
		 */
		int[] counter = new int[1001];
		int[] res = new int[A.length];
		int largestNumA = 0;
		for (int a : A) {
			counter[a]++;
			largestNumA = Math.max(largestNumA, a);
		}

		int index = 0;
		for (int b : B) {
			for (int i = 0; i < counter[b]; i++) {
				res[index] = b;
				index++;
			}
			counter[b] = 0;
		}

		for (int i = 0; i <= largestNumA; i++) {
			for (int j = 0; j < counter[i]; j++) {
				res[index] = i;
				index++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] a = { 28, 6, 22, 8, 44, 17 };
		int[] b = { 22, 28, 8, 6 };
		System.out.println(Arrays.toString(relativeSortArray(a, b)));
		System.out.println(Arrays.toString(relativeSorting(a, b)));

	}
}
