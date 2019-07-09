import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyBoardRows {
	public static String[] findWords(String[] words) {
		String row1 = "qwertyuiopQWERTYUIOP";
		String row2 = "asdfghjklASDFGHJKL";
		String row3 = "zxcvbnmZXCVBNM";
		char[] r1 = row1.toCharArray();
		char[] r2 = row2.toCharArray();
		char[] r3 = row3.toCharArray();
		ArrayList<Character> r1a = toArrayList(r1);
		ArrayList<Character> r2a = toArrayList(r2);
		ArrayList<Character> r3a = toArrayList(r3);

		
		ArrayList<String> res = new ArrayList<>();
		
		for(String word : words) {
			if(isWordInRow(word,r1a)) {
				res.add(word);
			}
			
			if(isWordInRow(word,r2a)) {
				res.add(word);
			}
			
			if(isWordInRow(word,r3a)) {
				res.add(word);
			}
			
		}
		return res.toArray(new String[res.size()]);
	}
	
	public static ArrayList<Character> toArrayList(char[] arr) {
		ArrayList<Character> res = new ArrayList<>();
		for(char c : arr)
			res.add(c);
		return res;
	}
	
	public static boolean isWordInRow(String word, ArrayList<Character> row) {
		for(int i = 0; i < word.length(); i++) {
			if(!row.contains(word.charAt(i)))
				return false;
		}
		return true;
	}
	
	public static void main (String[] args ) {
		String[] a = {"Hello","Alaska","Dad","Peace"};
		String[] res = findWords(a);
		System.out.println(Arrays.toString(res));
	}
}
