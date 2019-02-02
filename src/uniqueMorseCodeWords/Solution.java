package uniqueMorseCodeWords;

import java.util.*;

public class Solution {
	public int uniqueMorseRepresentations(String[] words) {
		Set<String> uniqueWords = new TreeSet<>();
		ArrayList<String> alphabet = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i",
				"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));

		ArrayList<String> morseCode = new ArrayList<>(Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
				"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
				"...-", ".--", "-..-", "-.--", "--.."));

		for (String currentWord : words) { // For each word in the array.
			String translatedWord = "";

			for (int i = 0; i < currentWord.length(); i++) { // For each letter in the string.
				translatedWord = translatedWord
						+ translateStringToX(Character.toString(currentWord.charAt(i)), alphabet, morseCode);
			}
			uniqueWords.add(translatedWord);
		}
		return uniqueWords.size();
	}

	public String translateStringToX(String wordToTranslate, ArrayList<String> original, ArrayList<String> translated) {
		int indexOfOriginalInTranslated = original.indexOf(wordToTranslate);
		return translated.get(indexOfOriginalInTranslated);
	}

	public static void main(String args[]) {
		Solution tester = new Solution();
		String[] words = { "gin", "zen", "gig", "msg" };
		System.out.println(tester.uniqueMorseRepresentations(words));
	}
}
