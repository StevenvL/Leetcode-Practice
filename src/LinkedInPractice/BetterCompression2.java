package LinkedInPractice;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author stevenluu
 * Will attempt to solve BetterCompression problem using an Array.
 */
public class BetterCompression2 {
	public static void main(String[] args) {
		String s = "a12c56a1b5";
		System.out.println(betterCompression(s));
	}
	
	public static String iterateHmap(HashMap<Character, Integer> hmapToPrint) {
		String result = "";
		for (Entry<Character, Integer> entry : hmapToPrint.entrySet()) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			result = result + key + value;
		}
		return result;
	}

	public static String betterCompression(String s) {
		HashMap<Character, Integer> hmap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				String currentValue = "";
				int isNumberIndex = i + 1;

				while (isNumberIndex + 1 <= s.length() && Character.isDigit(s.charAt(isNumberIndex))) {
					currentValue += s.charAt(isNumberIndex);
					isNumberIndex++;
				}

				if (hmap.containsKey(s.charAt(i))) {
					int valueOfCurrentLetterInHMap = hmap.get(s.charAt(i));
					int total = valueOfCurrentLetterInHMap + Integer.parseInt(currentValue);
					hmap.put(s.charAt(i), total);
				} else
					hmap.put(s.charAt(i), Integer.parseInt(currentValue));
			}
		}
		return iterateHmap(hmap);
	}

}
