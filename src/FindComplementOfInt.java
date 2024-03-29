/**
 * Given a positive integer, output its complement number. The complement
 * strategy is to flip the bits of its binary representation.
 * 
 * Note: The given integer is guaranteed to fit within the range of a 32-bit
 * signed integer. You could assume no leading zero bit in the integer’s binary
 * representation. 
 * Example 1: 
 * Input: 5 
 * Output: 2 
 * Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010.
 * So you need to output 2. 
 * 
 * Example 2: 
 * Input: 1 
 * Output: 0 
 * Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is
 * 0. So you need to output 0.
 *
 */
public class FindComplementOfInt {
	public static int findComplement(int num) {
		String complement = Integer.toBinaryString(num);
		StringBuilder s = new StringBuilder();
		s.append(complement);

		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '0')
				s.setCharAt(i, '1');
			else if(s.charAt(i) == '1')
				s.setCharAt(i, '0');
		}
		complement = s.toString();
		return Integer.valueOf(Integer.parseInt(complement, 2));
	}
	
	public static void main (String[] args) {
		findComplement(5);
	}
}
