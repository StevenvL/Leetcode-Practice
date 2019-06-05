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
			  if ((currentLetter > 64 && currentLetter < 91) || (currentLetter > 96 && currentLetter < 123)) {
				  currentWord += currentLetter;
				  currentLength++;
				  //System.out.println(currentWord + "      " + "length: " + currentLength);
			  }
			  if (!Character.isLetter(currentLetter) || i == sen.length()-1) {
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
	
	public static void main (String[] args) {
		System.out.println(LongestWord("123456789 98765432"));
	}
}