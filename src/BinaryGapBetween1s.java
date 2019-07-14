
public class BinaryGapBetween1s {
	public static int binaryGap(int N) {
		if (Integer.bitCount(N) <= 1)
			return 0;
		String n = Integer.toBinaryString(N);
		System.out.println(n);
		int largestGap = 0;

		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == '1') {
				int count = 0;
				for (int j = i + 1; j < n.length(); j++) {
					count++;
					if (n.charAt(j) == '1') {
						if (count > largestGap) {
							largestGap = count;
						}
						count = 0;
					}
				}
			}
		}

		return largestGap;
	}

	public static int binaryGap2(int N) { // basically check 1's as they come out.
		int res = 0;
		for (int d = -32; N > 0; N /= 2, d++) {
			if (N % 2 == 1) {
				res = Math.max(res, d);
				d = 0;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int N = 22;
		System.out.println(binaryGap2(N));
	}
}
