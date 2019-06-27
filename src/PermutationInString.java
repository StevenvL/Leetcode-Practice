import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
	public static boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length())
			return false;

		char[] c1 = s1.toCharArray();
		Arrays.sort(c1);
		String s1Sorted = new String(c1);

		for (int i = 0; i <= s2.length() - s1.length(); i++) {
			String s2Sub = s2.substring(i, i + s1.length());

			char[] c2 = s2Sub.toCharArray();
			Arrays.sort(c2);
			String s2Sorted = new String(c2);

			if (s1Sorted.equals(s2Sorted))
				return true;
		}
		return false;
	}

	public static boolean checkInclusion2(String s1, String s2) { // Uses sliding window
		if (s1.length() > s2.length())
			return false;

		int[] s1Permutations = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			s1Permutations[s1.charAt(i) - 'a']++;
		}

		int maxLength = s2.length() - s1.length() + 1;

		for (int i = 0; i < maxLength; i++) { //Goes through the whole s2 string
			//Everytime create a new int[] which is the window we are currently looking at.
			int[] s2PermutationCheck = new int[26];
			String s2Window = s2.substring(i, i + s1.length());
			
			//Fill out the int[] which is the window.
			for (int j = 0; j < s2Window.length(); j++) {
				s2PermutationCheck[s2Window.charAt(j) - 'a']++;
			}
			//If s1Permuations == s2PermutationCheck 
			if (Arrays.equals(s1Permutations, s2PermutationCheck))
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		String s1 = "ea";
		String s2 = "dffedgadgadgadsgadga";

		System.out.println(checkInclusion2(s1, s2));
	}
}
