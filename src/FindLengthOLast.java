
public class FindLengthOLast {
	// https://leetcode.com/problems/length-of-last-word/submissions/
	/**
	 * Runtime: 1 ms, faster than 46.66% of Java online submissions for Length of Last Word. 
	 * Memory Usage: 35.6 MB, less than 100.00% of Java online submissions for Length of Last Word.
	 */
	public static int lengthOfLastWord(String s) {
		if (s.equals(" ") || s.length() < 1)
			return 0;
		String[] temp = s.split(" ");
		if (temp.length < 1)
			return 0;
		if (temp.length < 2 && !Character.isLetter(temp[0].charAt(0)))
			return 0;
		else
			return temp[temp.length - 1].length();

	}

	public static void main(String[] args) {
		String s = "a";// ans = 1;
		String s2 = " "; // ans = 0;
		String s3 = ""; // ans =???
		System.out.println(s3.length());
		System.out.println(lengthOfLastWord(s3));
	}
}
