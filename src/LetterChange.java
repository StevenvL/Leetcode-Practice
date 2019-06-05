
public class LetterChange {
	public static String LetterChanges(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			char currentLetter = str.charAt(i);
			if ((currentLetter > 64 && currentLetter < 91) || (currentLetter > 96 && currentLetter < 123)) {
				char nextLetter = (char) (currentLetter + 1);
				if (nextLetter == 91)
					nextLetter = (char) (currentLetter - 25);
				if (nextLetter == 123)
					nextLetter = (char) (currentLetter - 25);

				temp += nextLetter;
			} else
				temp += currentLetter;
		}

		String result = "";
		for (int i = 0; i < temp.length(); i++) {
			char currentLetter = temp.charAt(i);
			result += vowelToUpperCase(currentLetter);
		}

		return result;

	}

	public static char vowelToUpperCase(char c) {
		char[] vowelList = { 'a', 'e', 'i', 'o', 'u' };
		for (char letter : vowelList) {
			if (c == letter)
				c = Character.toUpperCase(c);
		}
		return c;
	}

	public static void main(String[] args) {
		String s = "hello*3";
		System.out.println(LetterChanges(s));
	}
}
