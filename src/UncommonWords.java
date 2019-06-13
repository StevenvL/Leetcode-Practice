import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UncommonWords {
	public static String[] uncommonFromSentences(String A, String B) {
		String[] a = A.split(" ");
		String[] b = B.split(" ");
		HashMap<String, Integer>  tempA = new HashMap<>();
		HashMap<String, Integer>  tempB = new HashMap<>();
		
		for(String word : a) {
			if(tempA.containsKey(word))
				tempA.put(word, tempA.get(word)+1);
			else
				tempA.put(word, 1);
		}
		for(String word : b) {
			if(tempB.containsKey(word))
				tempB.put(word, tempB.get(word)+1);
			else
				tempB.put(word, 1);
		}

		ArrayList<String> result = new ArrayList<>();
		for(String word : tempA.keySet()) {
			if(tempA.get(word) == 1 && tempB.containsKey(word) == false)
				result.add(word);
		}
		for(String word : tempB.keySet()) {
			if(tempB.get(word) == 1 && tempA.containsKey(word) == false)
				result.add(word);
		}
		return result.toArray(new String[0]);
	}
	
	public static void main (String[] args) {
		String A = "apple apple";
		String B = "bananna";
		System.out.println(Arrays.toString(uncommonFromSentences(A,B)));
	}
}
