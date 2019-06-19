/**
 * Given a positive integer, check whether it has alternating bits: namely, if
 * two adjacent bits will always have different values.
 * 
 * Example 1: 
 * Input: 5 
 * Output: True 
 * Explanation: The binary representation of 5 is: 101 
 * 
 * Example 2: 
 * Input: 7 
 * Output: False 
 * Explanation: The binary representation of 7 is: 111. 
 * 
 * Example 3: 
 * Input: 11 
 * Output: False 
 * Explanation:
 * The binary representation of 11 is: 1011.
 * 
 */
public class AlternatingBits {
	public static boolean hasAlternatingBits(int n) {
		String r = Integer.toBinaryString(n);
		boolean hasAlt = true;
		System.out.println(r);
		for(int i = 0; i < r.length()-1; i++) {
			if(r.charAt(i) == r.charAt(i+1)) {
				hasAlt = false;
			}
		}
		return hasAlt;
	}
	public static void main(String[] args) {
		hasAlternatingBits(7);
	}
}
