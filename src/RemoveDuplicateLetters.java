/**
 * Given a string S of lowercase letters, a duplicate removal consists of
 * choosing two adjacent and equal letters, and removing them.
 * 
 * We repeatedly make duplicate removals on S until we no longer can.
 * 
 * Return the final string after all such duplicate removals have been made. It
 * is guaranteed the answer is unique.
 * 
 **/

public class RemoveDuplicateLetters {
	public static String removeDuplicates(String S) {
		String temp = S;
		boolean hasDupe = hasDupe(S);
		
		while(hasDupe == true) {
			for (int i = 0; i < temp.length() - 1; i++) {
				if (temp.charAt(i) == temp.charAt(i + 1)) {
					temp = temp.substring(0, i) + temp.substring(i + 2);
					hasDupe = hasDupe(temp);
				}
			}
		}
		return temp;
	}

	public static boolean hasDupe(String s) {
		boolean hasDupe = false;
		for (int i = 0; i < s.length() -1; i++) {
			if (s.charAt(i) == s.charAt(i + 1))
				hasDupe = true;
		}
		return hasDupe;
	}

	public static void main(String[] args) {
		String s = "aaaaaaaa";
		System.out.println(removeDuplicates(s));
	}
}
