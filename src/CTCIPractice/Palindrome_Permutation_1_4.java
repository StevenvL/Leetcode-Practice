package CTCIPractice;

import java.util.Arrays;

public class Palindrome_Permutation_1_4 {
	public static boolean checkPalindrome(String str) {
		str = str.replaceAll("\\s","");
		int[] c_arr = new int[128];

		for (int i = 0; i < str.length(); i++) {
			c_arr[str.charAt(i)] += 1;
		}
		if (str.length() % 2 == 0) {
			for (int current : c_arr) {
				if (current % 2 == 1)
					return false;
			}
		}
		
		int oneCount = 0;
		if (str.length() % 2 == 1) {
			for (int current : c_arr) {
				if(oneCount >1)
					return false;
				if(current%2 ==1)
					oneCount++;
			}
		}
		return true;
	}
	
	public static void main (String[] args) {
		String str = "aab";
		System.out.println(checkPalindrome(str));
	}
}
