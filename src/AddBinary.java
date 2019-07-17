
public class AddBinary {
	//https://leetcode.com/problems/add-binary/
	public static String addBinary(String a, String b) {
		//Uses built in functions, does not work for large numbers.
		long tempA = Long.valueOf(a, 2);
		long tempB = Long.valueOf(b,2);
		long result = tempA + tempB;
		return new String(Long.toBinaryString(result));
	}
	
	public static String addBinary2(String a, String b) {
		//This should work for numbers of all sizes
		//Runtime: 2 ms, faster than 64.43% of Java online submissions for Add Binary.
		//Memory Usage: 36.4 MB, less than 99.92% of Java online submissions for Add Binary.
	
		StringBuilder sb = new StringBuilder("");
		int i = a.length()-1;
		int j = b.length()-1;
		int carry = 0;
		
		while(i >= 0 || j >= 0) {
			int sum = carry;
			if(j >= 0) sum += b.charAt(j--) - '0';
			if(i >= 0) sum += a.charAt(i--) - '0';
			sb.append(sum%2);
			carry = sum/2;
		}
		if(carry != 0)
			sb.append(carry);
		return new String(sb.reverse());
	}
	
	public static void main (String[] args) {
		String a = "11";
		String b = "10";
		long startTime = System.nanoTime();
		System.out.println(addBinary2(a,b));
		long endTime = System.nanoTime();

		System.out.println("That took " + (endTime - startTime) + " milliseconds");
	}
}
