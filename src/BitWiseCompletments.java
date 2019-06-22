
public class BitWiseCompletments {
	public int bitwiseComplement(int N) {
		String complement = Integer.toBinaryString(N);
		StringBuilder s = new StringBuilder();
		s.append(complement);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0')
				s.setCharAt(i, '1');
			else if (s.charAt(i) == '1')
				s.setCharAt(i, '0');
		}
		complement = s.toString();
		return Integer.valueOf(Integer.parseInt(complement, 2));
	}

	public static int findbitwise(int n) {
		String toBits = Integer.toBinaryString(n);
		int allOnes = Integer.parseInt(toBits.replaceAll("0", "1"), 2);	
		return allOnes^n;
	}

	public static void main(String[] args) {
		System.out.println(findbitwise(7));
	}
}
