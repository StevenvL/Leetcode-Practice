
public class BinaryGapBetween1s {
	public static int binaryGap(int N) {
		if (Integer.bitCount(N) <= 1)
			return 0;
		String n = Integer.toBinaryString(N);
		System.out.println(n);
		int largestGap = 0;
		
		for(int i = 0; i < n.length(); i++) {
			if(n.charAt(i) == '1') {
				int count = 0;
				for(int j = i+1; j <n.length(); j++) {
					count++;
					if(n.charAt(j) == '1') {
						if(count > largestGap) {
							largestGap = count;
						}
						count = 0;
					}
				}
			}
		}
	
		return largestGap;
	}
	
	
	
	
	public static void main (String[] args) {
		int N = 22;
		System.out.println(binaryGap(N));
	}
}
