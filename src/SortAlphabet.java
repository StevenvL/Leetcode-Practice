import java.util.Arrays;

public class SortAlphabet {
	public static String AlphabetSoup(String str) { 
		 char[] result = new char[str.length()];
		 for(int i = 0; i <str.length(); i++) {
			 result[i] = str.charAt(i);
 		 }
		 Arrays.sort(result);
		 return new String(result);
	}
	
	public static void main (String[] args) {
		System.out.println(AlphabetSoup("yoop"));
	}
}
