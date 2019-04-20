package LinkedInPractice;

public class BreakPalindrome {
	/**
	 * Convert a palindrome to not a palindrome
	 * It should change it to the least lexiogrhpaically thing possible ex aba -> aaa instead of aza
	 * If impossible to create it lower ex aaa -> is the lowest, it should return IMPOSSIBLE
	 * 
	 * @param s String to be converted
	 */
	public static String breakPalindrome(String s) {
		return "IMPOSSIBLE";
	}
	
	public static void main (String args[]) {
		String s1 = "aaa";  //should return IMPOSSIBLE
		String s2 = "acca"; //should return aaca
	}
}
