
public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int first = 0;
		int sec = 0;
		int i = 0;
		int[] temp2 = Arrays.copyOf(nums1, m);

		while (first < m && sec < n) {
			if (temp2[first] < nums2[sec]) {
				nums1[i] = temp2[first];
				first++;
				i++;
			} else {
				nums1[i] = nums2[sec];
				sec++;
				i++;
			}
		}

		while (first < m) {
			nums1[i] = temp2[first];
			first++;
			i++;
		}

		while (sec < n) {
			nums1[i] = nums2[sec];
			sec++;
			i++;
		}

	}
}
