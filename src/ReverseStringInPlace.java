import java.util.Arrays;

/**
 * Write a function that reverses a string. The input string is given as an
 * array of characters char[].
 * 
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * You may assume all the characters consist of printable ascii characters.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: ['h","e","l","l","o"] Output: ["o","l","l","e","h"] Example 2:
 * 
 * Input: ["H","a","n","n","a","h"] Output: ["h","a","n","n","a","H"]
 *
 *
 * USING RECURSION
 * 
 */
public class ReverseStringInPlace {
	public static void reverseString(char[] s) {
      	helperRecursive(s, 0);
	}

	public static void helperRecursive(char[] s, int currentIndex) {
		if (currentIndex >= (s.length) / 2 || s.length <= 1)
			return;
        int reversedIndex = s.length - currentIndex - 1;
		char reversedChar = s[reversedIndex];

		s[reversedIndex] = s[currentIndex];
		s[currentIndex] = reversedChar;
		helperRecursive(s, currentIndex+1);
	}
	
	public static void main (String[] args) {
		//String t = "hello world";
		//char[] c = t.toCharArray();
		char[] c = {'A',' ','m','a','n',',',' ', 'a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
		reverseString(c);
		System.out.println(Arrays.toString(c));
		
	}
	
}
