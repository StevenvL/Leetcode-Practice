package LinkedInPractice;


/**
 * @author stevenluu 
 * Solves BetterCompression using an Array
 */
public class BetterCompression2 {
	public static void main(String[] args) {
		String s = "a12c56a1b5";
		System.out.println(betterCompression(s));
	}
	
	/**
	 * Returns the index location for a certain character
	 * ex) A will return the 0th location, Z will return the 25th location.
	 * 
	 * @param c is a character to be converted to a index of the array
	 * @return the index of the character
	 */
	public static int getIndexOfChar(char c) {
		return c - 'a';
	}
	
	/**
	 * Will convert a number between 0 and 25 to the coresponding alphabetical letter.
	 * ex) 0 = a, 25 = z
	 * 
	 * @param i is an int to be converted to a letter of the alphabet
	 * @return a letter of the alphabet
	 */
	private static String getCharOfNumber(int i) {
	    return i >= 0 && i < 26 ? String.valueOf((char)(i + 'a')) : null;
	}

	
	public static String iterateArray(int[] arr) {
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				result += getCharOfNumber(i) + arr[i];
			}
		}
		return result;
	}

	public static String betterCompression(String s) {
		int[] amountOfDupes = new int[26];

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				String currentValue = "";
				int isNumberIndex = i + 1;

				while (isNumberIndex + 1 <= s.length() && Character.isDigit(s.charAt(isNumberIndex))) {
					currentValue += s.charAt(isNumberIndex);
					isNumberIndex++;
				}
				// Adds the number of duplicates to the correct index using the getIndexOfChar().
				amountOfDupes[getIndexOfChar(s.charAt(i))] += Integer.parseInt(currentValue); 
			}
		}
		return iterateArray(amountOfDupes);
	}
	
}
