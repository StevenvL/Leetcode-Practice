import java.util.Arrays;

public class findCharDifference {
	public static char findTheDifference(String s, String t) {
		int[] charArr = new int[26];

		for (int i = 0; i < s.length(); i++) {
			charArr[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < t.length(); i++) {
			charArr[t.charAt(i) - 'a']--;
			if (charArr[t.charAt(i) - 'a'] < 0)
				return t.charAt(i);
		}
		return '0';
}
	
	
	//Idea from leetcode discussion
	public static char findTheDifference2(String s, String t) {
		int charResult = t.charAt(t.length()-1);
		
		for(int i = 0; i < s.length(); i++) {
			charResult -= s.charAt(i);
			charResult += t.charAt(i);
		}
		return (char) charResult;
	}

	public static void main(String[] args) {
		String a = "abcd";
		String b = "abcde";
		System.out.println(findTheDifference2(a, b));

	}
}