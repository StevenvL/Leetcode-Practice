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
		if(s.length() = 1)
			return "IMPOSSIBLE";
		else {
			
		}
	}
	
	public static int calculateLexicograph(String s) { 
		int result = 0;
		for(int i = 0; i < s.length(); i++) {
			result += s.charAt(i);
		}
		return result;
	}
	public static void main (String args[]) {
		String s1 = "aaa";  //should return IMPOSSIBLE
		String s3 = "aba";
		String s2 = "acca"; //should return aaca
		System.out.println(calculateLexicograph(s1));
		System.out.println(calculateLexicograph(s3));
	}
}
