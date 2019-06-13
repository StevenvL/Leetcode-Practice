import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CommonCharacters {
	public static List<String> commonChars(String[] A) {
		ArrayList<HashMap<Character, Integer>> db = new ArrayList<HashMap<Character, Integer>>();
		List<String> result = new ArrayList<>();

		// Fills out ArrayList of HashMaps
		// Each Hashmap contains the characters and the amount of times that character
		// appears in that String.
		for (int i = 0; i < A.length; i++) {
			HashMap<Character, Integer> currentHashMap = new HashMap<>();
			String currentWord = A[i];
			for (int j = 0; j < currentWord.length(); j++) {
				Character currentLetter = currentWord.charAt(j);
				if (currentHashMap.containsKey(currentLetter))
					currentHashMap.replace(currentLetter, currentHashMap.get(currentLetter) + 1);
				else
					currentHashMap.put(currentLetter, 1);
			}
			db.add(currentHashMap);
		}
		System.out.println(db.toString());
		

		// Compare the first Hashmap to all the others.
		HashMap<Character, Integer> firstHash = db.get(0);
		for(Character c : firstHash.keySet()) {
			boolean inAll = true;
			int numberOfDupes = firstHash.get(c);
			
			for(HashMap<Character, Integer> currentHash : db) {
				if(currentHash.containsKey(c)) {
					numberOfDupes = Math.min(numberOfDupes, currentHash.get(c));
				}
				else
					inAll = false;
			}
			if(inAll) {
				for(int i = 0; i < numberOfDupes; i++) {
					result.add(c.toString());
				}
			}
		}
		return result;
	}
	
	public static void main (String[] args) {
		String[] a = {"bella","label","roller"};
		System.out.println(commonChars(a).toString());
	}
}