/**
 * Have the function LetterCapitalize(str) take the str parameter being passed
 * and capitalize the first letter of each word. Words will be separated by only
 * one space.
 *
 */
public class LetterCapitalize {
	public static String aLetterCapitalize(String str) {
		String result = "";
		
		if (str.length() == 0)
			return str;
		if (str.length() == 1)
			return Character.toString(Character.toUpperCase(str.charAt(0)));
		
		else
			result += Character.toUpperCase(str.charAt(0));
			for (int i = 1; i < str.length(); i++) {
				char prevChar = str.charAt(i-1);
				char currentChar = str.charAt(i);
				if(Character.isWhitespace(prevChar))
					result += Character.toUpperCase(currentChar);
				else
					result += currentChar;
			}

		return result;

	}

	public static void main(String[] args) {
		System.out.print(aLetterCapitalize("yooooooo hi"));
	}
}
