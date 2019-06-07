import java.util.Scanner;

/**
 * 
 * Have the function LongestWord(sen) take the sen parameter being passed and
 * return the largest word in the string. If there are two or more words that
 * are the same length, return the first word from the string with that length.
 * Ignore punctuation and assume sen will not be empty.
 *
 */
public class LargestWord {
	public static String LongestWord(String sen) { 
		  String longestWord = "";
		  int longestLength = 0;
		  String currentWord = "";
		  int currentLength = 0;
		  
		  for(int i = 0; i < sen.length(); i++) {
			  char currentLetter = sen.charAt(i);
			  if (Character.isLetter(currentLetter) || Character.isDigit(currentLetter)) {
				  currentWord += currentLetter;
				  currentLength++;
				  //System.out.println(currentWord + "      " + "length: " + currentLength);
			  }
			  if (i == sen.length()-1 || !((Character.isLetter(currentLetter) || Character.isDigit(currentLetter)))) {
				  if(currentLength > longestLength) {
					  longestWord = currentWord;
					  longestLength = currentLength;
				  }
				  currentWord = "";
				  currentLength = 0;
			  }
		  }
	       
	    return longestWord;
	    
	  }
	
	public static String largestWordPart2(String sen) {
		String[] result = sen.split("[^A-Z|^a-z|^0-9]"); //Split by anything except alphabet and numbers.
		int largest = 0;
		String largestWord = "";
		for(String s : result) {
			if(s.length() > largest) {
				largestWord = s;
				largest = s.length();
			}
		}
		return largestWord;
	}
	
	public static void main (String[] args) {
		String s  = "Argument Goes Here 1234566777777712313";
	    System.out.print(LongestWord(s)); 
	}
}
